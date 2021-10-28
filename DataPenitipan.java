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
public class DataPenitipan  {
    private String nama , alamat,jeniskelamin;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
    return jeniskelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jeniskelamin = jeniskelamin;
    }
    public void TampilData() {
        System.out.println("Data Anggota");
        System.out.println("Nama        : " + getNama());
        System.out.println("Alamat          : " + getAlamat());
        System.out.println("Jenis Kelamin   : " + getJenisKelamin());
    } 
}
