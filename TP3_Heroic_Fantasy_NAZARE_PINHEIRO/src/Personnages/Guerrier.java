/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author anaza
 */
public class Guerrier extends Personnage {
    String aCheval;
    static int nb_guerriers;

    public Guerrier( String nom, int niveau_de_vie, String aCheval) {
        super(nom, niveau_de_vie);
        this.aCheval = aCheval;
        nb_guerriers++;
    }
    
    @Override
    public void finalize(){
        nb_guerriers--;
    }
    
    public boolean confirmé(){
        if (this.aCheval=="à cheval"){
            return true;
        } else {
            return false;
        }
    }
    
    public void modif_aCheval(String nouveau_aCheval){
        this.aCheval=nouveau_aCheval;
    }
    
    public String lireTansport(){
        return this.aCheval;
    }
    
}
