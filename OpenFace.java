package uts;

public class OpenFace extends Helm{
    private String jenisStandart;

    public void setJenisStandart(String jenisStandart) {
        this.jenisStandart = jenisStandart;
    }
    public String getJenisStandart(){
        return jenisStandart;
    }
    public void infoMurah() {
        super.printInfo();
        System.out.println("Jenis Standart  : " + jenisStandart);
    }
}
