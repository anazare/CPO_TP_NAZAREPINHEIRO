/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_nazare_pinheiro_version_console;

/**
 *
 * @author anaza
 */
public class Partie {
    GrilleDeJeu grille;
    int nbcoups;

    public Partie(GrilleDeJeu grille) {
        this.grille = grille;
        nbcoups++;
    }
    
    public void initialiserPartie(){
        this.grille.melangerMatriceAleatoirement(10);
    }
    
    public GrilleDeJeu lancerPartie (){
        System.out.println(grille);
        while (grille.cellulesToutesEteintes()!=true){
            
        }
        return grille;
    }
    
    
    
}
