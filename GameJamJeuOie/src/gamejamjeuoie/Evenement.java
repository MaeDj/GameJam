/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;

/**
 *
 * @author Junior
 */
public abstract class Evenement {
    String nom;

    public Evenement(String nom) {
        this.nom = nom;
    }

    public abstract String toString();
}
