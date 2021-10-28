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
public class Utama {
    public static void main (String[]args){
        Helm Helmotor =new Helm();
        DataPenitipan anggota = new DataPenitipan();
        
        anggota.setNama("Nurlaily Asrobika");
        anggota.setJenisKelamin("Perempuan");
        anggota.setAlamat("Jl.Kembang Turi gang 2 No.7");
        
        Helmotor.setSize("M");
        Helmotor.setMerkHelm("KYT");
        Helmotor.setWarnaHelm("Hijau");
        Helmotor.setSymbolHelm("Stiker Shoi Halface");
        
        Penitipan titip = new Penitipan();
        titip.motor(Helmotor, anggota);
        titip.TampilanData();
        
        HelmOffRoad road = new HelmOffRoad("Cross NHK","M","Hijau","ANFOG","Double White blue");
        road.TampilanData();
             
    }
}
