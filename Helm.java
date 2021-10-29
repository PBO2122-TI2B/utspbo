/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Helm {
    private String Size;
    private String MerkHelm;
    private String SymbolHelm;
    private String WarnaHelm;
    
    public Helm(){    
    }
    Helm (String Size,String MerkHelm, String SymbolHelm, String WarnaHelm){
        this.Size = Size;
        this.MerkHelm = MerkHelm;
        this.SymbolHelm = SymbolHelm;
        this.WarnaHelm = WarnaHelm;
    }
   public void setSize(String Size){
        this.Size = Size;
    }
     public String getSize(){
        return Size;
     }
     public void setMerkHelm(String MerkHelm){
         this.MerkHelm = MerkHelm;
     }
      public String getMerkHelm(){
         return MerkHelm;
      }
       public void setSymbolHelm(String SymbolHelm){
           this.SymbolHelm = SymbolHelm;
       }
       public String getSymbolHelm(){
           return SymbolHelm;
       }
       public void setWarnaHelm(String WarnaHelm){
           this.WarnaHelm = WarnaHelm;
       }
       public String getWarnaHelm(){
           return WarnaHelm;
       }
}

