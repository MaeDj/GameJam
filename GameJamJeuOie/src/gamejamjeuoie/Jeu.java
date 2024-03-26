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
    Joueur j1;// le joueur qui joue 
    int de; // décide au hasard de combiens de cases va être avancé le Joueur 

    public void jeu() {
        boolean recommencer;
        System.out.println("----début de la partie----");
        for (int i = 0; i < plateau1.plateau.size(); i++) {
            System.out.println("Voici votre plateau ");
            System.out.println(plateau1); //creer la toString du plateau 
            Random ra = new Random();
            de = ra.nextInt();
            System.out.println("D'après le dé, Vous allez avancer de " + de);
            j1.avancer(de);//permet d'avancer le joueur du nombre de cases de ton dé
            System.out.println(plateau1.plateau.get(j1.position));
            if (plateau1.plateau.get(j1.position) instanceof Malus) {//si l'event est un malus

                Malus malus = (Malus) plateau1.plateau.get(j1.position);
                System.out.println(malus);
                j1.setNbPt(j1.getNbPt() - (plateau1.plateau.get(j1.position).pt));
            } else if (plateau1.plateau.get(j1.position) instanceof Bonus) {// si l'event est un bonus 

                Bonus bonus = (Bonus) plateau1.plateau.get(j1.position);
                System.out.println(bonus);
                j1.setNbPt(j1.getNbPt() + (plateau1.plateau.get(j1.position).pt));// on ajoute au joueur son nb de points 
            } else if (plateau1.plateau.get(j1.position) instanceof Question) {// si l'event est une question
                Question question = (Question) plateau1.plateau.get(j1.position);
                int nbPtGagneOuPerdu = question.poserQuestion();//on récupère avec la méthode posé question le nb de points gagnés ou perdus pour le joueur 
                if (j1.ptPlus && nbPtGagneOuPerdu > 0) {
                    System.out.println("Grace à votre précédente action vous remportez un point de plus à la question ");
                    j1.setnbPt(j1.getNbPt() + nbPtGagneOuPerdu + 1);
                    j1.ptPlus = false;
                } else {
                    j1.setnbPt(j1.getNbPt() + nbPtGagneOuPerdu);// nombre positif ou négatif 
                }

            } else if (plateau1.plateau.get(j1.position) instanceof Plus) {// si la case octroie un bonus au joueur sur la prichaine question 

                Plus plus = (Plus) plateau1.plateau.get(j1.position);
                System.out.println(plus);
                plus.ajouterPtPlus();//change le booleen de joueur en true 

            }
        }
        if (j1.getNbpoints() >= 10) {
            System.out.println("Vous avez remporté la partie! Le précieux diplôme est entre vos main!");
        } else {
            System.out.println("Vous n'avez pas 10 de moyenne, vous redoublez ");
            boolean fausserep = true;
            while (fausserep) {
                try {

                    System.out.println("Voulez vous redoubler ou changer d'établissement ? ");//recommencer la partie 
                    Scanner scan = new Scanner(System.in);
                    String rep = scan.nextLine();
                    if (rep.equals("n") || rep.equals("N")) {
                        recommencer = false;
                        fausserep = false;
                    } else if (rep.equals("o") || rep.equals("O")) {
                        recommencer = true;
                        fausserep = false;

                    } else {
                        System.out.println("L'administration et Mme Besse ne comprend pas votre requête, veuillez recommencer");

                    }
                } catch (Exception e) {
                    System.out.println("L'administration et Mme Besse ne comprend pas votre requête, veuillez recommencer");
                }
            }
        }

    }
}
