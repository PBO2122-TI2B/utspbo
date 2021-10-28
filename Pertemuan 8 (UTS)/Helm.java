public class Helm {
    protected String merkHelm;
    protected String size;
    protected String symbolHelm;
    protected String warnaHelm;
    
    public void setMerkHelm(String merkHelm) {
        this.merkHelm = merkHelm;
    }

    public String getMerkHelm() {
        return merkHelm;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSymbolHelm(String symbolHelm) {
        this.symbolHelm = symbolHelm;
    }
    
    public String getSymbolHelm() {
        return symbolHelm;
    }

    public void setWarnaHelm(String warnaHelm) {
        this.warnaHelm = warnaHelm;
    }

    public String getWarnaHelm() {
        return warnaHelm;
    }

    public void tampilHelm() {
        System.out.println("----------- Data Helm ----------");
        System.out.println("Merk Helm       : " +getMerkHelm());
        System.out.println("Size Helm       : " +getSize());
        System.out.println("Symbol Helm     : " +getSymbolHelm());
        System.out.println("Warna Helm      : " +getWarnaHelm());
    }
}