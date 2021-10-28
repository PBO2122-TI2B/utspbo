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
public class DataPenitipan {
    private String nama, alamat, jenisKelamin;
    
    public DataPenitipan(){}
    
    public DataPenitipan(String nama, String alamat, String jenisKelamin){
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    public void setNama(String newNama){
        nama = newNama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setAlamat(String newAlamat){
        alamat = newAlamat;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public void setJenisKelamin(String newJenisKelamin){
        jenisKelamin = newJenisKelamin;
    }
    public String getJenisKelamin(){
        return this.jenisKelamin;
    } 
    public void tampilData(){
        System.out.println("---------Data Penitipan---------");
        System.out.println("Nama          : "+this.getNama());
        System.out.println("Alamat        : "+this.getAlamat());
        System.out.println("Jenis Kelamin : "+this.getJenisKelamin());
    }
}
