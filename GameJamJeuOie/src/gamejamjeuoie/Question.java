package gamejamjeuoie;

import java.util.Random;
import java.util.Scanner;

public class Question extends Evenement {
    private String[] matieres = {"Analyse", "Java", "Web"};
    private String[][][] questions = {
            { // Questions pour l'Analyse
                    {"Qu'est-ce qu'une dérivée ?", "Quelle est la dérivée de ln(x) ?", "Quelle est la dérivée de sin(x) ?"},
                    {"Quelle est l'intégrale de x^2 ?", "Quelle est l'intégrale de e^x ?", "Quelle est l'intégrale de 1/x ?"},
                    {"Qu'est-ce qu'une série convergente ?", "Quel est le critère de convergence d'une série alternée ?", "Qu'est-ce qu'un développement limité ?"}
            },
            { // Questions pour Java
                    {"Qu'est-ce qu'une classe en Java ?", "Quelle est la différence entre une classe abstraite et une interface ?", "Qu'est-ce que la surcharge de méthodes ?"},
                    {"Qu'est-ce qu'une exception en Java ?", "Quelle est la différence entre throw et throws ?", "Qu'est-ce que la gestion de la mémoire en Java ?"},
                    {"Qu'est-ce que le polymorphisme en Java ?", "Quelle est la différence entre == et equals() en Java ?", "Qu'est-ce que le Garbage Collector ?"}
            },
            { // Questions pour le Web
                    {"Qu'est-ce que HTML ?", "Quelle est la différence entre HTML et XHTML ?", "Qu'est-ce que CSS ?"},
                    {"Qu'est-ce que JavaScript ?", "Qu'est-ce qu'un événement en JavaScript ?", "Qu'est-ce que AJAX ?"},
                    {"Qu'est-ce que PHP ?", "Qu'est-ce que MySQL ?", "Qu'est-ce que RESTful API ?"}
            }
    };
    

    public Question() {
        
    }
}