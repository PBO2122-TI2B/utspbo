package PrakUts;

public class Penitipan {
    public DataPenitipan anggota;
    public Helm helmMotor;

    public void motor(Helm helmMotor, DataPenitipan anggota){
        this.helmMotor = helmMotor;
        this.anggota = anggota;
    }

    public void tampilanData(){

        System.out.println("Nama Anggota      : " + anggota.getNama());
        System.out.println("Alamat Anggota    : " + anggota.getAlamat());
        System.out.println("Jenis Kelamin     : " + anggota.getJenisKelamin());

        helmMotor.tampilDataHelm();
    }
}
