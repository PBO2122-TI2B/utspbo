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
public class Utama {
    public static void main (String[]args){
        Helm Helm =new Helm();
        DataPenitipan anggota = new DataPenitipan();
        
        anggota.setNama("Diajeng Nidzom Yoesharnilillah");
        anggota.setJenisKelamin("Perempuan");
        anggota.setAlamat("Jl.Kapi Pramuja Raya Blok 18b");
        
        Helm.setSize("M");
        Helm.setMerkHelm("CARGLOSS");
        Helm.setWarnaHelm("Hitam Doff");
        Helm.setSymbolHelm("Logo Vektor Cargloss");
        
        Penitipan pt = new Penitipan();
        pt.motor(Helm, anggota);
        pt.TampilanData();
        
        HelmHalfFace hhf = new HelmHalfFace("RSV","M","Logo Vektor","Hitam Doff","Cembung");
        hhf.TampilanData();
        
        HelmFullFace hff = new HelmFullFace("KYT R-10","M","Logo Polinema","Hitam Doff","Rata");
        hhf.TampilanData();
             
    }
}
