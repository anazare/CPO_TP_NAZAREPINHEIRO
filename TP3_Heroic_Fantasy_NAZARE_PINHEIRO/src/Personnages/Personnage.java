/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
import java.util.logging.Logger;
import tp3_heroic_fantasy_nazare_pinheiro.etreVivant;

/**
 *
 * @author anaza
 */
public abstract class Personnage implements etreVivant {
    String nom;
    int niveau_de_vie;
    Arme Arme_en_main = null;
    public static int nb_perso;
    
    
    public void nb_personnages(){
        nb_perso = Magicien.nb_magiciens + Guerrier.nb_guerriers;
    }
    
    public Personnage(String nom, int niveau_de_vie) {
        this.nom = nom;
        this.niveau_de_vie = niveau_de_vie;
        nb_perso++;
    }
    
    public int lireNiveauVie() {
        return niveau_de_vie;
    }

    @Override
    public String toString() {
        if (Arme_en_main == null){
            return "Personnage{" + "nom=" + nom + ", niveau_de_vie=" + niveau_de_vie + '}';
        } else {
            return "Personnage{" + "nom=" + nom + ", niveau_de_vie=" + niveau_de_vie + ", arme en main="+ Arme_en_main +'}';
        }
    }
    
    public String lireNom() {
        return nom;
    }
   
    ArrayList<Arme> listeArmesDuPerso = new ArrayList<Arme>();
    
    public void ajouterArme(Arme arme){
        if (listeArmesDuPerso.size()<=5){
            listeArmesDuPerso.add(arme);
        }
    }
    
    public Arme lire_Arme_en_main(){
        return Arme_en_main;
    }
    
    public String EquiperPerso(Arme arme){
        if (listeArmesDuPerso.contains(arme)) {
            int i=0;
            while (arme != listeArmesDuPerso.get(i)){
                i++;
            }
            Arme_en_main=listeArmesDuPerso.get(i);
        
            return this.nom +" porte cette arme : "+ Arme_en_main;
        } else {
            return "Action impossible, votre personnage ne possède pas cette arme.";
        }
    }
    
    public String NbArmesDePredilection(){
        int nb=0;
        if (this instanceof Magicien){
            for (int j = 0; j<listeArmesDuPerso.size(); j++ ){
                if (listeArmesDuPerso.get(j) instanceof Baton){
                        nb++;
                    }
            }
        } if (this instanceof Guerrier) {
            for (int k = 0; k<listeArmesDuPerso.size(); k++ ){
                if (listeArmesDuPerso.get(k) instanceof Epee){
                    nb++;   
                }
            }
        }
        return this.nom + " posede "+nb+" armes de predilection";
    }
    
    public void finalize(){
        nb_perso--;
    }
    
    public void seFatiguer(){
        niveau_de_vie = niveau_de_vie-10;
    }
    
    public boolean estVivant(){
        
    }
    
    
}
