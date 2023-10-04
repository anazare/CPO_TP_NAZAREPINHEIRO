/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_nazare_pinheiro;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *ANA RITA NAZARE PINHEIRO
 * 04/10/23
 * FG 2A
 * @author anaza
 */
public class TP1_stats_NAZARE_PINHEIRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        //int Tab[] = new int[6];
        
        System.out.println("Veuillez entrer un nombre entier :");
        int m = sc.nextInt();
        int Tab[] = new int[m];
                
        for (int i=0; i<m; i++){
            int n = generateurAleat.nextInt(5);
            Tab[i]=n;
            System.out.println("au tirage numéro :" + i + ", le joueur a obtenu : " + n*100./6);
        }
        
        //System.out.println(Arrays.toString(Tab));
      }

    }
    

