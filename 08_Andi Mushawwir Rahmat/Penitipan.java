public class Penitipan {
    public Helm Helmmotor;
    public DataPenitipan anggota;

    void motor(Helm Helmmotorbaru, DataPenitipan anggotabaru) {
        Helmmotor = Helmmotorbaru;
        anggota = anggotabaru;
    }

    void Tampilandata() {
        System.out.println("===============Data Anggota===============");
        System.out.println("Nama : " + anggota.getNama());
        System.out.println("Alamat : " + anggota.getAlamat());
        System.out.println("JenisKelamin : " + anggota.getJenisKelamin());
        
        Helmmotor.TampilanData();
    }
}
