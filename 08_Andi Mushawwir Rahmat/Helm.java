public class Helm {
    protected String MerkHelm;
    protected String Size;
    protected String SymbolHelm;
    protected String WarnaHelm;

    public void setMerkHelm(String MerkHelm) {
        this.MerkHelm = MerkHelm;
    }

    public String getMerkHelm() {
        return MerkHelm;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getSize() {
        return Size;
    }

    public void setWarnaHelm(String WarnaHelm) {
        this.WarnaHelm = WarnaHelm;
    }

    public String getWarnaHelm() {
        return WarnaHelm;
    }

    public void setSymbolHelm(String SymbolHelm) {
        this.SymbolHelm = SymbolHelm;
    }

    public String getSymbolHelm() {
        return SymbolHelm;
    }

    public void TampilanData () {
        System.out.println();
        System.out.println("================Data Helm================");
        System.out.println("Merk Helm : " + getMerkHelm());
        System.out.println("Size Helm : " + getSize());
        System.out.println("Symbol Helm : " + getSymbolHelm());
        System.out.println();
        System.out.println("===========Jenis Helm Open Face===========");
    }
}