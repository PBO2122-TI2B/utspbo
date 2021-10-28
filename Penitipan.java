public class Penitipan {
    public DataPenitipan anggota;
    public Helm helm;

    public void TampilanData() {
        System.out.println("Data Anggota");
        System.out.println("Nama            : " + anggota.getNama());
        System.out.println("Alamat          : " + anggota.getAlamat());
        System.out.println("Jenis Kelamin   : " + anggota.getJenisKelamin());

        helm.TampilanData();

    }
}
