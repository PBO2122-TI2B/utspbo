public class Utama {
    public static void main(String[] args) {
    Helm HelmMotor = new Helm();
    FullFace ff = new FullFace();
    HalfFace hf = new HalfFace();
    DataPenitipan anggota = new DataPenitipan();
    DataPenitipan anggota2 = new DataPenitipan();

    anggota.SetNama("Komang Gede Narariya Suputra");
    anggota.SetJenisKelamin("Laki-Laki");
    anggota.SetAlamat("Perum Bukit Cemara Tidar L1 29");
    
    ff.setMerkHelm("AGV");
    ff.setSize("L");
    ff.setSymbolHelm("Sticker Asli AGV");
    ff.setWarnaHelm("Biru Gradasi Putih");
    ff.setCarbon("Menggunakan Carbon");
    ff.setSpoiler("Menggunakan Spoiler");
    
    Penitipan titip = new Penitipan();
    titip.Motor(ff, anggota);
    titip.TampilData();
    
    anggota2.SetNama("Andi Mushawir Tod");
    anggota2.SetJenisKelamin("Laki-Laki");
    anggota2.SetAlamat("Cakalang Indah 2");

    hf.setMerkHelm("Cargloss");
    hf.setSize("L");
    hf.setSymbolHelm("Sticker Asli Cargloss");
    hf.setWarnaHelm("Hitam Gllossy");
    hf.setVisor("Visor Iridium");
    hf.setBentuk("Standart");

    Penitipan titip2 = new Penitipan();
    titip2.Motor(hf, anggota2);
    titip2.TampilData();
    }
}
