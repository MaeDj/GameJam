/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;

import java.util.Random;

/**
 *
 * @author mae
 */
public class Jeu implements Listevent  {
    Plateau plateau1; // le plateau sur lequel on joue 
    Joueur j1;// le joueur qui joue 
    int de; // décide au hasard de combiens de cases va être avancé le Joueur 
    public void jeu(){
        System.out.println("----début de la partie----");
        System.out.println("Voici votre plateau ");
        System.out.println(plateau1); //creer la toString du plateau 
        Random ra=new Random(); 
        de=ra.nextInt();
        System.out.println("D'après le dé, Vous allez avancer de "+de);
        j1.avancerJoueur(de,plateau1);//permet d'avancer le joueur du nombre de cases de ton dé
        System.out.println(plateau1.plateau.get(j1.position));
    }
}
