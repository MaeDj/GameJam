/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mae
 */
public class Jeu implements Listevent {

    Plateau plateau1; // le plateau sur lequel on joue 
    Joueur j1 = new Joueur();// le joueur qui joue 
    int de, i; // décide au hasard de combiens de cases va être avancé le Joueur 

    public void jeu() {
        boolean recommencer = true;
        while (recommencer) {
            System.out.println("----début de la partie----");
            j1.setNbPt(0);
            j1.setPosition(0);
            plateau1 = new Plateau();
            i = 0;
            while (i < plateau1.plateau.size()) {
                System.out.println("Voici votre plateau ");
                System.out.println(this); //creer la toString du plateau 
                de = (int)(Math.random()*5)+1;
                System.out.println("D'après le dé, Vous allez avancer de " + de);
                j1.avancer(de);//permet d'avancer le joueur du nombre de cases de ton dé
                i += de;
                if(i>=plateau1.plateau.size())
                break;
                if (plateau1.get(j1.getPosition()) instanceof Malus) {//si l'event est un malus

                    Malus malus = (Malus) plateau1.get(j1.getPosition());
                    System.out.println(malus);
                    j1.setNbPt(j1.getNbPt() + (malus.points));
                } else if (plateau1.get(j1.getPosition()) instanceof Bonus) {// si l'event est un bonus 

                    Bonus bonus = (Bonus) plateau1.get(j1.getPosition());
                    System.out.println(bonus);
                    j1.setNbPt(j1.getNbPt() + (bonus.points));// on ajoute au joueur son nb de points 
                } else if (plateau1.get(j1.getPosition()) instanceof Question) {// si l'event est une question
                    Question question = (Question) plateau1.get(j1.getPosition());
                    int nbPtGagneOuPerdu = question.poserQuestion();//on récupère avec la méthode posé question le nb de points gagnés ou perdus pour le joueur 
                if (j1.isaUnBonus() && nbPtGagneOuPerdu > 0) {
                    System.out.println("Grace à votre précédente action vous remportez un point de plus à la question ");
                    j1.setNbPt(j1.getNbPt() + nbPtGagneOuPerdu + 1);
                    j1.setaUnBonus(false);
                } else {
                    j1.setNbPt(j1.getNbPt() + nbPtGagneOuPerdu);// nombre positif ou négatif 
                }

                } else if (plateau1.get(j1.getPosition()) instanceof Plus) {// si la case octroie un bonus au joueur sur la prichaine question 

                    Plus plus = (Plus) plateau1.get(j1.getPosition());
                    System.out.println(plus);
                    j1.setaUnBonus(true);//change le booleen de joueur en true 

                }
                if(j1.getNbPt()<0)
                    j1.setNbPt(0);
                if(j1.getNbPt()>20)
                    j1.setNbPt(20);
            }
            System.out.println("Vous avez "+j1.getNbPt()+" points");
            if (j1.getNbPt() >= 10)
                System.out.println("Bravo " + j1.getNom() + " ! Vous avez remporté la partie! Le précieux diplôme est entre vos main!");
            else 
                System.out.println("Vous n'avez pas 10 de moyenne, vous redoublez ");
                    try {

                        System.out.println("Voulez vous redoubler ou changer d'établissement ? ");//recommencer la partie 
                        Scanner scan = new Scanner(System.in);
                        String rep = scan.nextLine();
                        if (rep.equals("n") || rep.equals("N")) {
                            recommencer = false;
                        } else if (rep.equals("o") || rep.equals("O")) {
                            recommencer = true;

                        } else {
                            System.out.println("L'administration et Mme Besse ne comprend pas votre requête, veuillez recommencer");

                        }
                    } catch (Exception e) {
                        System.out.println("L'administration et Mme Besse ne comprend pas votre requête, veuillez recommencer");
                    }
                }
    }

    @Override
    public String toString() { //méthode pour afficher le plateau
        String s = "=> ";
        for (int j = 0; j < 32; j++) {
            if (j == j1.getPosition()) {
                s = s.concat(" " + String.valueOf(j + 1) + "J ");
            } else {
                s = s.concat(" " + String.valueOf(j + 1) + " ");
            }
            if (j == 8 || j == 16 || j == 24) {
                s = s.concat("\n=>");
            }
        }
        return s;
    }
}
