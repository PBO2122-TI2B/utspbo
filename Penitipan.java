package uts;

public class Penitipan {
    private DataPenitipan anggota;
    private FullFace helmMahal;
    private OpenFace helmMurah;

    public void setDataPenitipan(DataPenitipan anggota) {
        this.anggota =anggota;
    }
    public DataPenitipan getDataPenitipan(){
        return anggota;
    }
    public void setFullFace(FullFace helmMahal) {
        this.helmMahal = helmMahal;
    }
    public FullFace getFullFace(){
        return helmMahal;
    }
    public void setOpenFace(OpenFace helmMurah) {
        this.helmMurah = helmMurah;
    }
    public OpenFace getOpenFace(){
        return helmMurah;
    }
    public void tampilanDataMahal() {
        System.out.println("----------------------------------------------");
        anggota.printData();
        System.out.println("----------------------------------------------");
        helmMahal.infoMahal();
        System.out.println("----------------------------------------------");
        System.out.println();
    }
    public void tampilDataMurah() {
        System.out.println("----------------------------------------------");
        anggota.printData();
        System.out.println("----------------------------------------------");
        helmMurah.infoMurah();
        System.out.println("----------------------------------------------");
        System.out.println();
    }
}
