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
        
        // test CelluleLumineuse
        CelluleLumineuse c = new CelluleLumineuse();
        System.out.println("état de la cellule c :"+c.getEtat());
        c.activerCellule();
        System.out.println("état de la cellule c :"+c.getEtat());
        System.out.println("cellule éteinte ? "+c.estEteint());
        c.eteindreCellule();
        System.out.println("cellule éteinte après methode eteindre ? "+c.estEteint()+"\n");
        // Cellule lumineuse fonctionne correctement 
        
        
        //test grille de jeu
        GrilleDeJeu grille = new GrilleDeJeu(4,4);
        System.out.print(grille);
        //to string fonctionne bien 
        
        System.out.println("cellules toutes éteintes ? "+grille.cellulesToutesEteintes());
        //test fonctionnel de cellulesToutesEteintes().
        
        grille.activerLigneDeCellules(0);
        System.out.println(grille);
        //test fonctionnel de activerLigneDeCellules().
        
        grille.activerColonneDeCellules(0);
        System.out.println(grille);
        //test fonctionnel de activerColonneDeCellules().
        
        grille.activerDiagonaleDescendante();
        System.out.println(grille);
        //test fonctionnel de activerDiagonaleDescendante(). 
        
        grille.activerDiagonaleMontante();
        System.out.println(grille);
        //test fonctionnel de activerDiagonaleMontante();
        
        grille.eteindreToutesLesCellules();
        System.out.println(grille);
        //test fonctionnel de eteindreToutesLesCellules()
        
        grille.melangerMatriceAleatoirement(5);
        System.out.println(grille);
        //test fonctionnel de melangerMatriceAleatoirement(5).
        
        System.out.println("cellules toutes éteintes ? "+grille.cellulesToutesEteintes());
        
        grille.eteindreToutesLesCellules();
        System.out.println("cellules toutes éteintes ? "+grille.cellulesToutesEteintes());
        //La classe Grille de jeu fonctionne correctement. 
        
        
        //test de la classe Partie : 
        Partie partie = new Partie(grille);
        System.out.print(grille);
        // constructeur fonctionne 
        
        partie.initialiserPartie();
        System.out.println(grille);
        // initialisation fonctionne bien 
        
        partie.lancerPartie();
        System.out.print(partie.lancerPartie( ));
        // problemes au niveau de lancerPartie : pas de return ? + print de trop. 
    }
        
}