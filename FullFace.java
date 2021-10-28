package uts;

public class FullFace extends Helm{
    private String jenisBahan;

    public void setjenisBahan(String jenisBahan) {
        this.jenisBahan = jenisBahan;
    }
    public String getJenisBahan(){
        return jenisBahan;
    }
    public void infoMahal() {
        super.printInfo();
        System.out.println("Jenis Bahan     : " + jenisBahan);
    }
}
