/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_nazare_pinheiro;

/**
 *
 * @author anaza
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures=0;
    Voiture [] liste_voitures;
    
    public Personne(String d, String e, int f){
        nom=d;
        prenom=e;
        nbVoitures=f;
        liste_voitures = new Voiture[3];
    }
    public boolean ajouter_voiture(Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.proprietaire!= null){
            System.out.println("voiture volée !!");
        }
        if (this.nbVoitures>=3){
            return false;
        }
        else {
            liste_voitures[nbVoitures]= voiture_a_ajouter;
            nbVoitures++;
            voiture_a_ajouter.proprietaire=this;
            return true;
        }
    }
        
    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
}
