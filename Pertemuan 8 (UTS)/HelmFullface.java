public class HelmFullface extends Helm{
    public String airVent;
    public String removableInner;

    public HelmFullface(String airVent, String removableInner){
        this.airVent = airVent;
        this.removableInner = removableInner;
    }

    public String getAirVent() {
        return airVent;
    }

    public String getRemovableInner() {
        return removableInner;
    }

    public void tampilHelm(){
        super.tampilHelm();
        System.out.println("---------- Detail Helm ---------");
        System.out.println("Tipe Helm       : Full Face");
        System.out.println("Air Vent        : " +getAirVent());
        System.out.println("Removable Inner : " +getRemovableInner());
        System.out.println("--------------------------------");
        System.out.println();
    }
}