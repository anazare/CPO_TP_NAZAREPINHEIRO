/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_nazare_pinheiro;

/**
 *Ana Rita NAZARE PINHEIRO 
 * 06/10/2023
 * TP 2
 * @author anaza
 */
public class TP2_Bieres_NAZARE_PINHEIRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        /*BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom="Cuvée de trolls";
        uneBiere.degreAlcool=7.;
        uneBiere.brasserie="Dubuisson";
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxBiere = new BouteilleBiere();
        deuxBiere.nom="Leffe";
        deuxBiere.degreAlcool=6.6;
        deuxBiere.brasserie="Abbaye de Leffe";
        deuxBiere.ouverte=false;
        deuxBiere.lireEtiquette();*/
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée de trolls", 7.0,"Dubuisson" );
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
    }
    
    
    
    
    
}
