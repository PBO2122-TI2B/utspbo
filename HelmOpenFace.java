/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class HelmOpenFace extends Helm{
    public String kaca;
    
    public HelmOpenFace(){
        
    }
    public HelmOpenFace(String MerkHelm, String Size, String WarnaHelm, String SymbolHelm, String kaca){
        super(MerkHelm, Size,WarnaHelm,SymbolHelm);
        this.kaca = kaca;
    }
    public void TampilanData(){           
        System.out.println("       ===     DATA HELM     ===      ");
        System.out.println("Merk Helm       :"+ getMerkHelm());
        System.out.println("Size Helm       :"+ getSize());
        System.out.println("Symbol Helm     :"+ getSymbolHelm());
        System.out.println("Warna Helm      :"+ getWarnaHelm());
        System.out.println("Kaca            :"+ kaca);
    }
}
