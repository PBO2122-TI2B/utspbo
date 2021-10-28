public class Penitipan {
    public DataPenitipan angoota;
    public Helm helmMotor;

    public void motor(Helm helmMotor, DataPenitipan anggota) {
        this.helmMotor = helmMotor;
        this.angoota = anggota;
    }

    public void TampilDataAnggota() {
        System.out.println();
        System.out.println("-------- Penitipan Helm --------");
        System.out.println("--------- Data Anggota ---------");
        System.out.println("Nama            : "+angoota.getNama());
        System.out.println("Alamat          : "+angoota.getAlamat());
        System.out.println("Jenis Kelamin   : "+angoota.getJenisKelamin());
        System.out.println();
        helmMotor.tampilHelm();
    }
}