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
public class Helm {
    private String MerkHelm;
    private String Size;
    private String WarnaHelm;
    private String SymbolHelm;
    
    public Helm(){
    }
    public Helm(String Merk, String Size, String Warna, String Symbol){
       this.MerkHelm    = Merk;
       this.Size        = Size;
       this.WarnaHelm   = Warna;
       this.SymbolHelm  = Symbol;
    }
    public void setMerkHelm (String MerkHelm){
        this.MerkHelm = MerkHelm;
    }    
    public String getMerkHelm(){
       return MerkHelm; 
    }
    public void setSize(String Size) {
        this.Size = Size;
    }
    public String getSize(){
        return Size;
    }  
    public void setWarnaHelm(String WarnaHelm){
        this.WarnaHelm = WarnaHelm;
    }
    public String getWarnaHelm(){
        return WarnaHelm;
    }
    public void setSymbolHelm(String SymbolHelm){
        this.SymbolHelm = SymbolHelm;
    }
    public String getSymbolHelm(){ 
        return SymbolHelm;
    }
    public void TampilanData(){
        System.out.println("Data Helm : ");
        System.out.println("Merk Helm       :"+getMerkHelm());
        System.out.println("Size Helm       :"+getSize());
        System.out.println("Warna Helm      :"+getWarnaHelm());
        System.out.println("Symbol Helm     :"+getSymbolHelm());
    }
}
