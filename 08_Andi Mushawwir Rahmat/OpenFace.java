public class OpenFace extends Helm{
    public String gogglesMask;
    public String bahan;

    public String getGogglesMask() {
        return gogglesMask;
    }

    public void setGogglesMask(String gogglesMask) {
        this.gogglesMask = gogglesMask;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void TampilanData() {
        super.TampilanData();
        System.out.println("Goggles Mask : " + getGogglesMask());
        System.out.println("Bahan Helm : " + getBahan());
        System.out.println();
    }
}