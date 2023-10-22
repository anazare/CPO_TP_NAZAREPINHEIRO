/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author anaza
 */
public abstract class Personnage {
    String nom;
    int niveau_de_vie;
    Arme Arme_en_main = null;

    public Personnage(String nom, int niveau_de_vie) {
        this.nom = nom;
        this.niveau_de_vie = niveau_de_vie;
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
    
    
    ArrayList<Arme> listeArmesDuPerso = new ArrayList<>();
    // voir quel est le problème avec le prof, les armes ne s'ajoutent pas
    
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
        
            return "Votre personnage porte cette arme : "+ Arme_en_main;
        } else {
            return "Action impossible, votre personnage ne possède pas cette arme.";
        }
        
    }
    
    
    
}
