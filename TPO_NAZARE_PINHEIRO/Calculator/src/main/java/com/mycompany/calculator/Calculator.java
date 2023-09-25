/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author anaza
 */
/* NAZARE PINHEIRO, TP0, 
Calcultator, 
24/09/23
*/
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter the operator : \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
        int operateur=sc.nextInt();
        
        if (operateur<0 || operateur>=5) {
            System.out.println("error, chose an operator between 1 and 5");
            System.exit(0);
        } else {
        
            System.out.println("\n Please enter the first number :");
            int operande1 = sc.nextInt();

            System.out.println("\n Please enter the second number :");
            int operande2 = sc.nextInt();

            int result=0;      
            if (operateur==1) {
                result = operande1 + operande2;
            } else { 
                if (operateur==2) { 
                    result = operande1 - operande2;
                } else { 
                    if (operateur==3) {
                        result = operande1*operande2;
                    } else {
                        if (operateur==4){
                            result = operande1/operande2;
                        } else {
                            result = operande1%operande2;
                        }
                    }
                }
            }

            System.out.println(result);

        }}
}
