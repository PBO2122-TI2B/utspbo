/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.uts;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class Helm {
    private String merkHelm;
    private String size;
    private String symbolHelm;
    private String warnaHelm;
    
    public Helm(){}
    public Helm(String merk, String size, String symbolHelm, String warnaHelm){
        this.merkHelm = merk;
        this.size = size;
        this.symbolHelm = symbolHelm;
        this.warnaHelm = warnaHelm;
    }
    
    public void setMerkHelm(String newMerk){
        merkHelm = newMerk;
    }
    public String getMerkHelm(){
        return this.merkHelm;
    }
    public void setSize(String newSize){
        size = newSize;
    }
    public String getSize(){
        return this.size;
    }
    public void setSymbolHelm(String newSymbol){
        symbolHelm = newSymbol;
    }
    public String getSymbolHelm(){
        return this.symbolHelm;
    }
    public void setWarnaHelm(String newWarna){
        warnaHelm = newWarna;
    }
    public String getWarnaHelm(){
        return this.warnaHelm;
    }
    public void tampilData(){
        System.out.println("------------Data Helm-----------");
        System.out.println("Merk   : "+this.getMerkHelm());
        System.out.println("Size   : "+this.getSize());
        System.out.println("Symbol : "+this.getSymbolHelm());
        System.out.println("Warna  : "+this.getWarnaHelm());
    }
}
