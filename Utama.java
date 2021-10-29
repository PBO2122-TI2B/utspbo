public class Utama {
    public static void main(String[] args) {

        FullFace ff = new FullFace();
        ff.setMerkHelm("NJS");
        ff.setSize("XL");
        ff.setWarna("Carbon Green");
        ff.setSymbolHelm("LogoNJS");
        ff.setBahan("Full Carbon");

        DataPenitipan dp = new DataPenitipan();
        dp.setNama("Mekel");
        dp.setAlamat("Ngajum");
        dp.setJenisKelamin("Laki Laki");

        Penitipan pt = new Penitipan();
        pt.Helmotor = ff;
        pt.anggota = dp;
        System.out.println("==========================");
        System.out.println("--------Penitipan 1-------");
        pt.TampilanData();

        HelmFace hf = new HelmFace();
        hf.setMerkHelm("INK");
        hf.setSize("Large");
        hf.setWarnaHelm("Putih");
        hf.setSymbolHelm("Logo");
        hf.setBahan("Thermoplastic");
        hf.setVisor("Clear");

        DataPenitipan dp2 = new DataPenitipan();
        dp2.setNama("Angela");
        dp2.setAlamat("Jalan Panji");
        dp2.setJenisKelamin("Perempuan");

        Penitipan pt2 = new Penitipan();
        pt2.Helmotor = hf;
        pt2.anggota = dp2;
        System.out.println("==========================");
        System.out.println("--------Penitipan 2-------");
        pt2.TampilanData();
    }
}