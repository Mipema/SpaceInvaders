package Space;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Miguel
 *
 */
public class Disparo {

    private int X;
    protected int Y;

    private int velocidad_Y = 10;
    private final Image disparo;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    Disparo(int x, int y) {
        this.X = x + 24;
        this.Y = y;

        disparo = new ImageIcon(getClass().getResource("imagenes/laser.png")).getImage();

    }

    public void moveDisparo() {
        Y -= velocidad_Y;

    }

    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(disparo, X, Y, null);

    }

    // Obtiene un rectangulo que delimita el tamaño ---> el disparo en este caso        
    public Rectangle getBounds() {
        return new Rectangle(X, Y, disparo.getWidth(null), disparo.getHeight(null));
    }
}
