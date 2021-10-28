/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author SMK TELKOM
 */
public class HelmHalfFace extends Helm{
    String Kaca;
    
    public HelmHalfFace(){
    }
    
    public HelmHalfFace(String MerkHelm, String Size, String WarnaHelm, String SymbolHelm, String Kaca){
        super(MerkHelm, Size, WarnaHelm ,SymbolHelm);
        this.Kaca = Kaca;
    }
    
    public void TampilanData(){           
        System.out.println("Data Helm : ");
        System.out.println("Merk Helm       :"+ getMerkHelm());
        System.out.println("Size Helm       :"+ getSize());
        System.out.println("Symbol Helm     :"+ getSymbolHelm());
        System.out.println("Warna Helm      :"+ getWarnaHelm());
        System.out.println("Kaca            :"+ Kaca);
    }
}
