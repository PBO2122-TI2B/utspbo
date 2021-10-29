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
public class FullFace extends Helm {
    private String jeniskaca, motif;
    
    public String getJenisKaca() {
        return jeniskaca;
    }
    public void setJenisKaca(String jeniskaca) {
        this.jeniskaca = jeniskaca;
    }

    public String getMotif() {
        return motif;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }

    public void TampilanData() {
        super.TampilData();
        System.out.println("Kaca  : " + getJenisKaca());
        System.out.println("Motif : " + getMotif());
    }
}

