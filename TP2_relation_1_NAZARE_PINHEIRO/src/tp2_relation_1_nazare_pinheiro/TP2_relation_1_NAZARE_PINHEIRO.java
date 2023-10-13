/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_nazare_pinheiro;

/**
 *
 * @author anaza
 */
public class TP2_relation_1_NAZARE_PINHEIRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;*/
        Personne bob = new Personne("Bobby", "Sixkiller",1);
        Voiture uneClio = new Voiture ("Clio", "Renault", 5, bob );
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ,bob) ;
        //System.out.println(uneClio.proprietaire);   
        
        bob.liste_voitures[0] = uneClio ;
        bob.liste_voitures[1]=uneMicra;
        bob.nbVoitures = 2 ;
        uneClio.proprietaire = bob ;
        uneMicra.proprietaire = bob;
        
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
        System.out.println("la deuxième voiture de Bob est " + bob.liste_voitures[1] ) ;
        
        
        
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6, null);
        
        bob.ajouter_voiture(une2008);
        System.out.println("la troisième voiture de Bob est " + bob.liste_voitures[2] ) ;
        
        
        
    }
    
}
