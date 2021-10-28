package PrakUts;

public class Helm {
    private String MerkHelm;
    private String size;
    private String SymbolHelm;
    private String WarnaHelm;

    public void setMerkHelm(String merkHelm) {
        MerkHelm = merkHelm;
    }

    public String getMerkHelm() {
        return MerkHelm;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSymbolHelm(String symbolHelm) {
        SymbolHelm = symbolHelm;
    }

    public String getSymbolHelm() {
        return SymbolHelm;
    }

    public void setWarnaHelm(String warnaHelm) {
        WarnaHelm = warnaHelm;
    }

    public String getWarnaHelm() {
        return WarnaHelm;
    }

    public void tampilDataHelm(){
        System.out.println("Merk Helm         : " + getMerkHelm());
        System.out.println("Size Helm         : " + getSize());
        System.out.println("Warna Helm        : " + getWarnaHelm());
        System.out.println("Symbol Helm       : " + getSymbolHelm());
    }
}
