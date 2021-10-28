/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_pbo;

/**
 *
 * @author Amelia
 */
public class Utama {
    public static void main(String[] args) {
        FullFace full = new FullFace();
        OpenFace open = new OpenFace();
        DataPenitipan data = new DataPenitipan();
        Penitipan tampil = new Penitipan();
        
        full.setMerkHelm("KYT");
        full.setSize("L");
        full.setSymbolHelm("Stiker");
        full.setWarnaHelm("Biru");
        
        data.setNama("Amelia");
        data.setAlamat("Malang");
        data.setJenisKelamin("Perempuan");
        tampil.tampilanData(full, data);
        System.out.println("Jenis Helm    : " +full.getJenisHelm());
        

        open.setMerkHelm("Cargloss");
        open.setSize("L");
        open.setSymbolHelm("Stiker");
        open.setWarnaHelm("Hitam");
        
        DataPenitipan data1 = new DataPenitipan();
        data1.setNama("Alex");
        data1.setAlamat("Bandung");
        data1.setJenisKelamin("Laki-laki");
        tampil.tampilanData(open, data);
        System.out.println("Jenis Helm    : " +open.getJenisHelm());
    }
}
