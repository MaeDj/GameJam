/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;

import java.util.Scanner;

public class Joueur {
    private int nbpoints,position;
    private boolean aUnBonus;
    private String nom;

    public Joueur() {
        this.nbpoints = 0;
        this.position = 0;
        this.aUnBonus = false;
        System.out.println("Entrez votre nom");
        Scanner lectureClavier = new Scanner(System.in);
        nom=lectureClavier.next();
    }
    
    public void avancer(int dé){ //méthode pour faire avancer le joueur (modifier sa position)
    this.position+=dé;
    }

    public int getNbPt() {
        return nbpoints;
    }

    public int getPosition() {
        return position;
    }

    public boolean isaUnBonus() {
        return aUnBonus;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public void setaUnBonus(boolean aUnBonus) {
        this.aUnBonus = aUnBonus;
    }

    public int getNbpoints() {
        return nbpoints;
    }

    public void setNbPt(int nbpoints) {
        this.nbpoints = nbpoints;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
