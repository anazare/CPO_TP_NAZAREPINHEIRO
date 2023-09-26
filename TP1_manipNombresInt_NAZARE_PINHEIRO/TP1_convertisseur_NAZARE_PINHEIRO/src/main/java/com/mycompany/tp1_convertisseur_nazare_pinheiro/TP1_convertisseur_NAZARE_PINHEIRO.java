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
        double temp_celcius;
        Scanner sc = new Scanner (System.in); 
        System.out.println("Entrez une température en degrés :");
        temp_celcius = sc.nextDouble();
        
        double temp_kelvin = temp_celcius + 273.15; 
        System.out.println("cette température est équivalente à "+ temp_kelvin+" Kelvins");
        
        
        System.out.println(KelvinVersCelcius(25));
        
        
    }
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
