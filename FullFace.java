package UTS;

public class FullFace extends Helm{
    private String strap;

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

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public String getStrap() {
        return strap;
    }
    public void tampilData(){
        System.out.println("Strap \t\t\t: "+this.getStrap());
        System.out.println("");
    }
}
