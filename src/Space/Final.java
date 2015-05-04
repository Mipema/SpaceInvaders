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
public class Final {

    private int X;
    protected int Y;

    private final Image derrota;

    Final(int x, int y) {
        this.X = x;
        this.Y = y;

        derrota = new ImageIcon(getClass().getResource("imagenes/gameover.jpg")).getImage();

    }

    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(derrota, X, Y, null);
    }
}
