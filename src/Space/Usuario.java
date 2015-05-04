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
public class Usuario implements Comparable {

    private String nom;
    private int puntuacion;

    public Usuario(String nom, int puntuacion) {
        this.nom = nom;
        this.puntuacion = puntuacion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return nom + "," + puntuacion;
    }

    @Override
    public int compareTo(Object t) {
        Usuario u = (Usuario) t;
        if (this.puntuacion == u.puntuacion) {
            return 0;
        } else if (this.puntuacion < u.puntuacion) {
            return 1;
        } else {
            return -1;
        
    

}

}

}
