/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;

public class Joueur {
    private int nbpoints,position;
    private boolean aUnBonus;

    public Joueur() {
        this.nbpoints = 0;
        this.position = 0;
        this.aUnBonus = false;
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

    public void setNbPt(int nbpoints) {
        this.nbpoints = nbpoints;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setaUnBonus(boolean aUnBonus) {
        this.aUnBonus = aUnBonus;
    }
}
