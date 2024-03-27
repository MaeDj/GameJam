package gamejamjeuoie;
/**
 *
 * @author Elève
 */
import java.util.Random;

public class Bonus extends Evenement {
    
    int points;

    public Bonus() {
        Random rand = new Random();
        int choix = rand.nextInt(4);
        if (choix == 0) {
             super.nom= "Très bien, vous maitrisez votre cours ! ";
            points = 2;
        } else if (choix == 1) {
            super.nom = "Monsieur Guibon vous remercie pour les litchis ! ";
            points = 1;
        } else if(choix==2){
            super.nom = "Excellent, vous avez réussi votre semestre ! ";
            points = 5;
        }else{
            super.nom = "Bravo, vous avez participé à la GameJam ! ";
            points = 3;
        }
    }

    @Override
    public String toString() {
        return "" + super.nom + " +" + points + " points ."; 
    }
}
