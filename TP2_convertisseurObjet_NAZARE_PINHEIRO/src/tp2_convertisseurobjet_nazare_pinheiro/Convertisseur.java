/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_nazare_pinheiro;

/**
 *
 * @author anaza
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur(){
        this.nbConversions=0;
    }
    
    public double CelciusVersKelvin(double t){
        nbConversions++;
        return t+273;
    }
    public double KelvinVersCelcius(double t){
        nbConversions++;
        return t-273;
    }
    public double FarenheitVersCelcius(double t){
        nbConversions++;
        return (t-32)*1.8;
    }
    public double CelciusVersFarenheit(double t){
        nbConversions++;
        return t*1.8-32;
    }
    public double FarenheitVersKelvin(double t){
        nbConversions-=1;
        return CelciusVersKelvin(FarenheitVersCelcius(t));
    }
    public double KelvinVersFarenheit(double t){
        nbConversions-=1;
        return CelciusVersFarenheit(KelvinVersCelcius(t));
    }

    @Override
    public String toString (){
        return "nb de conversions"+ nbConversions;
    }
}
