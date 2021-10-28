package uts;

public class HelmFullFace extends Helm {
    public boolean adaVentilasi;

    public void setAdaVentilasi(boolean adaVentilasi) {
        this.adaVentilasi = adaVentilasi;
    }

    public void tampilkanData() {
        System.out.println("Ada Ventilasi: " + this.adaVentilasi);
        System.out.println();
        System.out.println();
    }
}
