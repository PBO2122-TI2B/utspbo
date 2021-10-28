package UTS;

public class OpenFace extends Helm{
    private String fitur;

    public void setMerkHelm(String merkHelm) {
        super.setMerkHelm(merkHelm);
    }


    public String getMerkHelm() {
        return super.getMerkHelm();
    }


    public void setSize(String size) {
        super.setSize(size);
    }


    public String getSize() {
        return super.getSize();
    }


    public void setSymbolHelm(String symbolHelm) {
        super.setSymbolHelm(symbolHelm);
    }


    public String getSymbolHelm() {
        return super.getSymbolHelm();
    }


    public void setWarnaHelm(String warnaHelm) {
        super.setWarnaHelm(warnaHelm);
    }
    public String getWarnaHelm() {
        return super.getWarnaHelm();
    }

    public void setFitur(String fitur) {
        this.fitur = fitur;
    }

    public String getFitur() {
        return fitur;
    }
    public void tampilData(){
        System.out.println("Fitur \t\t\t: "+this.getFitur());
        System.out.println("");
    }
}
