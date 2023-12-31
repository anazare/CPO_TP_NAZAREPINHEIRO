/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_nazare_pinheiro;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
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
        
        /*
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
        */
        
        /*
        for (int i=0; i<tab.size(); i++){
            String a = tab.get(i).nom;
            int b = tab.get(i).niveauAttaque;
            System.out.println(a + ", "+ b);
            if (tab.get(i).getClass()==Epee.class){
                int c = 1; //tab.get(i).indice;
                //int c = tab.get(i).indice; //ne fonctionne pas : les attribus de la sous classe ne sont pas reconnus
                System.out.println(", "+ c);
            } if (tab.get(i).getClass()==Baton.class){
                int d = 2; //tab.get(i).age;
                System.out.println(", "+ d);
            }
        }
        // on ne peux pas accéder aux atribus des sous classes puisque le tableau est composé d'objets de classe arme
        */
        
        /*
        Magicien gandalf = new Magicien("Gandalf", 65, "confirmé");
        Magicien garcimore = new Magicien("Garcimore", 44, "novice");
            
        Guerrier conan = new Guerrier("Conan", 78, "à pied");
        Guerrier lannister = new Guerrier("Lannister", 45, "à cheval");
        
        ArrayList<Personnage> tabPerso = new ArrayList<>(); 
        tabPerso.add(gandalf); 
        tabPerso.add(garcimore);
        tabPerso.add(conan);
        tabPerso.add(lannister);
        
        System.out.println(tabPerso);
        */
        
        /* 
        Magicien hp = new Magicien("Harry Potter", 55, "novice");
        Guerrier jace = new Guerrier("Jace", 60, "à cheval");
        
        
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4,7);
        Epee cortana = new Epee("Cortana",5,6);
        
        Baton chene = new Baton("Chêne", 4,5);
        Baton charme = new Baton("Charme", 5,6);
        Baton baguette = new Baton("Baguette de Sureau", 7, 90);
        
        jace.ajouterArme(durandal);
        jace.ajouterArme(cortana);
        jace.ajouterArme(chene);
        System.out.println(jace.EquiperPerso(cortana));
        System.out.println(jace.NbArmesDePredilection());
        
        hp.ajouterArme(baguette);
        hp.ajouterArme(charme);
        hp.ajouterArme(excalibur);
        System.out.println(hp.EquiperPerso(baguette));
        System.out.println(hp.NbArmesDePredilection());
        
        System.out.println(Personnage.nb_perso);
        
        System.out.println(jace);
        jace.seFatiguer();
        System.out.println(jace);
        System.out.println("Jace est vivant : "+ jace.estVivant());
        jace.Attaquer(hp);
        System.out.println(jace);
        System.out.println(hp);
        System.out.println("Harry Potter est vivant : "+ hp.estVivant());
        */
        
        // Partie 5.4
        
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4,7);
        Baton chene = new Baton("Chêne", 4,5);
        Baton charme = new Baton("Charme", 5,6);
        
        Magicien hp = new Magicien("Harry Potter", 55, "novice");
        Guerrier jace = new Guerrier("Jace", 60, "à cheval");
        
        System.out.println(jace);
        System.out.println(hp);
        
        jace.ajouterArme(durandal);
        jace.EquiperPerso(durandal);
        hp.ajouterArme(chene );
        hp.EquiperPerso(chene);
        
        jace.Attaquer(hp);
        System.out.println(jace);
        System.out.println(hp);
        
        hp.Attaquer(jace);
        System.out.println(jace);
        System.out.println(hp);
        
        System.out.println("Jace est vivant : "+ jace.estVivant());
        System.out.println("Harry Potter est vivant : "+ hp.estVivant());
    }
}
