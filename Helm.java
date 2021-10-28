package UTSsmt3.UTSPBO;

public class Helm {
    protected String Kategori, MerkHelm, Size, SymbolHelm, WarnaHelm;

    public String getMerkHelm(){
        return MerkHelm;
    }
    public String getKategori(){
        return Kategori;
    }
    public String getSize(){
        return Size;
    }
    public String getSymbolHelm(){
        return SymbolHelm;
    }
    public String getWarnaHelm(){
        return WarnaHelm;
    }
    public void setKategori(String Kategori){
        this.Kategori = Kategori;
    }
    public void setMerkHelm(String MerkHelm){
        this.MerkHelm = MerkHelm;
    }
    public void setSize(String Size){
        this.Size = Size;
    }
    public void setSymbolHelm(String SymbolHelm){
        this.SymbolHelm = SymbolHelm;
    }
    public void setWarnaHelm(String WarnaHelm){
        this.WarnaHelm = WarnaHelm;
    }
    public void tampilDataH(){
        System.out.println("Merk Helm \t\t: " + getMerkHelm());
        System.out.println("Size \t\t\t: " + getSize());
        System.out.println("Symbol Helm\t\t: " + getSymbolHelm());
        System.out.println("Warna Helm\t\t: " + getWarnaHelm());
    }
    
}
