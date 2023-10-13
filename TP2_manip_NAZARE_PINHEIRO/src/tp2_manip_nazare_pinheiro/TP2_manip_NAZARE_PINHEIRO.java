/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_nazare_pinheiro;

/**
 *NAZARE PINHEIRO Ana Rita 
 * 13/10/2023
 * TP 2 EXO 3
 * @author anaza
 */
public class TP2_manip_NAZARE_PINHEIRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        // une référence objet 
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        // deux références objet
        Tartiflette a=assiette1;
        assiette1=assiette2; 
        assiette2=a;
        
        System.out.println("nb de calories de Assiette 1 : "+ assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : "+ assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "+ assiette3.nbCalories);
        
        //Moussaka assiette666 = assiette1;
        //Moussaka assiette667 = new Tartiflette;
        
        String [ ] monTableau = new String[10];
        Moussaka=
        
    }
    
}
