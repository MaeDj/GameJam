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
             super.nom= "Très bien, vous maitrisez votre cours ! +2 ";
            points = +2;
        } else if (choix == 1) {
            super.nom = "Monsieur Guibon vous remercie pour les litchis ! + 1";
            points = +1;
        } else if(choix==2){
            super.nom = "Vous n'avez pas oublié la majuscule à la classe avant de rendre à M.Castagnos ! +5 ";
            points = +5;
        }else{
            super.nom = "Bravo, vous avez participé à la GameJam ! +3 ";
            points = +3;
        }
    }

    @Override
    public String toString() {
        return "" + super.nom + " +" + points + " points ."; 
    }
}
