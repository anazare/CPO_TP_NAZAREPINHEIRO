/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_nazare_pinheiro;

/**
 *
 * @author anaza
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String a, String b, int c, Personne h){
        Modele=a;
        Marque=b;
        PuissanceCV=c;
        proprietaire = null;
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
    
}
