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
public class Utama {
    public static void main(String [] args){
       DataPenitipan d1 = new DataPenitipan("John","Chicago","Male");
       OpenFace h1 = new OpenFace("Scorpion","XS","Letter S","$ 149.95","Open Face","drop-down pelindung matahari");
       Penitipan p1 = new Penitipan(d1, h1);
       p1.tampilanData();
       h1.tampilDataHelm();
       System.out.println("");
       DataPenitipan d2 = new DataPenitipan("Martin","New York","Male");
       Modular h2 = new Modular("HJC","3XL","HJC hexagon","$ 116.99","Modular","lensa Pinlock");
       Penitipan p2 = new Penitipan(d2, h2);
       p2.tampilanData();
       h2.tampilDataHelm();
    }
}
