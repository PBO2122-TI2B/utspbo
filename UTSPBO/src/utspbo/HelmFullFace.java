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
public class HelmFullFace extends Helm{
    String Antifog;
    
    public HelmFullFace(){
    }
    
    public HelmFullFace(String MerkHelm, String Size, String WarnaHelm, String SymbolHelm, String Antifog){
        super(MerkHelm, Size, WarnaHelm ,SymbolHelm);
        this.Antifog= Antifog;
    }
    
    public void TampilanData(){           
        System.out.println("Data Helm : ");
        System.out.println("Merk Helm       :"+ getMerkHelm());
        System.out.println("Size Helm       :"+ getSize());
        System.out.println("Symbol Helm     :"+ getSymbolHelm());
        System.out.println("Warna Helm      :"+ getWarnaHelm());
        System.out.println("Antifog         :"+ Antifog);
    }
}
