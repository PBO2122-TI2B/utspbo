/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semester3;

/**
 *
 * @author Aku
 */
public class Helm {
    private String merk, size, symbol, warna;

    Helm(){}

    public Helm(String merk, String size, String symbol, String warna) {
        this.merk = merk;
        this.size = size;
        this.symbol = symbol;
        this.warna = warna;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    void showH(){
        System.out.println("Merk\t\t: "+merk
                + "\nSize\t\t: "+size
                + "\nSymbol\t\t: "+symbol
                + "\nWarna\t\t: "+warna);
    }
}
