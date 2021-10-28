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
public class Helm {
    private String MerkHelm;
    private String Size;
    private String WarnaHelm;
    private String SymbolHelm;
    
       public Helm(){
       
   }
   public Helm(String Merk, String Size, String Warna, String Symbol){
       this.MerkHelm= Merk;
       this.Size = Size;
       this.WarnaHelm = Warna;
       this.SymbolHelm=Symbol;
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
}
