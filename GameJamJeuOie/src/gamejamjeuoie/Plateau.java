/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;

import java.util.ArrayList;

public class Plateau implements Listevent{
    ArrayList<Evenement> plateau=new ArrayList<>();
    ArrayList<String> questionDejaPose=new ArrayList<>();

    public Plateau() { //initialisation du plateau
        for(int i=0;i<32;i++){
            int alea = (int) (Math.random()*36);
        plateau.add(tabEvent[alea]);
                }
        ArrayList<Question> questionDejaPose = new ArrayList<Question>();
    }

    public ArrayList<Evenement> getPlateau() {
        return plateau;
    }
    
    public void setPlateau(ArrayList<Evenement> plateau) {
        this.plateau = plateau;
    }
    
    public Evenement get(int pos){
    return plateau.get(pos);
    }
    
    public boolean verifQuestion(String question){
        return(questionDejaPose.contains(question));
    }
}
