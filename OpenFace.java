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
public class OpenFace extends Helm {
    private String jenis;
    private String feature;
    
    public OpenFace(){}
    
    public OpenFace(String merk, String size, String symbolHelm, String warnaHelm, String jenis, String feature){
        super(merk, size, symbolHelm, warnaHelm);
        this.jenis = jenis;
        this.feature = feature;
    }
    public void setJenis(String newJenis){
        jenis = newJenis;
    }
    public String getJenis(){
        return this.jenis;
    }
    public void setFeature(String newFeature){
        feature = newFeature;
    }
    public String getFeature(){
        return this.feature;
    }
    public void tampilDataHelm(){
        System.out.println("Jenis  : "+this.getJenis());
        System.out.println("Feature: "+this.getFeature());
    }
    public void tampilSemuaData(){
        super.tampilData();
        tampilDataHelm();
    }
}
