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

    public class Utama {
    public static void main (String[]args){
        Helm helmMotor =new Helm();
        DataPenitipan anggota = new DataPenitipan();
        
        anggota.setNama("Alifiyul Akyun");
        anggota.setJenisKelamin("Perempuan");
        anggota.setAlamat("Jl.Polowijen 2/320E, Kota Malang");
        
        helmMotor.setSize("L");
        helmMotor.setMerkHelm("NJS ZX-1 RUSH");
        helmMotor.setWarnaHelm("Hijau");
        helmMotor.setSymbolHelm("Stiker SCOTT");
        
        Penitipan titip = new Penitipan();
        titip.motor(helmMotor, anggota);
        titip.TampilanData();
        
        HelmSport sport = new HelmSport("Zeus ZS822B","L","Merah","SCOTT","Double Red Black");
        sport.TampilanData();
             
    }
}
