/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

/**
 *
 * @author ASUS
 */
public class MainUTS {
  public static void main(String[] args) { 
        DataPenitipan dp = new DataPenitipan();
        dp.setAlamat("Jalan Seoul 13");
        dp.setJenisKelamin("Laki-laki");
        dp.setNama("Na Jaemin");
        
        FullFace fc = new FullFace();
        fc.setJenisKaca("Visor Cear");
        fc.setMotif("Polos");
        fc.setMerkHelm("HONDA");
        fc.setSimbolHelm("SCI");
        fc.setSize("M");
        fc.setWarnaHelm("Putih");

        Penitipan p = new Penitipan();
        p.helm = fc;
        p.anggota = dp;
        System.out.println("Anggota ke-1");
        p.TampilData();
        
        DataPenitipan dp2 = new DataPenitipan();
        dp2.setAlamat("Jalan Busan no.15");
        dp2.setJenisKelamin("Laki-Laki");
        dp2.setNama("Lee Jeno");
        
        Bogo b = new Bogo();
        b.setPengguna("Dewasa");
        b.setMerkHelm("JPN MOMO");
        b.setSimbolHelm("SNI");
        b.setSize("M");
        b.setWarnaHelm("Biru Tosca");

        Penitipan p2 = new Penitipan();
        p2.anggota = dp2;
        p2.helm = b;

        System.out.println();
        System.out.println("Anggota ke-2");
        p2.TampilData();

    }     
}

