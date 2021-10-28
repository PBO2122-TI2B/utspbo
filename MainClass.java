package UTS;

public class MainClass {
    public static void main(String[] args){
        Penitipan p = new Penitipan();
        FullFace f = new FullFace();
        OpenFace o = new OpenFace();
        DataPenitipan dp = new DataPenitipan();
        DataPenitipan dp1 = new DataPenitipan();

        dp.setNama("Arjuna");
        dp.setAlamat("Jl. Veteran");
        dp.setJenisKelamin("Laki-Laki");
        f.setMerkHelm("KYT RC Seven");
        f.setSize("L");
        f.setSymbolHelm("Sticker Logo");
        f.setWarnaHelm("Orange-Black");
        f.setStrap("Quick release buckle");
        p.TampilData(f, dp);
        f.tampilData();

        dp1.setNama("Anesa");
        dp1.setAlamat("Jl. Bromo");
        dp1.setJenisKelamin("Perempuan");
        o.setMerkHelm("MDS Zarra");
        o.setSize("L");
        o.setSymbolHelm("Sticker Logo");
        o.setWarnaHelm("Black");
        o.setFitur("Ventilasi, Anti Theft dan Double Visor");
        p.TampilData(o, dp1);
        o.tampilData();

    }
}
