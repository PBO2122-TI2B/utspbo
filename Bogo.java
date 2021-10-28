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
public class Bogo extends Helm {
    private String pengguna;
    
    public String getPengguna() {
        return pengguna;
    }

    public void setPengguna(String Pengguna) {
        this.pengguna = pengguna;
    }

    public void TampilData() {
        super.TampilData();
        System.out.println("Pengguna : " + getPengguna());
    }
}
