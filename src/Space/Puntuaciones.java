/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Space;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Puntuaciones {

    PrintWriter fich;
    String nomefich = "Puntuaciones.txt";
    Scanner sc;
    ArrayList<Usuario> usu = new ArrayList();

    public void añadir(String nom, int punt) {

        try {
            fich = new PrintWriter(new FileWriter(new File(nomefich), true));
            sc = new Scanner(new File(nomefich));

            Usuario u = new Usuario(nom, punt);
            usu.add(u);
            fich.println(u);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fich.close();
            sc.close();
        }

    }

    public void ordenar() {

        String linea;
        String delim = ",";
        usu = new ArrayList();
        try {
            sc = new Scanner(new File(nomefich)).useDelimiter(delim);
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                String[] u = linea.split(",");
                for (int i = 0; i < u.length; i += 2) {
                    usu.add(new Usuario(u[i], Integer.parseInt(u[i + 1])));
                }
            }
            Collections.sort(usu);
            sc.close();
            File f = new File(nomefich);
            f.delete();
            f.createNewFile();
            fich = new PrintWriter(new FileWriter(new File(nomefich), true));
            for (int i = 0; i < usu.size(); i++) {
                fich.println(usu.get(i));
            }

        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fich.close();
            sc.close();
        }

    }

    public void resultados() {
        String linea;
        String delim = ",";
        usu = new ArrayList();
        String rank = "";
        try {
            sc = new Scanner(new File(nomefich)).useDelimiter(delim);
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                String[] u = linea.split(",");
                for (int i = 0; i < u.length; i += 2) {
                    usu.add(new Usuario(u[i], Integer.parseInt(u[i + 1])));
                }
            }
            for (int i = 0; i < usu.size(); i++) {
                rank = rank + ("Ranking " + (i + 1) + "---> " + "Nombre: " + usu.get(i).getNom() + " -->" + " Puntuacion= " + usu.get(i).getPuntuacion()) + "\n";
            }
            JOptionPane.showMessageDialog(null, rank, "Ranking", JOptionPane.INFORMATION_MESSAGE, null);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            sc.close();
        }

    }

}
