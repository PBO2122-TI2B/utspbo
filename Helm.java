public class Helm{
    protected String MerkHelm;
    protected String Size;
    protected String WarnaHelm;
    protected String SymbolHelm;

    public void setMerkHelm(String MerekHelm){
        this.MerkHelm = MerekHelm;
    }
    public String getMerkHelm(){
        return MerkHelm;
    }
    public void setSize(String Size){
        this.Size = Size;
    }
    public String getSize(){
        return Size;
    }
    public void setWarnaHelm(String WarnaHelm){
        this.WarnaHelm = WarnaHelm;
    }
    public String getWarnaHelm(){
        return WarnaHelm;
    }
    public void setSymbolHelm(String SymbolHelm){
        this.SymbolHelm = SymbolHelm;
    }
    public String getSymbolHelm(){
        return SymbolHelm;
    }
    public void TampilData(){
        System.out.println("Merk :" +getMerkHelm());
        System.out.println("Include Spoiler:"+getSize());
        System.out.println("Bahan Helm :" +getWarnaHelm());
        System.out.println("Include Spoiler:"+getSymbolHelm());
    }
}