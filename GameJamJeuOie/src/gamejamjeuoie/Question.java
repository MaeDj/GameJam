package gamejamjeuoie;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question extends Evenement {
    
   
    private ArrayList<String[]> questions=new ArrayList<>();
        
   
    

    public Question() {
        String[] test1={"Analyse:Quelle est la dérivée de ln(x) ?","1) 1/x","2) 42","3) f(x)","1"};
       questions.add(test1);
       
        String[] test2={"Analyse:Qu'est-ce qu'un développement limité ?", "1) Une série de Taylor", "2) Une série de Fourier","3) Une série de Maclaurin","4"};
       questions.add(test2);
       
        String[] test3={"Java: Par quoi commence une classe? ","1) Une majuscule","2) une minuscule","3) Un arc en ciel","1"};
       questions.add(test3);
       
        String[] test4={"Culture G: Quelle est la capitale de Singapour ?","1) Singapour","2) Paris ","3) LaValette","1"};
       questions.add(test4);
       
        String[] test5={"Base de donnée: Qu'est ce qu'un SGBD?","Super Génial Beautiful Délégué","un System de Gestion de Base de Donnée ","Une application ","2"};
       questions.add(test5);
       
        String[] test6={"Culture générale: A quelle année remonte les derniers JO en France","1) 2048","2) hier","3) 1924","3"};
       questions.add(test6);
       
        String[] test7={"Culture générale: de quel style sont le plupart des bâtiments à Nancy?","1)Géorgien","2)Hausmanien","3)Aucun","2"};
       questions.add(test7);
       
        String[] test8={"Automate: Est ce que (a+b)* contient tout les mots?","1)oui","2)non","3)peut etre ",""};
       questions.add(test8);
       
        String[] test9={"Math: identités remarquable a^2+b^2?","1) (a-b)^2+(a+b)^2","2) 0","3) (a+b)(a-b)","2"};
       questions.add(test9);
       
        String[] test10={"Culture générale: Quelle est la monnaie de Nancy?","1) Le florain","2) l'euro","3)Le dollar","1"};
       questions.add(test10);
       
       for(int i=0;i<10;i++){
           Random ra=new Random();
           int rep=ra.nextInt(9)+1;
           super.nom=questions.get(rep)[0];
          
        }
        
        
        
        
        
    }
}