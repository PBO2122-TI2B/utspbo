public class Utama {
    public static void main(String[] args) {
        OpenFace of = new OpenFace ();
        DataPenitipan anggota = new DataPenitipan();
        Penitipan titip = new Penitipan();
    
        anggota.setNama("Andi Mushawwir Rahmat");
        anggota.setJenisKelamin("Laki-Laki");
        anggota.setAlamat("Jalan Cakalang Indah 1 No.286K");

        of.setSize("L");
        of.setMerkHelm("Cargloss");
        of.setWarnaHelm("Hitam");
        of.setSymbolHelm("Logo Cargloss");
        of.setGogglesMask("Full Set");
        of.setBahan("Tri-Fiber Composite");

        titip.motor(of, anggota);
        titip.Tampilandata();
    }
}
