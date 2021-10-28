public class HelmOffroad extends Helm{
    public String mask;
    public String chinguard;

    public HelmOffroad(String mask, String chinguard){
        this.mask = mask;
        this.chinguard = chinguard;
    }
    public void tampilHelm(){
        super.tampilHelm();
        System.out.println("---------- Detail Helm ---------");
        System.out.println("Tipe Helm       : Off Road");
        System.out.println("Mask            : " +mask);
        System.out.println("Chinguard       : " +chinguard);
        System.out.println("--------------------------------");
        System.out.println();
    }
}
