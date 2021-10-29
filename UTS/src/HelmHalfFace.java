public class HelmHalfFace extends Helm{
    private String jenis;
    HelmHalfFace(String merkHeml,String size,String symbolHelm,String warnaHelm,String jenis){
        super(merkHeml,size,symbolHelm,warnaHelm);
        this.jenis=jenis;
    }
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
    public String getJenis(){
        return jenis;
    }
    public void tampilDataHelm(){
        System.out.println("Merk\t\t:\t"+merkHeml);
        System.out.println("Size\t\t:\t"+size);
        System.out.println("Symbol Helm\t:\t"+symbolHelm);
        System.out.println("Warna Helm\t:\t"+warnaHelm);
        System.out.println("Jenis\t\t:\t"+jenis);
        System.out.println("-----------------------------------------------------");
    }
}
