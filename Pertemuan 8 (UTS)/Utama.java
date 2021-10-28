public class Utama {
    public static void main(String[] args) {
        // Penitipan 1
        DataPenitipan anggota1 = new DataPenitipan();
        HelmFullface hfc = new HelmFullface("4 Buah AirVent", "Yes");
        anggota1.setNama("Muh. Fauzi Ramadhan");
        anggota1.setJenisKelamin("Laki Laki");
        anggota1.setAlamat("Mamuju");

        hfc.setMerkHelm("Kyt");
        hfc.setSize("XL");
        hfc.setSymbolHelm("Stiker OHLINS");
        hfc.setWarnaHelm("Putih");

        Penitipan titip1 = new Penitipan();
        titip1.angoota = anggota1;
        titip1.helmMotor = hfc;
        titip1.TampilDataAnggota();
        
        // Penitipan 2
        DataPenitipan anggota2 = new DataPenitipan();
        HelmHalfFace hhc = new HelmHalfFace("Flat Visor", "Carbon");
        anggota2.setNama("Dian Safira");
        anggota2.setJenisKelamin("Perempuan");
        anggota2.setAlamat("Kediri");

        hhc.setMerkHelm("Cargloss");
        hhc.setSize("M");
        hhc.setSymbolHelm("Gantungan Spiderman");
        hhc.setWarnaHelm("Hitam");

        Penitipan titip2 = new Penitipan();
        titip2.motor(hhc, anggota2);
        titip2.TampilDataAnggota();

        // Penitipan 3
        DataPenitipan anggota3 = new DataPenitipan();
        HelmOffroad hof = new HelmOffroad("GoogleMask", "Crossover");
        anggota3.setNama("Maqbul Oko");
        anggota3.setJenisKelamin("Laki Laki");
        anggota3.setAlamat("Majene");

        hof.setMerkHelm("NHK");
        hof.setSize("L");
        hof.setSymbolHelm("Pilox Huruf X");
        hof.setWarnaHelm("Hijau Tua");

        Penitipan titip3 = new Penitipan();
        titip3.motor(hof, anggota3);
        titip3.TampilDataAnggota();
    }
}
