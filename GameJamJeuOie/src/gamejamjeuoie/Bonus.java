
/**
 *
 * @author Elève
 */
import java.util.Random;

public class Bonus extends Evenement {
    String phraseAleatoire;
    int points;

    public Bonus(String nom) {
        super(nom);
        Random rand = new Random();
        int choix = rand.nextInt(4);
        if (choix == 0) {
            phraseAleatoire = "Tres bien, vous maitrisez votre cours ! ";
            points = 2;
        } else if (choix == 1) {
            phraseAleatoire = "Super, vous etes toujours present en cours ! ";
            points = 1;
        } else if(choix==2){
            phraseAleatoire = "Excellent, vous avez reussi votre semestre ! ";
            points = 5;
        }else{
            phraseAleatoire = "Bravo, vous avez participe à la GameJam ! ";
            points = 3;
        }
    }

    @Override
    public String toString() {
        return "" + phraseAleatoire  + nom + " +" + points + " points ."; 
    }
}
