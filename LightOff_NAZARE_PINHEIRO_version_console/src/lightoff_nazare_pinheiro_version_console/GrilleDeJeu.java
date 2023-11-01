/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_nazare_pinheiro_version_console;

import java.util.Random;

/**
 *
 * @author anaza
 */
public class GrilleDeJeu {
    int nbLignes;
    int nbColonnes; 
    CelluleLumineuse[][] matriceCellules;

    /**
     * cr�e une grille de jeu de x lignes et y colonnes 
     * @param p_nbLignes nombre de lignes 
     * @param p_nbColonnes nombre de colonnes 
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++ ){
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }
    
    /**
     *�teint toutes les cellules de la grille de jeu 
     */
    public void eteindreToutesLesCellules(){
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++ ){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    /**
     *active (inverse l'�tat actuel) de mani�re al�atoire soit une ligne, soit une colonne, 
     * soit une diagonale de cellules dans la grille 
     */
    public void activerLigneColonneouDiagonaleAl�atoire(){
        Random rd = new Random();
        
        int choix_L_C_D = rd.nextInt(3);
        //choisi al�atoirement une activation de Ligne/colonne/Diagonale
        if (choix_L_C_D == 0){
            //active la ligne i 
            int i = rd.nextInt(nbLignes-1);
            for (int j=0; j<nbColonnes; j++ ){
                matriceCellules[i][j].activerCellule();
            }
        } if (choix_L_C_D == 1){
            //active la colonne j 
            int j = rd.nextInt(nbColonnes-1);
            for (int i=0; i<nbLignes; i++){
                matriceCellules[i][j].activerCellule();
            }
        } if (choix_L_C_D == 2){
            // active une diagonale inf ou sup descendante al�atoire
            Boolean sup = rd.nextBoolean();
            int IdColonneD = rd.nextInt(nbColonnes-1);
            if (sup==false){
                for (int i=0; i<Math.min(nbColonnes,nbLignes); i++){
                    if (i+IdColonneD<nbColonnes){
                        matriceCellules[i][i+IdColonneD].activerCellule();
                    }
                }
            } else {
                for (int i=0; i<Math.min(nbColonnes,nbLignes); i++){
                    if (IdColonneD-i>=0){
                        matriceCellules[nbLignes-1-i][IdColonneD-i].activerCellule();
                    }
                }
            }
        }
            
        else {
            // active une diagonale inf ou sup montante al�atoire
            int idColonneM = rd.nextInt(nbColonnes-1);
            Boolean sup = rd.nextBoolean();
            if (sup==true){
                for (int i = 0; i < Math.min(nbColonnes,nbLignes) ;i++ ){
                    if (idColonneM-i>=0){
                        matriceCellules[i][idColonneM-i].activerCellule();
                    }
                }
            } else {
                for (int i = 0; i < Math.min(nbColonnes,nbLignes) ;i++ ){
                    if (idColonneM+i<nbColonnes){
                        matriceCellules[nbLignes-1-i][idColonneM+i].activerCellule();
                    }
                }
            }
        }
    }
    
    
    /**
     *melange al�atoirement les cellules de la grille de jeu : 
     * cette fonction eteint d'abord toutes les cellules 
     * puis elle active al�atoirement une ligne/colonne/diagonales 
     * @param nbTours
     */
    public void melangerMatriceAleatoirement( int nbTours){
        this.eteindreToutesLesCellules();
        for (int i=0; i<nbTours; i++){
            this.activerLigneColonneouDiagonaleAl�atoire();
        }
    }
    
    /**
     * Inverse l'�tat de chaque cellule de la ligne
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne){
        int i=idLigne;
        for (int j=0; j<nbColonnes; j++ ){
                matriceCellules[i][j].activerCellule();
        }
    }
    
    /**
     *Inverse l'�tat de chaque cellule de la colonne
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne){
        for (int i=0; i<nbLignes; i++ ){
                matriceCellules[i][idColonne].activerCellule();
        }
    }
    
    /**
     *Inverse l'�tat de chaque cellule de la diagonale descendante choisie.
     * Pour pouvoir parcourir toutes les diagonales, la matrice doit avoir au maximum (nbColonnes+1) lignes.
     * @param IdColonneD
     * @param Sup
     */
    public void activerDiagonaleDescendante(int IdColonneD, String Sup){
        if (!"oui".equals(Sup)){
            for (int i=0; i<Math.min(nbColonnes,nbLignes); i++){
                if (IdColonneD-i>=0){
                    matriceCellules[nbLignes-1-i][IdColonneD-i].activerCellule();
                }
            }
        } else {
            for (int i=0; i<Math.min(nbColonnes,nbLignes); i++){
                if (i+IdColonneD<nbColonnes){
                    matriceCellules[i][i+IdColonneD].activerCellule();
                }
            }
        }
    }
    
    /**
     * active les cellules lumineuses de la diagonale montante sup�rieure ou inf�rieure choisie.
     * Pour pouvoir parcourir toutes les diagonales, la matrice doit avoir au maximum (nbColonnes+1) lignes.
     * @param idColonneM
     * @param Sup
     */
    public void activerDiagonaleMontante(int idColonneM, String Sup){
        if ("oui".equals(Sup)){
            for (int i = 0; i < Math.min(nbColonnes,nbLignes) ;i++ ){
                if (idColonneM-i>=0){
                    matriceCellules[i][idColonneM-i].activerCellule();
                }
            }
        } else {
            for (int i = 0; i < Math.min(nbColonnes,nbLignes) ;i++ ){
                if (idColonneM+i<nbColonnes){
                    matriceCellules[nbLignes-1-i][idColonneM+i].activerCellule();
                }
            }
        }
    }
    
    /**
     * v�rifie si toutes les cellules sont �teintes 
     * @return boolean 
     */
    public boolean cellulesToutesEteintes(){
        int k=0;
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++ ){
                if (matriceCellules[i][j].estEteint()==false){
                    k+=1;
                } 
            }
        } if (k==0){
            return true; 
        } else {
            return false;
        }
    }

    /**
     * affiche la grille de jeu 
     * @return
     */
    @Override
    public String toString() {
        //cr�er des string que j'ajoute pour retourner la valeur 
        String a="";
        String b=""; 
        String c="";
        for (int j=0; j<nbColonnes; j++){
            a += j+" | ";
        }
        for (int j=0; j<=nbColonnes; j++){
                c+="----";
            }
        for (int i=0; i<nbLignes; i++){
            b += "\n"+c+"\n "+i+" | ";
            for (int j=0; j<nbColonnes; j++){
                b += this.matriceCellules[i][j]+" | ";
            }
        }
        return "   | "+a+b+"\n"+c+"\n"+"   | "+a+"\n";
    }
    
    
    
}
