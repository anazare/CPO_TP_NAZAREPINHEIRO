/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_nazare_pinheiro;

/**
 *
 * @author anaza
 */
public class Baton extends Arme {
        int age;
    
    public Baton(String nom, int niveauAttaque, int age){
        super(nom, niveauAttaque);
        if (age < 100){
            this.age=age;
        } else {
            System.out.println("erreur : l'age doit être inférieur à 100");
            this.age=0;
        }
    }
    
}