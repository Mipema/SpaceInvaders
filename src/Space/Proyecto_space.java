/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Space;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Proyecto_space {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Puntuaciones p = new Puntuaciones();

        int opc;
        do {
            opc = JOptionPane.showOptionDialog(
                    null, "Que quiere hacer?", "SPACE INVADERS", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                        "Jugar",
                        "High Scores",
                        "Exit"},
                    "Exit") + 1;

            switch (opc) {
                case 1:
                    MarcoVentana v = new MarcoVentana();
                    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    v.setVisible(true);
                    v.setTitle("SPACE INVADERS");
                    break;
                case 2:
                    p.ordenar();
                    p.resultados();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.exit(0);
            }
        } while (opc == 2);

    }

}
