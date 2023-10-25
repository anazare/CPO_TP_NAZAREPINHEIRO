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
     *construit une cellule lumineuse qui est initialement à l'état éteint
     */
    public CelluleLumineuse() {
        this.etat = false;
    }
    
    /**
     *inverse l'état de la cellule (cellule éteinte ou allumée)
     */
    public void activerCellule(){
        if (etat==true){
            etat=false;
        } else {
            etat=true;
        }
    }
    
    /**
     * éteint la cellule lumineuse 
     */
    public void eteindreCellule(){
        if (etat==true){
            etat=false;
        }
    }
    
    /**
     *vérifie si la cellule est éteinte 
     * @return - boolen (true: éteinte, false: alumée)
     */
    public boolean estEteint(){
        if (etat==false){
            return true; 
        } else{
            return false;
        }
    }
    
    public boolean getEtat(){
        if (etat==true){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (etat==true){
            return "X";
        } else {
            return "O";
        }
        
    }
    
    
    
}
