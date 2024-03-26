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
    
    public void avancer(){ //méthode pour faire avancer le joueur (modifier sa position)
    int dé = (int) Math.random()*6;
    this.position+=dé;
    }

    public int getNbpoints() {
        return nbpoints;
    }

    public int getPosition() {
        return position;
    }

    public boolean isaUnBonus() {
        return aUnBonus;
    }

    public void subitUnEvenement(Evenement event){ //méthode pour appliquer un evenement au joueur
        if(event instanceof Plus)
            this.aUnBonus=true;
        this.nbpoints+=event.provoquerevenement();
    }
}
