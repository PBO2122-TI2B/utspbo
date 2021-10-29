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
public class JenisHelm extends Helm{
    private String jenis,motor, proteksi;

    public JenisHelm(String jenis, String motor, String proteksi, String merk, String size, String symbol, String warna) {
        super(merk, size, symbol, warna);
        this.jenis = jenis;
        this.motor = motor;
        this.proteksi = proteksi;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getProteksi() {
        return proteksi;
    }

    public void setProteksi(String proteksi) {
        this.proteksi = proteksi;
    }
    
    public void showJH(){
        super.showH();
        System.out.println("Jenis Helm\t: "+jenis
                + "\nMotor yang cocok: "+ motor
                + "\nProteksi\t: "+proteksi);
    }
}
