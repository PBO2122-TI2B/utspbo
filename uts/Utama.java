package uts;

public class Utama {
    public static void main(String[] args) {
        DataPenitipan orang1 = new DataPenitipan();
        orang1.setNama("Raditya Catur");
        orang1.setAlamat("Batu");
        orang1.setJenisKelamin("Laki-laki");

        DataPenitipan orang2 = new DataPenitipan();
        orang2.setNama("Raihan Afif");
        orang2.setAlamat("Batu");
        orang2.setJenisKelamin("Laki-laki");

        HelmHalfFace hhf = new HelmHalfFace();
        hhf.setMerkHelm("Car Gloss");
        hhf.setSize("M");
        hhf.setSymbolHelm("Car Gloss");
        hhf.setWarnaHelm("Hitam");
        hhf.setAdaKaca(true);

        HelmFullFace hff = new HelmFullFace();
        hff.setMerkHelm("Blade");
        hff.setSize("L");
        hff.setSymbolHelm("BMC");
        hff.setWarnaHelm("Hitam");
        hff.setAdaVentilasi(true);

        Penitipan a = new Penitipan(orang1, hhf);
        Penitipan b = new Penitipan(orang2, hff);

        a.tampilkanData();
        hhf.tampilkanData();
        
        b.tampilkanData();
        hff.tampilkanData();
    }
}
