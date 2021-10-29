public class Helm extends Penitipan{
    public String merkHeml,size,symbolHelm,warnaHelm;
    Helm(){
    }
    Helm(String merkHeml,String size,String symbolHelm,String warnaHelm){
        this.merkHeml=merkHeml;
        this.size=size;
        this.symbolHelm=symbolHelm;
        this.warnaHelm=warnaHelm;
    }
    public void setMerkHelm(String merkHeml){
        this.merkHeml=merkHeml;
    }
    public String getMerkHelm(){
        return merkHeml;
    }
    public void setSize(String size){
        this.size=size;
    }
    public String getSize(){
        return size;
    }
    public void setSymbolHelm(String symbolHelm){
        this.symbolHelm=symbolHelm;
    }
    public String getSymbolHelm(){
        return symbolHelm;
    }
    public void setWarnaHelm(String warnaHelm){
        this.warnaHelm=warnaHelm;
    }
    public String getWarnaHelm(){
        return warnaHelm;
    }
}
