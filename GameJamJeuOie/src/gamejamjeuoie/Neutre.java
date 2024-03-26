/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;
import java.util.ArrayList;
import java.util.Random;



/**
 * @author Elève
 */
public class Neutre extends Evenement {
        private ArrayList<String> nomsNeutres;

    public Neutre() {
        super(); // Appel du constructeur de la classe mère Evenement
        nomsNeutres = new ArrayList<>();
        nomsNeutres.add("hahaha c'est les vacances, pas de point!!!");
        nomsNeutres.add("hahaha  c'est la pause café, pas de point!!!");
        nomsNeutres.add("hahaha  un jour férié, pas de point");
        Random rand = new Random();
        int choix = rand.nextInt(nomsNeutres.size());
        String nomNeutre = nomsNeutres.get(choix);
        super.nom=nomNeutre;
    }

   
    public String toString() {
       return (super.nom);
    }
    

}
