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
            points = -1;
        } else if (choix == 1) {
           super.nom = " Vous n'avez pas  fait vos exercices ! Alors vous allez prendre vos affaires et rentrez chez vous ! ";
            points = -2;
        } else if(choix==2){
            super.nom = " Ohlala! C'est inadmissible vous êtiez absent au cours ! ";
            points = -4;
        }else{
            super.nom= "Vous avez raté votre semestre ! Ça va mal finir pour vous !  ";
            points = -100;
        }
    }

    @Override
    public String toString() {
        return "" + super.nom+ " +" + points + " points ."; 
    }
}
