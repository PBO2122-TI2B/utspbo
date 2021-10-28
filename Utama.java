public class Utama {
    public static void main(String[] args) {
        Modular mdl = new Modular();
        mdl.setMerkHelm("Airoh");
        mdl.setSize("Medium");
        mdl.setWarnaHelm("Hitam");
        mdl.setSymbolHelm("Sharp Text");
        mdl.setChin("Adjustable");
        mdl.setVisor("Iridium");

        DataPenitipan ag = new DataPenitipan();
        ag.setNama("Kevin Natanael Wijaya");
        ag.setAlamat("Jalan Sulfat");
        ag.setJenisKelamin("Laki Laki");

        Penitipan pnt = new Penitipan();
        pnt.Helmotor = mdl;
        pnt.anggota = ag;
        System.out.println("==========================");
        System.out.println("--------Penitipan 1-------");
        pnt.TampilanData();

        FullFace ff = new FullFace();
        ff.setMerkHelm("AGV");
        ff.setSize("Small");
        ff.setWarnaHelm("Merah");
        ff.setSymbolHelm("Italy Flag");
        ff.setNoseProtector("Removeable");
        ff.setVisor("Smoke");

        DataPenitipan ag2 = new DataPenitipan();
        ag2.setNama("Devano Hujami");
        ag2.setAlamat("Jalan Candi Ratu");
        ag2.setJenisKelamin("Laki Laki");

        Penitipan pnt2 = new Penitipan();
        pnt2.Helmotor = ff;
        pnt2.anggota = ag2;
        System.out.println("==========================");
        System.out.println("--------Penitipan 2-------");
        pnt2.TampilanData();

        OpenFace of = new OpenFace();
        of.setMerkHelm("KYT");
        of.setSize("Large");
        of.setWarnaHelm("Biru");
        of.setSymbolHelm("Bold Text");
        of.setBahan("Carbon Fiber");
        of.setVisor("Iridium");

        DataPenitipan ag3 = new DataPenitipan();
        ag3.setNama("Tina Tutu");
        ag3.setAlamat("Jalan Ikan Sepat");
        ag3.setJenisKelamin("Perempuan");

        Penitipan pnt3 = new Penitipan();
        pnt3.Helmotor = of;
        pnt3.anggota = ag3;
        System.out.println("==========================");
        System.out.println("--------Penitipan 3-------");
        pnt3.TampilanData();
    }
}
