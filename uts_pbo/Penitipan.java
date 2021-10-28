/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo;

/**
 *
 * @author Amelia
 */
public class Penitipan{
    private Helm helmotor;
    private DataPenitipan anggota;
    
    public void tampilanData(Helm helmotor, DataPenitipan anggota){
       System.out.println("\n===DATA PENITIPAN===");
       System.out.println("Nama          : " +anggota.getNama());
       System.out.println("Alamat        : " +anggota.getAlamat());
       System.out.println("Jenis Kelamin : " +anggota.getJenisKelamin());
       System.out.println("===DATA HELM===");
       System.out.println("Merk Helm     : " +helmotor.getMerkHelm());
       System.out.println("Size Helm     : " +helmotor.getSize());
       System.out.println("Simbol Helm   : " +helmotor.getSymbolHelm());
       System.out.println("Warna Helm    : " +helmotor.getWarnaHelm());
    }
}
