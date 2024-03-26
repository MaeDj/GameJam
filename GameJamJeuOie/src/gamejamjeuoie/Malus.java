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

    public Malus() {
        Random rand = new Random();
        int choix = rand.nextInt(4);
        if (choix == 0) {
           super.nom= " Ah Zut!, Vous êtes arrivé en retard au cours ! ";
            points = -2;
        } else if (choix == 1) {
           super.nom = " Vous n'avez pas  fait vos exercices ! ";
            points = -3;
        } else if(choix==2){
            super.nom = " Vous êtiez absent au cours  ";
            points = -5;
        }else{
            super.nom= "Oups, vous avez redoublé  ! ";
            points = -100;
        }
    }

    @Override
    public String toString() {
        return "" + super.nom+ " +" + points + " points ."; 
    }
}
