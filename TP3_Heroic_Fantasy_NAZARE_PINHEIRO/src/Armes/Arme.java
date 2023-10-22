/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author anaza
 */
public abstract class Arme {
    String nom; 
    int niveauAttaque;
    


    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque<100){
            this.niveauAttaque = niveauAttaque;
        } else {
            System.out.println("le niveau d'attaque doit être inférieur à 100");
            this.niveauAttaque = 0;
        }
    }
    
    public int visualiserNiveauAttaque(){
        return niveauAttaque;
    }
    
    public String visualiserNom(){
        return nom;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveauAttaque=" + niveauAttaque + '}';
    }
    
    
}
