/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

/**
 *
 * @author ASUS
 */
public class Helm {
    private String merkHelm, size, simbol, warna;

    public String getMerkHelm() {
        return merkHelm;
    }

    public String getWarnaHelm() {
        return warna;
    }

    public void setWarnaHelm(String warnaHelm) {
        this.warna = warna;
    }

    public String getSimbolHelm() {
        return simbol;
    }

    public void setSimbolHelm(String simbolHelm) {
        this.simbol = simbol;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMerkHelm(String merkHelm) {
        this.merkHelm = merkHelm;
    }
    public void TampilData() {
        System.out.println("Data Helm");
        System.out.println("Merk   : " + getMerkHelm());
        System.out.println("Size   : " + getSize());
        System.out.println("Warna  : " + getWarnaHelm());
        System.out.println("Symbol : " + getSimbolHelm());
    }
}
