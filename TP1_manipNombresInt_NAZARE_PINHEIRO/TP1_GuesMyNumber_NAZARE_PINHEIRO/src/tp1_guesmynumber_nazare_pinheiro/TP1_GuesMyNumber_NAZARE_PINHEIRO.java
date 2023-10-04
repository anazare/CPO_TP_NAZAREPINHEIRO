/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guesmynumber_nazare_pinheiro;

import java.util.Random;
import java.util.Scanner;

/**
 *ELEVE : ANA RITA NAZARE PINHEIRO 
 * DATE : 04/10/2023
 * TP1 EX 3
 * @author anaza
 */
public class TP1_GuesMyNumber_NAZARE_PINHEIRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in); 
        Random generateurAleat = new Random();
        
        int n = generateurAleat.nextInt(100);
        System.out.println(n);
        
        
        int nb=0;
        int c=1;
        
        System.out.println("Choisissez votre niveau de difficulté : \n1) Facile \n2) Moyenne \n3) Difficile");
        int difficulte = sc.nextInt(); 
        
        switch (difficulte) {
            case 1:
                while (nb!=n){
                    System.out.println("Saisisez une valeur :");
                    nb = sc.nextInt();
                    if (nb>n){
                        int difference = nb-n;
                        System.out.println("trop grand, vous devez soustraire : "+ difference);
                        c=c+1;
                    } if (nb<n) {
                        int difference =nb-n;
                        System.out.println("trop petit,  vous devez ajouter : "+ difference);
                        c=c+1;
                    } 
                }
                System.out.println("gagné en "+c+" tentatives");
                break;
            case 2:
                while (nb!=n){
                    System.out.println("Saisisez une valeur :");
                    nb = sc.nextInt();
                    if (nb>n){
                        System.out.println("trop grand");
                        c=c+1;
                    } if (nb<n) {
                        System.out.println("trop petit");
                        c=c+1;
                    } 
                }
                System.out.println("gagné en "+c+" tentatives");
                break;
            case 3: 
                while (nb!=n){
                    while (c<=3){
                    System.out.println("Saisisez une valeur :");
                    nb = sc.nextInt();
                    if (nb>n){
                        System.out.println("trop grand");
                        c=c+1;
                    } if (nb<n) {
                        System.out.println("trop petit");
                        c=c+1;
                    } else {
                        System.out.println("perdu");
                        break;
                    }}
                }
                System.out.println("gagné en "+c+" tentatives");
                break;
        }
            
    } 
}
