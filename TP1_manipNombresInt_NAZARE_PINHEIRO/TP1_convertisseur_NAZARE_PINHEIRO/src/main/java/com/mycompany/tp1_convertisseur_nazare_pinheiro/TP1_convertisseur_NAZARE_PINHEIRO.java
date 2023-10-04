/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_convertisseur_nazare_pinheiro;

import java.util.Scanner;

/**
 *NAZARE PINEHIRO Ana Rita
 * TP1 CONVERTISSEUR 
 * 26/09/23
 * @author anaza
 */
public class TP1_convertisseur_NAZARE_PINHEIRO {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in); 
        System.out.println("Bonjour, saisisez une valeur :");
        double nb = sc.nextDouble(); 
        System.out.println("Saisissez la conversion que dvous souhaitez effectuer : \n 1) De Celcius vers Kelvin\n 2) De Kelvin vers Celcius\n 3) De Farenheir vers Celcius \n 4) De Celcius vers Farenheit \n 5) De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin");
        int cv = sc.nextInt();
        
        
        if (cv==1){
            double s = CelciusversKelvin(nb);
            System.out.println(nb + " degré Kelvin est égal à "+ s +" degrés Celcius");
        }
        if (cv==2) {
            double s = KelvinVersCelcius(nb);
            System.out.println(nb + " degré Kelvin est égal à "+ s+" degré Kelvin");
        }
        if (cv==3){
            double s = FarenheitVersCelcius(nb);
            System.out.println(nb + " degré Farenheit est égal à "+ s+" degré Celcius");
        }
        if (cv==4){
            double s = CelciusVersFarenheit(nb);
            System.out.println(nb + " degré Celcius est égal à "+ s+" degré Farenheit");
        }
        if (cv==5){
            double s = KelvinVersFarenheit(nb);
            System.out.println(nb + " degré Kelvin est égal à "+ s+" degré Farenheit");
        }
        if (cv==6){
            double s = FarenheitVersKelvin(nb);
            System.out.println(nb + " degré Farenheit est égal à "+ s+" degré Kelvin");
        }
    }
        //- CelciusVersKelvin
        
    public static double CelciusVersKelvin (double tCelcius){
            return tCelcius+273.15;  
        }

        //- KelvinVersCelcius
        public static double KelvinVersCelcius (double tKelvin){
            return tKelvin-273.15;
        }        
        //- FarenheitVersCelcius( )
        public static double FarenheitVersCelcius (double tFarenheit){
            return (tFarenheit-32)/1.8;
        }    
        //- CelciusVersFarenheit()
        public static double CelciusVersFarenheit (double tCelcius){
            return tCelcius*1.8 + 32;
        }        
        //- KelvinVersFarenheit()
            public static double KelvinVersFarenheit (double tKelvin){
            return tKelvin*9/5-459.67;
        }
        //- FarenheitVersKelvin()
            public static double FarenheitVersKelvin (double tFarenheit){
            return (tFarenheit+459.67)*5/9;
        }
         
    
}
