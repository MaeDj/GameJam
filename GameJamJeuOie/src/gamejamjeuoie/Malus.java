/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;

import java.util.Random;

/**
 *
 * @author Elève
 */
public class Malus extends Evenement {
    String phraseAleatoire;
    int points;

    public Malus(String nom) {
        super(nom);
        Random rand = new Random();
        int choix = rand.nextInt(4);
        if (choix == 0) {
            phraseAleatoire = "Tres bien, vous maitrisez votre cours ! ";
            points = 2;
        } else if (choix == 1) {
            phraseAleatoire = "Super, vous etes toujours present en cours ! ";
            points = 1;
        } else if(choix==2){
            phraseAleatoire = "Excellent, vous avez reussi votre semestre ! ";
            points = 5;
        }else{
            phraseAleatoire = "Bravo, vous avez participe à la GameJam ! ";
            points = 3;
        }
    }

    @Override
    public String toString() {
        return "" + phraseAleatoire  + nom + " +" + points + " points ."; 
    }
}
