/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo;

/**
 *
 * @author Amelia
 */
public class Helm {
    private String merkHelm;
    private String size;
    private String symbolHelm;
    private String warnaHelm;
    
    public Helm(){
    }
    public Helm(String merkHelm, String size, String symbolHelm, String warnaHelm){
        this.merkHelm = merkHelm;
        this.size = size;
        this.symbolHelm = symbolHelm;
        this.warnaHelm = warnaHelm;
    }
    public void setMerkHelm(String merkHelm){
        this.merkHelm = merkHelm;
    }
    public void setSize(String size){
        this.size = size;
    }
    public void setSymbolHelm(String symbolHelm){
        this.symbolHelm = symbolHelm;
    }
    public void setWarnaHelm(String warnaHelm){
        this.warnaHelm = warnaHelm;
    }
    
    public String getMerkHelm(){
        return merkHelm;
    }
    public String getSize(){
        return size;
    }
    public String getSymbolHelm(){
        return symbolHelm;
    }
    public String getWarnaHelm(){
        return warnaHelm;
    }
}
