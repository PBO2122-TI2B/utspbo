public class OffRoad extends Helm{
    private String goggles;

    public String getGoggles() {
        return goggles;
    }

    public void setGoggles(String goggles) {
        this.goggles = goggles;
    }

    public void TampilanData() {
        super.TampilanData();
        System.out.println("Goggles           : " + getGoggles());
    }
}
