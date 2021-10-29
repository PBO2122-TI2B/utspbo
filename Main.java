/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semester3;

/**
 *
 * @author Aku
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Menampilkan sesuai class diagram");
        Helm h = new Helm("Ink", "XL", "Persegi", "Hitam");
        DataPenitipan dp = new DataPenitipan("Lawliet", "Jl. Surabaya", "Laki-laki");
        Penitipan p = new Penitipan(dp, h);
        p.tampilanData();
        System.out.println();
        
        //jenis helm
        System.out.println("Menampilkan jenis helm");
        JenisHelm jh = new JenisHelm("Full Face","Semua motor","Seluruh kepala","LG","L","Lingkaran", "Merah Hitam");
        jh.showJH();
        System.out.println("\nMemanggil Helm saja");
        jh.showH();
        System.out.println();
        
        System.out.println("Memasukkan jenis helm(helmnya saja) ke penitipan");
        Helm h2 = new Helm();
        h2.setMerk(jh.getMerk());
        h2.setSize(jh.getSize());
        h2.setSymbol(jh.getSymbol());
        h2.setWarna(jh.getWarna());
        
        Penitipan p2 = new Penitipan(dp,h2);
        p2.tampilanData();
    }
}
