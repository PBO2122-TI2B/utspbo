package uts;

public class Helm {
    private String merkHelm;
    private String size;
    private String simbolHelm;
    private String warnaHelm;

    public void setMerkHelm(String merkHelm) {
        this.merkHelm = merkHelm;
    }
    public String getMerkHelm(){
        return merkHelm;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setSimbolHelm(String simbolHelm) {
        this.simbolHelm = simbolHelm;
    }
    public String getSimbolHelm(){
        return simbolHelm;
    }
    public void setWarnaHelm(String warnaHelm) {
        this.warnaHelm = warnaHelm;
    }
    public String getWarnaHelm(){
        return warnaHelm;
    }
    public void printInfo() {
        System.out.println("Merk            : " + merkHelm);
        System.out.println("Size            : " + size);
        System.out.println("Simbol          : " + simbolHelm);
        System.out.println("Warna           : " + warnaHelm);
    }
}
