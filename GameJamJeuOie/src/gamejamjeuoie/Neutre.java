/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamejamjeuoie;



 * @author Elève
 */
public class Neutre extends Evenement {
    public Neutre(String nom){
        super(nom);
    }

    @Override
    void declencher() {
        System.out.println("C'est un événement neutre : " + nom);
    }

}
