public class HelmFullFace extends Helm{
    private String bentukDesain;

    HelmFullFace (String merkHeml,String size,String symbolHelm,String warnaHelm,String bentukDesain){
        super(merkHeml,size,symbolHelm,warnaHelm);
        this.bentukDesain=bentukDesain;
    }
    public void setBentukDesain(String bentukDesain){
        this.bentukDesain=bentukDesain;
    }
    public String getBentukDesain(){
        return bentukDesain;
    }
    public void tampilDataHelm(){
        System.out.println("Merk\t\t:\t"+merkHeml);
        System.out.println("Size\t\t:\t"+size);
        System.out.println("Symbol Helm\t:\t"+symbolHelm);
        System.out.println("Warna Helm\t:\t"+warnaHelm);
        System.out.println("Bentuk Design\t:\t"+bentukDesain);
        System.out.println("-----------------------------------------------------");
    }
}
