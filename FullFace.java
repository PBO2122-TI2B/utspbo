public class FullFace extends Helm{
    private String visor;
    private String noseProtector;

    public void setVisor(String visor){
        this.visor = visor;
    }

    public String getVisor(){
        return visor;
    }

    public void setNoseProtector(String noseProtector){
        this.noseProtector = noseProtector;
    }

    public String getNoseProtector(){
        return noseProtector;
    }

    public void TampilanData(){
        super.TampilanData();
        System.out.println("Visor Helm   :"+getVisor());
        System.out.println("NoseProc Helm:"+getNoseProtector());
    }
}
