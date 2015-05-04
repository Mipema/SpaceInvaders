/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Space;

/**
 *
 * @author Miguel
 */
public class Bombas extends Disparo {

    public Bombas(int X, int Y) {
        super(X, Y);
    }

    public void dispEnemigo() {

        Y = Y + 9;

    }

}
