/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Space;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Miguel
 */
public class Avion {

    private Image avion;
    //Coordenadas del avion
    private int X;
    private int Y;

    //Velocidad desplazamiento avion
    private int velocidad_X = 12;

    //Limites para que no se salga por los lados
    private int limite_izquierda = 0;
    private int limite_derecha;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Avion(int x, int y) {

        this.X = x;
        this.Y = y;

        avion = new ImageIcon(getClass().getResource("imagenes/avion.png")).getImage();

    }

    public void LimitesXY(int width) {
        limite_derecha = width - avion.getWidth(null);

    }

    public void moveDer() {
        X += velocidad_X;

        if (X < this.limite_izquierda) {
            X = limite_izquierda;
            velocidad_X = 0;
        } else if (X > limite_derecha) {
            X = limite_derecha;
            velocidad_X = 12;

        }

    }

    public void moveIzq() {
        X -= velocidad_X;
        if (X < this.limite_izquierda) {
            X = 0;
            velocidad_X = 12;

        } else if (X > limite_derecha) {
            X = limite_derecha;
            velocidad_X = 0;

        }

    }

    /**
     * La clase Graphics es una clase abstracta que permite a la aplicacion
     * dibujar componentes e imagenes. En este caso graphics 2Desuna clase que
     * extiende de graphics que te da un mejor control sobre la geometria.*
     */
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(avion, X, Y, null);
    }

    // Obtiene un rectangulo que delimita el tamaño cogiendo su posicion , ancho y alto ---> el del avion en este caso 
    public Rectangle getBounds() {
        return new Rectangle(X, Y, avion.getWidth(null), avion.getHeight(null));
    }
}
