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
     *intialise la partie en mélangeant aléatoirement les lignes/colonnes ou diagonales du tableau 
     */
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(10);
    }
    
    /**
     *lance la partie de LightOff, ne se termine que lorque toutes les cellules sont éteintes. 
     * Le joueur doit activer des lignes/colonnes/diagonales pour gagner. 
     * @return nombres de coups pour gagner la partie 
     */
    public String lancerPartie (){
        System.out.println(grille);
        //affiche la grille à t0
        while (!grille.cellulesToutesEteintes()){
            //tant que la grille n'est pas completement éteinte le programme suivant tourne
            
            //on demande ensuite à l'utilisateur de choisir l'activation d'une ligne/colonne/diagonale 
            Scanner sc = new Scanner(System.in);
            System.out.println("Choisissez une action à réaliser : \n1) Activer une ligne\n2) Activer une colonne\n3) Activer une diagonale montante\n4) Activer une diagonale descendante");
            int choix_action =sc.nextInt(); 
            
            //si l'utilisateur à choisi d'activer une ligne, on lui demande laquelle
            switch (choix_action) {
                case 1:
                    System.out.println("Choisissez une ligne à activer : ");
                    int id_ligne = sc.nextInt();
                    //on modifie la ligne et on affiche la grille de jeu
                    grille.activerLigneDeCellules(id_ligne);
                    System.out.println(grille);
                    nbcoups++;
                    break;
                case 2:
                    System.out.println("Choisissez une colonne à activer : ");
                    int id_colonne = sc.nextInt();
                    //on modifie la colonne et on affiche la grille de jeu
                    grille.activerColonneDeCellules(id_colonne);
                    System.out.println(grille);
                    nbcoups++;
                    break;
                case 3:
                    System.out.println("Choisissez la diagonale montante à activer : ");
                    int id_diagM = sc.nextInt();
                    grille.activerDiagonaleMontante(id_diagM);
                    System.out.println(grille);
                    nbcoups++;
                    break;
                case 4:
                    System.out.println("Choisissez la diagonale descendante à activer : ");
                    int id_diagD = sc.nextInt();
                    grille.activerDiagonaleDescendante(id_diagD);
                    System.out.println(grille);
                    nbcoups++;
                    break;
            } 
        }
        return "Vous avez gagné la partie en "+nbcoups+" coups. ";
    }
    
    
    
}
