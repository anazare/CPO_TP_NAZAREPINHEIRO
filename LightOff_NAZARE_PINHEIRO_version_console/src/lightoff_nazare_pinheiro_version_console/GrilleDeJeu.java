/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_nazare_pinheiro_version_console;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author anaza
 */
public class GrilleDeJeu {
    int nbLignes;
    int nbColonnes; 
    CelluleLumineuse[][] matriceCellules;

    public CelluleLumineuse[][] GrilleDeJeu(int x, int y) {
        this.nbLignes = x;
        this.nbColonnes = y;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++ ){
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
        return matriceCellules;
    }
    
    public void eteindreToutesLesCellules(){
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++ ){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    public void activerLigneColonneouDiagonaleAléatoire(){
        Random rd = new Random();
        int choix_L_C_D = rd.nextInt(2);
        if (choix_L_C_D == 0){
            
        }
    }
    
    
    
    
    
}
