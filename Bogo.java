/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_PraktikumUTS;

/**
 *
 * @author Chaidir Wiradhika
 */
public class Bogo extends Helm {
    public String kacahelm;
    
    Bogo(String MerkHelm, String Size, String WarnaHelm, String SymbolHelm, String kacahelm){
        super(MerkHelm, Size, WarnaHelm, SymbolHelm);
        this.kacahelm = kacahelm;
    }
    public void TampilanData(){           
        System.out.println("==============SPESIFIKASI  HELM==============");
        System.out.println("MERK HELM       : "+ getMerkHelm());
        System.out.println("SIZE HELM       : "+ getSize());
        System.out.println("SYMBOL HELM     : "+ getSymbolHelm());
        System.out.println("WARNA HELM      : "+ getWarnaHelm());
        System.out.println("KACA HELM       : "+ kacahelm);
        System.out.println("=============================================");
    }
}
