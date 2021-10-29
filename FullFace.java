public class FullFace extends Helm {
    private String bahan;
    private String warna;

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void TampilanData() {
        super.TampilanData();
        System.out.println("Bahan Helm   :" + getBahan());
        System.out.println("Warna Helm:" + getWarna());
    }
}