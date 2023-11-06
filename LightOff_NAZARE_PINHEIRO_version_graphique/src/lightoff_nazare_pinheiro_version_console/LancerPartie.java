/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_nazare_pinheiro_version_console;

import java.util.Scanner;

/**
 *
 * @author anaza
 */
public class LancerPartie {
    String difficulte;
    
    /**
     * constructeur de la classe partie en fonction de la difficulté.
     * @param difficulte
     */
    public LancerPartie(String difficulte) {
        this.difficulte=difficulte;
    }
    
    /**
     *lance une partie, fixe la taille de la grille de jeu, affiche un message de victoire. 
     */
    public void lancer_partie (){
        
        switch (this.difficulte) {
            case "facile":
            {
                GrilleDeJeu matrice = new GrilleDeJeu(3,3);
                Partie partie = new Partie(matrice);
                partie.initialiserPartie();
                partie.lancerPartieFacile();
                System.out.print(partie.lancerPartieFacile());
                break;
            }
            case "moyenne":
            {
                GrilleDeJeu matrice = new GrilleDeJeu(4,3);
                Partie partie = new Partie(matrice);
                partie.initialiserPartie();
                partie.lancerPartieMoyenne();
                System.out.print(partie.lancerPartieMoyenne());
                break;
            }
            case "difficile":
            {
                GrilleDeJeu matrice = new GrilleDeJeu(4,4);
                Partie partie = new Partie(matrice);
                partie.initialiserPartie();
                partie.lancerPartieDifficile();
                System.out.print(partie.lancerPartieDifficile());
                break;
            }
        }
        
    
    
}
}

