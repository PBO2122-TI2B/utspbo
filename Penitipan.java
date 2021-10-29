public class Penitipan {
    public Helm Helmotor;
    public DataPenitipan anggota;

    public void motor(Helm helMotorBaru, DataPenitipan anggotaBaru) {
        Helmotor = helMotorBaru;
        anggota = anggotaBaru;
    }

    public void TampilanData() {
        System.out.println("=========Anggota=========");
        System.out.println("Nama         :" + anggota.getNama());
        System.out.println("Alamat       :" + anggota.getAlamat());
        System.out.println("Jenis Kelamin:" + anggota.getJenisKelamin());

        Helmotor.TampilanData();
        System.out.println("==========================");
    }
}