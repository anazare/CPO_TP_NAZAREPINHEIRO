/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_manipnombresint_nazare_pinheiro;

import java.util.Scanner;

/**
 *
 * @author anaza
 */// NAZARE PINHEIRO Ana Rita 
// TP1
// 26/09/23


public class TP1_manipNombresInt_NAZARE_PINHEIRO {

    public static void main(String[] args) {
        int a; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier : ");
        a=sc.nextInt();
        
        int b;
        System.out.println("Entrez un autre nombre entier : ");
        b=sc.nextInt();
        
        int somme = a+b;
        System.out.println("la somme des deux nombres entrés est égale à "+ somme);
        
        int difference = a-b;
        System.out.println("la difference des deux nombres entrés est égale à "+ difference);
        
        int produit = a*b;
        System.out.println("le produit des deux nombres entrés est égal à "+ produit);
        
        
        System.out.println("la division des deux nombres entrés est égale à "+ (a*1.0/b)+" et la division entière des deux nombres est égale à " + (a%b));
        
    }
}
