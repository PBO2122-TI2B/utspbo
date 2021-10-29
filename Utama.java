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
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Helm HM = new Helm();
        DataPenitipan agt = new DataPenitipan();

        agt.setNama("AHMAD THARIQ RAMADHAN");
        agt.setJenisKelamin("Laki - Laki");
        agt.setAlamat("ASRAMA PUSDIK ARHANUD");
        HM.setSize("XL");
        HM.setMerkHelm("CARGLOSS");
        HM.setWarnaHelm("KUNING");
        HM.setSymbolHelm("MOTIF BERUANG");

        Penitipan tp = new Penitipan();
        tp.Helm(HM, agt);
        tp.TampilanData();

        Bogo merk = new Bogo("CARGLOSS","XL","MOTIF BERUANG","KUNING","DARK SMOKE");
        merk.TampilanData();

    }
}
