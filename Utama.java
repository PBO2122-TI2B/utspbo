package PrakUts;

public class Utama {
    public static void main(String[] args) {

        System.out.println("=============Penitipan 1===========");

        DataPenitipan dataPenitipan1 = new DataPenitipan();
        HelmOffroad off = new HelmOffroad(1.1, "Hitam");
        dataPenitipan1.setNama("Maulana");
        dataPenitipan1.setAlamat("Batu");
        dataPenitipan1.setJenisKelamin("Laki-laki");

        off.setSize("L");
        off.setMerkHelm("ORZ");
        off.setWarnaHelm("Putih");
        off.setSymbolHelm("Sticker ORZ");

        Penitipan penitipan1 = new Penitipan();
        penitipan1.motor(off, dataPenitipan1);
        penitipan1.tampilanData();

        System.out.println();
        System.out.println("=============Penitipan 2===========");

        DataPenitipan dataPenitipan2 = new DataPenitipan();
        HelmFullFace fullFace = new HelmFullFace("Flat Visor");
        dataPenitipan2.setNama("Rosandy");
        dataPenitipan2.setAlamat("Malang");
        dataPenitipan2.setJenisKelamin("Laki-laki");

        fullFace.setSize("M");
        fullFace.setMerkHelm("KYT");
        fullFace.setWarnaHelm("Hitam");
        fullFace.setSymbolHelm("Logo KYT");

        Penitipan penitipan2 = new Penitipan();
        penitipan2.motor(fullFace, dataPenitipan2);
        penitipan2.tampilanData();

        System.out.println();
        System.out.println("=============Penitipan 3===========");

        DataPenitipan dataPenitipan3 = new DataPenitipan();
        HelmOpenFace openFace = new HelmOpenFace();
        dataPenitipan3.setNama("Jimy");
        dataPenitipan3.setAlamat("Surabaya");
        dataPenitipan3.setJenisKelamin("Laki-laki");

        openFace.setSize("L");
        openFace.setMerkHelm("Retro");
        openFace.setWarnaHelm("Kuning");
        openFace.setSymbolHelm("Logo Retro");
        openFace.setMotifHelm("Garis-garis kuning");

        Penitipan penitipan3 = new Penitipan();
        penitipan3.motor(openFace, dataPenitipan3);
        penitipan3.tampilanData();

    }
}
