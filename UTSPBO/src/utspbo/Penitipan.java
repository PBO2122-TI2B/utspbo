/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author SMK TELKOM
 */
public class Penitipan {
    public Helm Helm;
    public DataPenitipan anggota;
    
    public void motor(Helm Helm, DataPenitipan anggota){
        Helm = Helm;
        anggota = anggota;
    }
    
    public void TampilanData(){
        System.out.println("Data Anggota : ");
        System.out.println("Nama            :"+anggota.getNama());
        System.out.println("Alamat          :"+anggota.getAlamat());
        System.out.println("Jenis Kelamin   :"+anggota.getJenisKelamin());
        
        System.out.println("Data Helm : ");
        System.out.println("Merk Helm       :"+Helm.getMerkHelm());
        System.out.println("Size Helm       :"+Helm.getSize());
        System.out.println("Symbol Helm     :"+Helm.getSymbolHelm());
    }
}
