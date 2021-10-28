public class Helm {
    private String merkHelm;
    private String size;
    private String symbolHelm;
    private String warnaHelm;

    Helm(){

    }

    Helm(String merkHelm, String size, String symbolHelm, String warnaHelm){
        this.merkHelm = merkHelm;
        this.size = size;
        this.symbolHelm = symbolHelm;
        this.warnaHelm = warnaHelm;
    }

    public void setMerkHelm(String newMerkHelm) {
        this.merkHelm = newMerkHelm;
    }

    public String getMerkHelm() {
        return this.merkHelm;
    }

    public void setSize(String newSize) {
        this.size = newSize;
    }

    public String getSize() {
        return this.size;
    }

    public void setSymbolHelm(String newSymbolHelm) {
        this.symbolHelm = newSymbolHelm;
    }

    public String getSymbolHelm() {
        return this.symbolHelm;
    }

    public void setWarnaHelm(String newWarnaHelm) {
        this.warnaHelm = newWarnaHelm;
    }

    public String getWarnaHelm() {
        return this.warnaHelm;
    }

    
    public void tampilHelm(){
        System.out.println("Merk Helm   : " +getMerkHelm());
        System.out.println("Size Helm   : " +getSize());
        System.out.println("Symbol Helm : " +getSymbolHelm());
        System.out.println("Warna Helm  : " +getWarnaHelm());
    }
}

//Adika Ahmad Hanif Nazhir