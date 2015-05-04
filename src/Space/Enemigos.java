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
public class Enemigos {

    private int X;
    private int Y;
    private int velocidad_X = 7;
    private int limite_izquierda = 0;
    private int limite_derecha = 1200 - 30;
    private final Image enemigos;
    Panel p = new Panel();

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int setX() {
        return X;
    }

    public int setY() {
        return Y;
    }

    public int getVelocidad_X() {
        return velocidad_X;
    }

    public void setVelocidad_X(int velocidad_X) {
        this.velocidad_X = velocidad_X;
    }

    public Enemigos(int x, int y, String tipoenemigo) {

        this.X = x;
        this.Y = y;

        enemigos = new ImageIcon(getClass().getResource(tipoenemigo)).getImage();
    }

    public void moveEnemigo() {

        X += velocidad_X;

        if (X < this.limite_izquierda) {

            X = limite_izquierda;
            velocidad_X = -velocidad_X;
            Y = Y + 7;

        } else if (X > limite_derecha) {

            X = limite_derecha;

            velocidad_X = -velocidad_X;

        }

    }

    public void moveEnemigoDerrota() {

        velocidad_X = 0;
        Y = Y + 5;

    }

    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(enemigos, X, Y, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(X, Y, enemigos.getWidth(null), enemigos.getHeight(null));
    }
}
