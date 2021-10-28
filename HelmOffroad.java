package PrakUts;

public class HelmOffroad extends Helm{

    public double berat;
    public String warnaKacaHelm;

    public HelmOffroad(double berat, String warna){
        this.berat = berat;
        this.warnaKacaHelm = warna;
    }

    public void tampilDataHelm(){
        super.tampilDataHelm();
        System.out.println("Berat             : " + berat + " kg");
        System.out.println("Warna Kaca Helm   : " + warnaKacaHelm);
    }
}
