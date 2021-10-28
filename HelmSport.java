/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasa.penitipan;

/**
 *
 * @author ALIFIYUL
 */

    public class HelmSport extends Helm {
    public String kyt;
    
    public HelmSport(){
        
    }
    public HelmSport(String MerkHelm, String Size, String WarnaHelm, String SymbolHelm, String kyt){
        super(MerkHelm, Size,WarnaHelm,SymbolHelm);
        this.kyt = kyt;
    }
    public void TampilanData(){           
        System.out.println(" ------------- Data Helm -------------");
        System.out.println("Merk Helm       :"+ getMerkHelm());
        System.out.println("Size Helm       :"+ getSize());
        System.out.println("Symbol Helm     :"+ getSymbolHelm());
        System.out.println("Warna Helm      :"+  getWarnaHelm());
        System.out.println("visor           : "+ kyt);
    }
}


