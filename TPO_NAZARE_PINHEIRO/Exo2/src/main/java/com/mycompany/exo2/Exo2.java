/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exo2;

import java.util.Scanner;

/**
 *
 * @author anaza
 */
public class Exo2 {

    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre d'entiers a additionner 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt();
        int result; // resultat 
        int ind; //indice
        result=0;
        
        //Addition des nombres premiers entiers
        ind=1; 
        while(result<=nb-1) {
            result += ind;
        }
         
        //Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb +" entiers est: "+ result);
    }
}
