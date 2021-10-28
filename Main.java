package UTSsmt3.UTSPBO;

public class Main {
    public static void main(String[] args) {
        DataPenitipan anggota = new DataPenitipan();
        Penitipan pt = new Penitipan();
        JenisHelm jh = new JenisHelm();
        System.out.println("==============================================================");
        System.out.println("-------------------DATA ANGGOTA PENITIPAN HELM----------------");
        System.out.println("==============================================================");
        anggota.setNama("Farah");
        anggota.setAlamat("Mergan");
        anggota.setJenisKelamin("Perempuan");
        
        pt.motor(anggota, jh);
        jh.Kategori = "New";
        pt.tampilData();

        jh.MerkHelm = "Zeus";
        jh.Size = "M";
        jh.SymbolHelm = "Tulisan Zeus didalam lingkaran hitam";
        jh.WarnaHelm = "Hitam";
        jh.Visor = "Double";
        jh.Jenis = "FullFace";
        jh.Harga = "Rp3000000";
        jh.tampilFF();
        System.out.println("==============================================================");
    }
}
