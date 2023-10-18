/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_nazare_pinheiro;

import java.util.ArrayList;

/**
 *
 * @author anaza
 */
public class TP3_Heroic_Fantasy_NAZARE_PINHEIRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4,7);
        Baton chene = new Baton("Chêne", 4,5);
        Baton charme = new Baton("Charme", 5,6);
        //System.out.println(excalibur);
        
        ArrayList<Arme> tab = new ArrayList<Arme>();
        tab.add(excalibur);
        tab.add(durandal);
        tab.add(chene);
        tab.add(charme);
        //System.out.println(tab);
        
        
    }
    
}
