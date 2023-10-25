/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_nazare_pinheiro_version_console;

/**
 *
 * @author anaza
 */
public class LightOff_NAZARE_PINHEIRO_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrilleDeJeu grille = new GrilleDeJeu(3,3);
        grille.melangerMatriceAleatoirement(5);
        System.out.println(grille);
    }
    
}
