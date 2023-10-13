/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_nazare_pinheiro;

import java.util.Scanner;

/**
 *Ana Rita NAZARE PINHEIRO 
 * 06/10/23
 * TP2 P2
 * @author anaza
 */
public class TP2_convertisseurObjet_NAZARE_PINHEIRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur a = new Convertisseur();
        Convertisseur b = new Convertisseur();
        double x = a.CelciusVersKelvin(0);
        a.FarenheitVersCelcius(45);
        a.FarenheitVersKelvin(34);
        
        b.FarenheitVersKelvin(56);
        b.FarenheitVersCelcius(87);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        
        System.out.println(x);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisisez une conversion à effectuer : \n 1) CelciusVersKelvin \n 2) KelvinVersCelcius \n 3) FarenheitVersCelcius\n 4) CelciusVersFarenheit \n 5) FarenheitVersKelvin \n 6) KelvinVersFarenheit");
        int conv = sc.nextInt();
        
        System.out.println("Saisissez une température à convertir : ");
        double temp = sc.nextDouble();
        
        Convertisseur c = new Convertisseur();
        
        if (conv==1){
            System.out.println(temp + " degré Celcius est égal à "+ c.CelciusVersKelvin(temp) +" degrés Kelvin");
        }
        if (conv==2) {
            System.out.println(temp + " degré Kelvin est égal à "+ c.KelvinVersCelcius(temp)+" degré Kelvin");
        }
        if (conv==3){
            System.out.println(temp + " degré Farenheit est égal à "+ c.FarenheitVersCelcius(temp)+" degré Celcius");
        }
        if (conv==4){
            System.out.println(temp + " degré Celcius est égal à "+ c.CelciusVersFarenheit(temp)+" degré Farenheit");
        }
        if (conv==5){
            System.out.println(temp + " degré Kelvin est égal à "+ c.KelvinVersFarenheit(temp)+" degré Farenheit");
        }
        if (conv==6){
            System.out.println(temp + " degré Farenheit est égal à "+ c.FarenheitVersKelvin(temp)+" degré Kelvin");
        }
    }
}
