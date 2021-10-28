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
public class Helm extends Penitipan{
    protected String merkHelm;
    protected String size;
    protected String symbolHelm;
    protected String warnaHelm;
    
    public Helm(){
       
   }
   public Helm(String merk, String size, String warna, String symbol){
       this.merkHelm= merk;
       this.size = size;
       this.warnaHelm = warna;
       this.symbolHelm=symbol;
   }
    
    public void setMerkHelm(String merkHelm){
        this.merkHelm=merkHelm;
    }
    public String getMerkHelm(){
        return merkHelm;
    }
    public void setSize(String size){
        this.size=size;
    }
    public String getSize(){
        return size;
    }
    public void setSymbolHelm(String symbolHelm){
        this.symbolHelm=symbolHelm;
    }
    public String getSymbolHelm(){
        return merkHelm;
    }
    public void setWarnaHelm(String warnaHelm){
        this.warnaHelm=warnaHelm;
    }
    public String getWarnaHelm(){
        return warnaHelm;
    }
    
}
