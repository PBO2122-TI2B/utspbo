/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Penitipan {
    public DataPenitipan anggota;
    public Helm helmotor;
    
    public void motor(Helm Helmotor2, DataPenitipan anggota2){
        helmotor = Helmotor2;
        anggota = anggota2;
    }
    
    public void TampilanData(){
        System.out.println("       ===    DATA ANGGOTA   ===      ");
        System.out.println("Nama            :"+ anggota.getNama());
        System.out.println("Alamat          :"+ anggota.getAlamat());
        System.out.println("Jenis Kelamin   :"+ anggota.getJenisKelamin());

    }
}
