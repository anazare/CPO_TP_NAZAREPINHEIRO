/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */// NOM, TD C, TPO, 23/09/2023

package com.mycompany.exo1;

import java.util.Scanner;

/**
 *
 * @author anaza
 */
public class Exo1 {

    public static void main(String[] args) {
        //Partie 1
        System.out.println("Bonjour");
        int maVariable = 20;
        maVariable+=1;
        System.out.println(maVariable);
        System.out.println("Au revoir");
        //Personalisation 
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, comment vous appelez-vous ?");
        prenom = sc.nextLine();
    }
}




