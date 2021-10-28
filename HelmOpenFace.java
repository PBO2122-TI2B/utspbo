package PrakUts;

public class HelmOpenFace extends Helm{

    private String motifHelm;

    public void setMotifHelm(String motifHelm) {
        this.motifHelm = motifHelm;
    }

    public String getMotifHelm() {
        return motifHelm;
    }

    public void tampilDataHelm(){
        super.tampilDataHelm();
        System.out.println("Motif Helm        : " + getMotifHelm());
    }
}
