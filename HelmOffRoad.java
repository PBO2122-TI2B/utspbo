/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author Asus X453
 */
public class HelmOffRoad extends Helm {
    public String visor;
    
    public HelmOffRoad(){
        
    }
    public HelmOffRoad(String MerkHelm, String Size, String WarnaHelm, String SymbolHelm, String visor){
        super(MerkHelm, Size,WarnaHelm,SymbolHelm);
        this.visor = visor;
    }
    public void TampilanData(){           
        System.out.println(" ------------- Data Helm -------------");
        System.out.println("Merk Helm       :"+ getMerkHelm());
        System.out.println("Size Helm       :"+ getSize());
        System.out.println("Symbol Helm     :"+ getSymbolHelm());
        System.out.println("Warna Helm     :"+  getWarnaHelm());
        System.out.println("visor       : "+ visor);
    }
}
