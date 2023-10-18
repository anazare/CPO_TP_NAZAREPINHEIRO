/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_nazare_pinheiro;

/**
 *
 * @author anaza
 */
public class Epee extends Arme{
    int indice;
    
    public Epee(String nom, int niveauAttaque, int indice){
        super(nom, niveauAttaque);
        indice=0;
        if (indice < 100){
            this.indice=indice;
        } else {
            System.out.println("erreur : l'indice doit être inférieur à 100");
            this.indice=0;
        }
    }
    
    
}
