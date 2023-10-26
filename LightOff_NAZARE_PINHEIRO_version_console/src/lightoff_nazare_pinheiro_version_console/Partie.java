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
public class Partie {
    GrilleDeJeu grille;
    int nbcoups;

    /**
     * Construit la partie LightOff
     * @param grille
     */
    public Partie(GrilleDeJeu grille) {
        this.grille = grille;
        nbcoups=0;
    }
    
    /**
     *intialise la partie en m�langeant al�atoirement les lignes/colonnes ou diagonales du tableau 
     */
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(10);
    }
    
    /**
     *lance la partie de LightOff, ne se termine que lorque toutes les cellules sont �teintes. 
     * Le joueur doit activer des lignes/colonnes/diagonales pour gagner. 
     * @return nombres de coups pour gagner la partie 
     */
    public String lancerPartie (){
        System.out.println(grille);
        //affiche la grille � t0
        while (!grille.cellulesToutesEteintes()){
            //tant que la grille n'est pas completement �teinte le programme suivant tourne
            //on demande ensuite � l'utilisateur de choisir l'activation d'une ligne/colonne/diagonale 
            Scanner sc = new Scanner(System.in);
            System.out.println("Choisissez une action � r�aliser : \n1) Activer une ligne\n2) Activer un colonne\n3) Activer la diagonale montante\n4) Activer la diagonale descendante");
            int choix_action =sc.nextInt(); 
            //si l'utilisateur � choisi d'activer une ligne, on lui demande laquelle
            if (choix_action==1){
                System.out.println("Choisissez une ligne � activer : ");
                int id_ligne = sc.nextInt();
                //on modifie la ligne et on affiche la grille de jeu 
                grille.activerLigneDeCellules(id_ligne);
                System.out.println(grille);
                nbcoups++;
            } 
            //si l'utilisateur choisi d'activer une colonne, on lui demande laquelle 
            if (choix_action==2){
                System.out.println("Choisissez une colonne � activer : ");
                int id_colonne = sc.nextInt();
                //on modifie la colonne et on affiche la grille de jeu
                grille.activerColonneDeCellules(id_colonne);
                System.out.println(grille);
                nbcoups++;
            } 
            //si l'utilisateur choisi de modifier la diagonale montante, on la modifie et on l'affiche. 
            if (choix_action==3){
                grille.activerDiagonaleMontante();
                System.out.println(grille);
                nbcoups++;
            } 
            //si l'utilisateur choisi de modifier la diagonale descendante , on la modifie et on l'affiche. 
            else {
                grille.activerDiagonaleDescendante();
                System.out.println(grille);
                nbcoups++;
            }
        }
        return "Vous avez gagn� la partie en "+nbcoups;
    }
    
    
    
}
