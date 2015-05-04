/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Space;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Miguel
 */
public class Victoria {

    private int X;
    protected int Y;

    private final Image victoria;

    Victoria(int x, int y) {
        this.X = x;
        this.Y = y;

        victoria = new ImageIcon(getClass().getResource("imagenes/win.png")).getImage();

    }

    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(victoria, X, Y, null);
    }
}
