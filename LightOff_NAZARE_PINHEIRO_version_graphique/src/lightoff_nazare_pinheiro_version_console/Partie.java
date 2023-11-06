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
    String difficulte;
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
    public String lancerPartieFacile (){
        System.out.println(grille);
        
        //affiche la grille à t0
        while (!grille.cellulesToutesEteintes()){
            //tant que la grille n'est pas completement éteinte le programme suivant tourne
            
            nbcoups++; // on implémente le nb de coups joués
            
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
                    break;
                    
                case 2:
                    System.out.println("Choisissez une colonne à activer : ");
                    int id_colonne = sc.nextInt();
                    //on modifie la colonne et on affiche la grille de jeu
                    grille.activerColonneDeCellules(id_colonne);
                    System.out.println(grille);
                    break;
                    
                case 3:
                    System.out.println("Voulez vous activer une diagonale montante supérieure : ");
                    sc.nextLine();
                    String infOUsup = sc.nextLine();
                    if (!"".equals(infOUsup)){
                        System.out.println("Choisissez le numéro de la colonne de la diagonale montante à activer : ");
                        int id_diagM = sc.nextInt();
                        grille.activerDiagonaleMontante(id_diagM,infOUsup);
                        System.out.println(grille);
                        break;
                    }
                    
                case 4:
                    System.out.println("Voulez vous activer une diagonale descendante supérieure : ");
                    sc.nextLine();
                    String infOusup = sc.nextLine();
                    if (!"".equals(infOusup)){
                        System.out.println("Choisissez le numéro de la colonne de la diagonale descendante à activer : ");
                        int id_diagD = sc.nextInt();
                        grille.activerDiagonaleDescendante(id_diagD,infOusup);
                        System.out.println(grille);
                        break;
                    }
                    
            } 
        }
        return "Vous avez gagné la partie en "+nbcoups+" coups. ";
    }
    
    /**
     * Lance une partie de difficulté moyenne (le nombre de coups est inférieur à 11)
     * @return message de victoire
     */
    public String lancerPartieMoyenne (){ 
        System.out.println(grille); //affiche la grille à t0 
        while (!grille.cellulesToutesEteintes() && nbcoups <= 15){ //tant que la grille n'est pas completement éteinte et le nombre de coups est inférieur ou égal à 15 le programme suivant tourne
            nbcoups++; // on implémente le nb de coups joués
            //on demande ensuite à l'utilisateur de choisir l'activation d'une ligne/colonne/diagonale 
            Scanner sc = new Scanner(System.in); 
            System.out.println("Choisissez une action à réaliser : \n1) Activer une ligne \n2) Activer une colonne \n3) Activer une diagonale montante \n4) Activer une diagonale descendante"); 
            int choix_action =sc.nextInt();
            //si l'utilisateur à choisi d'activer une ligne, on lui demande laquelle 
            switch (choix_action) { 
                case 1: System.out.println("Choisissez une ligne à activer : "); 
                    int id_ligne = sc.nextInt(); //on modifie la ligne et on affiche la grille de jeu 
                    grille.activerLigneDeCellules(id_ligne); 
                    System.out.println(grille); 
                    break;


                case 2: 
                    System.out.println("Choisissez une colonne à activer : "); 
                    int id_colonne = sc.nextInt(); //on modifie la colonne et on affiche la grille de jeu 
                    grille.activerColonneDeCellules(id_colonne); 
                    System.out.println(grille); 
                    break;


                case 3: 
                    System.out.println("Voulez vous activer une diagonale montante supérieure : "); 
                    sc.nextLine(); 
                    String infOUsup = sc.nextLine(); 
                    if (!"".equals(infOUsup)){ 
                        System.out.println("Choisissez le numéro de la colonne de la diagonale montante à activer : "); 
                        int id_diagM = sc.nextInt(); 
                        grille.activerDiagonaleMontante(id_diagM,infOUsup); 
                        System.out.println(grille); 
                        break; 
                    }


                case 4: 
                    System.out.println("Voulez vous activer une diagonale descendante supérieure : "); 
                    sc.nextLine(); 
                    String infOusup = sc.nextLine(); 
                    if (!"".equals(infOusup)){ 
                        System.out.println("Choisissez le numéro de la colonne de la diagonale descendante à activer : "); 
                        int id_diagD = sc.nextInt(); 
                        grille.activerDiagonaleDescendante(id_diagD,infOusup); 
                        System.out.println(grille); 
                        break; 
                    }
            } 
        } if (nbcoups <= 15) { 
            return "Vous avez gagné la partie en "+nbcoups+" coups. "; 
        } else { 
            return "Vous avez perdu la partie. Vous avez dépassé le nombre de coups autorisés."; 
        } 
    }
    
        /**
     * Lance une partie de difficulté moyenne (le nombre de coups est inférieur à 11)
     * @return message de victoire
     */
    public String lancerPartieDifficile (){ 
        System.out.println(grille); //affiche la grille à t0 
        while (!grille.cellulesToutesEteintes() && nbcoups <= 10){ //tant que la grille n'est pas completement éteinte et le nombre de coups est inférieur ou égal à 10 le programme suivant tourne
            nbcoups++; // on implémente le nb de coups joués
            //on demande ensuite à l'utilisateur de choisir l'activation d'une ligne/colonne/diagonale 
            Scanner sc = new Scanner(System.in); 
            System.out.println("Choisissez une action à réaliser : \n1) Activer une ligne \n2) Activer une colonne \n3) Activer une diagonale montante \n4) Activer une diagonale descendante"); 
            int choix_action =sc.nextInt();
            //si l'utilisateur à choisi d'activer une ligne, on lui demande laquelle 
            switch (choix_action) { 
                case 1: System.out.println("Choisissez une ligne à activer : "); 
                    int id_ligne = sc.nextInt(); //on modifie la ligne et on affiche la grille de jeu 
                    grille.activerLigneDeCellules(id_ligne); 
                    System.out.println(grille); 
                    break;


                case 2: 
                    System.out.println("Choisissez une colonne à activer : "); 
                    int id_colonne = sc.nextInt(); //on modifie la colonne et on affiche la grille de jeu 
                    grille.activerColonneDeCellules(id_colonne); 
                    System.out.println(grille); 
                    break;


                case 3: 
                    System.out.println("Voulez vous activer une diagonale montante supérieure : "); 
                    sc.nextLine(); 
                    String infOUsup = sc.nextLine(); 
                    if (!"".equals(infOUsup)){ 
                        System.out.println("Choisissez le numéro de la colonne de la diagonale montante à activer : "); 
                        int id_diagM = sc.nextInt(); 
                        grille.activerDiagonaleMontante(id_diagM,infOUsup); 
                        System.out.println(grille); 
                        break; 
                    }


                case 4: 
                    System.out.println("Voulez vous activer une diagonale descendante supérieure : "); 
                    sc.nextLine(); 
                    String infOusup = sc.nextLine(); 
                    if (!"".equals(infOusup)){ 
                        System.out.println("Choisissez le numéro de la colonne de la diagonale descendante à activer : "); 
                        int id_diagD = sc.nextInt(); 
                        grille.activerDiagonaleDescendante(id_diagD,infOusup); 
                        System.out.println(grille); 
                        break; 
                    }
            } 
        } if (nbcoups <= 10) { 
            return "Vous avez gagné la partie en "+nbcoups+" coups. "; 
        } else { 
            return "Vous avez perdu la partie. Vous avez dépassé le nombre de coups autorisés."; 
        } 
    }
    
    /*public void lancer_partie (){
    Scanner sc = new Scanner(System.in);
    System.out.println("Choisissez le niveau de difficulté : \n1) Facile \n2) Moyen \n3) Difficile");
    int choix_niveau =sc.nextInt();
    
    switch (choix_niveau) {
    case 1: {
    GrilleDeJeu matrice = new GrilleDeJeu(3,3);
    Partie partie = new Partie(matrice);
    partie.initialiserPartie();
    partie.lancerPartieFacile();
    System.out.print(partie.lancerPartieFacile());
    break;
    }
    case 2: {
    GrilleDeJeu matrice = new GrilleDeJeu(4,3);
    Partie partie = new Partie(matrice);
    partie.initialiserPartie();
    partie.lancerPartieMoyenne();
    System.out.print(partie.lancerPartieMoyenne());
    break;
    }
    
    case 3:{
    GrilleDeJeu matrice = new GrilleDeJeu(4,4);
    Partie partie = new Partie(matrice);
    partie.initialiserPartie();
    partie.lancerPartieDifficile();
    System.out.print(partie.lancerPartieDifficile());
    break;
    }
    }
    }*/
        
    
}
