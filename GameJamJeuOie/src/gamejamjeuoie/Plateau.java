/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;

import java.util.ArrayList;

public class Plateau implements Listevent{
    ArrayList<Evenement> plateau;

    public Plateau() { //initialisation du plateau
        for(int i=0;i<32;i++){
        plateau.add(tabEvent[i]);
                }
    }
    
    @Override
    public String toString(){ //méthode pour afficher le plateau
        String s = plateau.get(0).toString();
        for(int i=1;i<32;i++){
            s=s.concat(plateau.get(i).toString());
            }
        return s;
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
}
