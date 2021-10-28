/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author Asus X453
 */
public class Penitipan{
    public Helm helmotor;
    public DataPenitipan anggota;
    
    public void motor(Helm Helmotorbaru, DataPenitipan anggotabaru){
        helmotor = Helmotorbaru;
        anggota = anggotabaru;
    }
    
    public void TampilanData(){
        System.out.println(" ------------- Data Anggota ------------- ");
        System.out.println("Nama            :"+ anggota.getNama());
        System.out.println("Alamat          :"+ anggota.getAlamat());
        System.out.println("Jenis Kelamin   :"+ anggota.getJenisKelamin());

    }
    
}
