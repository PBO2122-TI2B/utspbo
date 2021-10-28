package uts;

public class Utama {
    public static void main(String[] args) {

        DataPenitipan data1 = new DataPenitipan();
        data1.setNama("Rudi");
        data1.setAlamat("Jl. Malabar");
        data1.setJenisKelamin("Laki-laki");
        FullFace full = new FullFace();
        full.setMerkHelm("KYT");
        full.setSize("55 cm");
        full.setSimbolHelm("Keselamatan");
        full.setWarnaHelm("Hitam");
        full.setjenisBahan("Full Carbon");
        Penitipan titip1 = new Penitipan();
        titip1.setDataPenitipan(data1);
        titip1.setFullFace(full);
        titip1.tampilanDataMahal();
        

        DataPenitipan data2 = new DataPenitipan();
        data2.setNama("Rahayu");
        data2.setAlamat("Jl. Juanda");
        data2.setJenisKelamin("Perempuan");
        OpenFace open = new OpenFace();
        open.setMerkHelm("Ink");
        open.setSize("53 cm");
        open.setSimbolHelm("Keselamatan");
        open.setWarnaHelm("Biru Dongker");
        open.setJenisStandart("DOT");
        Penitipan titip2 = new Penitipan();
        titip2.setDataPenitipan(data2);
        titip2.setOpenFace(open);
        titip2.tampilDataMurah();
    }
}
