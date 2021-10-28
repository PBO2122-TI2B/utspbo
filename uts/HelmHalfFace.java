package uts;

public class HelmHalfFace extends Helm {
    public boolean adaKaca;

    public void setAdaKaca(boolean adaKaca) {
        this.adaKaca = adaKaca;
    }

    public void tampilkanData() {
        System.out.println("Ada kaca: " + this.adaKaca);
        System.out.println();
        System.out.println();
    }
}
