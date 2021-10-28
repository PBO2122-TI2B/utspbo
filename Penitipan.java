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
  public class Penitipan{
    public Helm helmMotor;
    public DataPenitipan anggota;
    
    public void motor(Helm Helmotorbaru, DataPenitipan anggotabaru){
        helmMotor = Helmotorbaru;
        anggota = anggotabaru;
    }
    
    public void TampilanData(){
        System.out.println(" ------------- Data Anggota ------------- ");
        System.out.println("Nama            :"+ anggota.getNama());
        System.out.println("Alamat          :"+ anggota.getAlamat());
        System.out.println("Jenis Kelamin   :"+ anggota.getJenisKelamin());

    }
    
}