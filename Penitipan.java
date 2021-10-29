/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_PraktikumUTS;

/**
 *
 * @author Chaidir Wiradhika
 */
public class Penitipan {
    public DataPenitipan anggota;
    public Helm Helmmotor;

    public void Helm(Helm Helmot, DataPenitipan anggotabr){
        Helmmotor = Helmot;
        anggota = anggotabr;
    }

    public void TampilanData(){
        System.out.println("==============DATA PEMILIK HELM==============");
        System.out.println("NAMA            : "+ anggota.getNama());
        System.out.println("ALAMAT          : "+ anggota.getAlamat());
        System.out.println("JENIS KELAMIN   : "+ anggota.getJenisKelamin());
        System.out.println("=============================================");
    }
}
