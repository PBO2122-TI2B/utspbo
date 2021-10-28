
public class Helm {
    private String merkHelm;
    private String size;
    private String simbolHelm;
    private String warnaHelm;

    public String getMerkHelm() {
        return merkHelm;
    }

    public String getWarnaHelm() {
        return warnaHelm;
    }

    public void setWarnaHelm(String warnaHelm) {
        this.warnaHelm = warnaHelm;
    }

    public String getSimbolHelm() {
        return simbolHelm;
    }

    public void setSimbolHelm(String simbolHelm) {
        this.simbolHelm = simbolHelm;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMerkHelm(String merkHelm) {
        this.merkHelm = merkHelm;
    }

    public void TampilanData() {
        System.out.println("Data Helm");
        System.out.println("Merk            : " + getMerkHelm());
        System.out.println("Size            : " + getSize());
        System.out.println("Warna           : " + getWarnaHelm());
        System.out.println("Symbol          : " + getSimbolHelm());
    }
}