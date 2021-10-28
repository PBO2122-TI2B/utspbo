public class Modular extends Helm {
    private String chin;
    private String visor;

    public void setVisor(String visor){
        this.visor = visor;
    }

    public String getVisor(){
        return visor;
    }

    public void setChin(String chin){
        this.chin = chin;
    }

    public String getChin(){
        return chin;
    }

    public void TampilanData(){
        super.TampilanData();
        System.out.println("Visor Helm   :"+getVisor());
        System.out.println("Chin Helm    :"+getChin());
    }
}
