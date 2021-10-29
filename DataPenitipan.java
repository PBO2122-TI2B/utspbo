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
public class DataPenitipan {

    private String nama, alamat, jk;

    DataPenitipan() {
    }

    public DataPenitipan(String nama, String alamat, String jk) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
    }

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

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }
    
    void showDP(){
        System.out.println("Nama\t\t: "+nama
                + "\nAlamat\t\t: "+alamat
                + "\nJenis Kelamin\t: "+jk);
    }
}
