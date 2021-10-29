public class HelmFace extends Helm {
    private String visor;
    private String bahan;

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public String getVisor() {
        return visor;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    public void TampilanData() {
        super.TampilanData();
        System.out.println("Visor Helm   :" + getVisor());
        System.out.println("Bahan Helm   :" + getBahan());
    }
}