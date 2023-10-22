/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author anaza
 */
public class Magicien extends Personnage {
    String niveau;

    public Magicien(String nom,  int niveau_de_vie, String niveau) {
        super(nom, niveau_de_vie);
        this.niveau = niveau;
    }
    
       
    public boolean confirmé(){
        if (this.niveau=="novice"){
            return false;
        } else {
            return true;
        }
    }
    
    public void modifNiveau(String nouveauNiveau){
        this.niveau=nouveauNiveau;
    }

    public String lireNiveau(){
        return this.niveau;
    }
    
    
    
}
