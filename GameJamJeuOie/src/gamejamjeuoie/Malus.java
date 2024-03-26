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
    int points;

    public Malus(String nom) {
        super(nom);
        Random rand = new Random();
        int choix = rand.nextInt(4);
        if (choix == 0) {
           super.nom= "Tres bien, vous maitrisez votre cours ! ";
            points = 2;
        } else if (choix == 1) {
           super.nom = "Super, vous etes toujours present en cours ! ";
            points = 1;
        } else if(choix==2){
            super.nom = "Excellent, vous avez reussi votre semestre ! ";
            points = 5;
        }else{
            super.nom= "Bravo, vous avez participe à la GameJam ! ";
            points = 3;
        }
    }

    @Override
    public String toString() {
        return "" + super.nom+ " +" + points + " points ."; 
    }
}
