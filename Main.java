/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Helm HM = new Helm();
        DataPenitipan agt = new DataPenitipan();

        agt.setNama("Ahmad Abid Baihaqi");
        agt.setJenisKelamin("Laki - Laki");
        agt.setAlamat("Sawojajar");
        HM.setSize("XL");
        HM.setMerkHelm("KYT");
        HM.setWarnaHelm("Hitam");
        HM.setSymbolHelm("Motif Sleret-Sleret");

        Penitipan tp = new Penitipan();
        tp.Helm(HM, agt);
        tp.TampilanData();

        Fullface merk = new Fullface ("KYT","XL","Motif Sleret-Sleret","Hitam","Black Mamba");
        merk.TampilanData();

    } 
}
