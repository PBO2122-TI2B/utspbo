/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.uts;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class Penitipan {
    private DataPenitipan anggota;
    private Helm helmotor;
    
    public Penitipan(){}
    public Penitipan(DataPenitipan anggota, Helm helmotor){
        this.anggota = anggota;
        this.helmotor = helmotor;
    }
    public void tampilanData(){
        anggota.tampilData();
        helmotor.tampilData();
    }
}
