package PrakUts;

public class HelmFullFace extends Helm{

    public String visorHelm;

    public HelmFullFace(String visor){
        this.visorHelm = visor;
    }

    public void tampilDataHelm(){
        super.tampilDataHelm();
        System.out.println("Visor Helm        : " + visorHelm);
    }
}
