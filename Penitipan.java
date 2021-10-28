package UTSsmt3.UTSPBO;

public class Penitipan {
    public DataPenitipan anggota;
    public Helm Helmotor;

    void motor(DataPenitipan anggota1, Helm Helmotor1){
        anggota = anggota1;
        Helmotor = Helmotor1;
    }
 
    public void tampilData() {
        System.out.println("Nama \t\t\t: " + anggota.getNama());
        System.out.println("Alamat \t\t\t: " + anggota.getAlamat());
        System.out.println("Jenis Kelamin \t\t: " + anggota.getJenisKelamin());

        System.out.println("Kategori \t\t: "+ Helmotor.getKategori());
    }
}
