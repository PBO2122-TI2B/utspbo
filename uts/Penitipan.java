package uts;

public class Penitipan {
    public DataPenitipan anggota;
    public Helm helmMotor;

    public Penitipan(DataPenitipan anggota, Helm helmMotor) {
        this.anggota = anggota;
        this.helmMotor = helmMotor;
    }

    public void tampilkanData(){
        System.out.println("Informasi Penitip");
        System.out.println("Nama: " + anggota.getNama());
        System.out.println("Alamat: " + anggota.getAlamat());
        System.out.println("Jenis Kelamin: " + anggota.getJenisKelamin());
        System.out.println();
        System.out.println("Informasi Helm");
        System.out.println("Merk Helm: " + helmMotor.getMerkHelm());
        System.out.println("Ukuran Helm: " + helmMotor.getSize());
        System.out.println("Symbol Helm: " + helmMotor.getSymbolHelm());
        System.out.println("Warna Helm: " + helmMotor.getWarnaHelm());
    }
}