public class FullFace extends Helm {
    private String kaca;
    private String airFlow;

    public String getAirFlow() {
        return airFlow;
    }

    public String getKaca() {
        return kaca;
    }

    public void setKaca(String kaca) {
        this.kaca = kaca;
    }

    public void setAirFlow(String airFlow) {
        this.airFlow = airFlow;
    }

    public void TampilanData() {
        super.TampilanData();
        System.out.println("Kaca             : " + getKaca());
        System.out.println("Air Flow         : " + getAirFlow());
    }
}
