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
public class Penitipan {

    private DataPenitipan anggota;
    private Helm helmotor;

    Penitipan() {
    }

    public Penitipan(DataPenitipan anggota, Helm helmotor) {
        this.anggota = anggota;
        this.helmotor = helmotor;
    }

    public void tampilanData() {
        anggota.showDP();
        helmotor.showH();
    }
}
