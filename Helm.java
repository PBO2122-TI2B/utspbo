/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Helm {
    private String MerkHelm, Size, SymbolHelm, WarnaHelm;
    
    public Helm() {
    }
    
    public Helm(String Merk, String Size, String Warna, String Symbol){
       this.MerkHelm = Merk;
       this.Size = Size;
       this.WarnaHelm = Warna;
       this.SymbolHelm = Symbol;
   }
    
    public void setMerkHelm(String MerkHelm) {
        this.MerkHelm = MerkHelm;
    }
    
    public String getMerkHelm() {
        return this.MerkHelm;
    }
    
    public void setSize(String Size) {
        this.Size = Size;
    }
    
    public String getSize() {
        return this.Size;
    }
    
    public void setSymbolHelm(String SymbolHelm) {
        this.SymbolHelm = SymbolHelm;
    }
    
    public String getSymbolHelm() {
        return this.SymbolHelm;
    }
    
    public void setWarnaHelm(String WarnHelm) {
        this.WarnaHelm = WarnaHelm;
    }
    
    public String getWarnaHelm() {
        return this.WarnaHelm;
    }
}
