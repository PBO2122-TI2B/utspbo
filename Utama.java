/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Utama {
    public static void main(String args[]) {
        Helm Helmotor = new Helm();
        DataPenitipan anggota = new DataPenitipan();
        
        anggota.setNama("Nadhifah Lutfiyah");
        anggota.setJenisKelamin("Perempuan");
        anggota.setAlamat("Jl. Gatot Subroto II/554");
        
        Helmotor.setSize("L");
        Helmotor.setMerkHelm("Cargloss");
        Helmotor.setWarnaHelm("Pink");
        Helmotor.setSymbolHelm("SNI");
        
        Penitipan titip = new Penitipan();
        titip.motor(Helmotor, anggota);
        titip.TampilanData();
        
        HelmOpenFace hf = new HelmOpenFace("Cargloss","L","SNI","Pink","Flat Hitam");
        hf.TampilanData();
    }
}
