public class HelmHalfFace extends Helm{
    public String visor;
    public String bahan;

    public HelmHalfFace(String visor, String bahan){
        this.visor = visor;
        this.bahan = bahan;
    }
    public void tampilHelm(){
        super.tampilHelm();
        System.out.println("---------- Detail Helm ---------");
        System.out.println("Tipe Helm       : Half Face");
        System.out.println("Visor           : " +visor);
        System.out.println("Bahan           : " +bahan);
        System.out.println("--------------------------------");
        System.out.println();
    }
}