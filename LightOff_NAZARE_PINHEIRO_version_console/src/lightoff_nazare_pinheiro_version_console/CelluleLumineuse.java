/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_nazare_pinheiro_version_console;

/**
 *
 * @author anaza
 */
public class CelluleLumineuse {
    private boolean etat;

    /**
     *construit une cellule lumineuse qui est initialement a l'etat eteint
     */
    public CelluleLumineuse() {
        this.etat = false;
    }
    
    /**
     *inverse l'etat de la cellule (cellule eteinte ou allumee)
     */
    public void activerCellule(){
        if (etat==true){
            etat=false;
        } else {
            etat=true;
        }
    }
    
    /**
     * eteint la cellule lumineuse 
     */
    public void eteindreCellule(){
        if (etat==true){
            etat=false;
        }
    }
    
    /**
     *verifie si la cellule est eteinte 
     * @return - boolen (true: eteinte, false: alumee)
     */
    public boolean estEteint(){
        if (etat==false){
            return true; 
        } else {
            return false;
        }
    }
    
    /**
     * permet d'obtenir l'état de la cellule lumineuse 
     * @return boolean
     */
    public boolean getEtat(){
        if (etat==true){
            return true;
        } else {
            return false;
        }
    }

    /**
     * affiche la cellule lumineuse 
     * @return cellule lumineuse 
     */
    @Override
    public String toString() {
        if (etat==true){
            return "X";
        } else {
            return "O";
        }
        
    }
    
    
    
}
