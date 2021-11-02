package pbo.uts;
public class DataPenitipan {
    public String nama;
    public String alamat;
    public String jenisKelamin;
    public DataPenitipan(String nama, String alamat, String jenisKelamin){
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    public void tampilData(){
        System.out.println("Nama          : "+getNama());
        System.out.println("Alamat        : "+getAlamat());
        System.out.println("Gender        : "+getJenisKelamin());
    }
}
package pbo.uts;
public class Helm {
    public String merkHelm;
    public String size;
    public String symbolHelm;
    public String warnaHelm;
    public Helm(String merkHelm, String size, String symbolHelm, String warnaHelm){
        this.merkHelm = merkHelm;
        this.size = size;
        this.symbolHelm = symbolHelm;
        this.warnaHelm = warnaHelm;
    }
    public void setMerkHelm(String merkHelm){
        this.merkHelm = merkHelm;
    }
    public String getMerkHelm(){
        return merkHelm;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setSymbolHelm(String symbolHelm){
        this.symbolHelm = symbolHelm;
    }
    public String getSymbolHelm(){
        return symbolHelm;
    }
    public void setWarnaHelm(String warnaHelm){
        this.warnaHelm = warnaHelm;
    }
    public String getWarnaHelm(){
        return warnaHelm;
    }
    public void tampilHelm(){
        System.out.println("Merk Helm     : "+getMerkHelm());
        System.out.println("Size          : "+getSize());
        System.out.println("Symbol Helm   : "+getSymbolHelm());
        System.out.println("Warna Helm    : "+getWarnaHelm());
    }
}
package pbo.uts;
public class HelmFullFace extends Helm{
    public String standarBalap;
    public HelmFullFace(String merkHelm, String size, String symbolHelm, String warnaHelm, String standarBalap){
        super(merkHelm, size, symbolHelm, warnaHelm);
        this.standarBalap = standarBalap;
    }
    public void setStandarBalap(String standarBalap){
        this.standarBalap = standarBalap;
    }
    public String getStandarBalap(){
        return standarBalap;
    }
    public void tampilHelmFullFace(){
        super.tampilHelm();
        System.out.println("Standar Balap : "+standarBalap);
    }
}
package pbo.uts;
public class HelmModular extends Helm{
    public String security;
    public HelmModular(String merkHelm, String size, String symbolHelm, String warnaHelm, String security){
        super(merkHelm, size, symbolHelm, warnaHelm);
        this.security = security;
    }
    public void setSecurity(String security){
        this.security = security;
    }
    public String getSecurity(){
        return security;
    }
    public void tampilHelmModular(){
        super.tampilHelm();
        System.out.println("Keamanan      : "+security);
    }
}
package pbo.uts;
public class Penitipan {
    public Helm helmMotor;
    public HelmFullFace fullFace;
    public HelmModular modular;
    public DataPenitipan anggota;
    public Penitipan(DataPenitipan anggota, Helm helmMotor){
        this.anggota = anggota;
        this.helmMotor = helmMotor;
    }
    public Penitipan(DataPenitipan anggota, HelmFullFace fullFace){
        this.anggota = anggota;
        this.fullFace = fullFace;
    }
    public Penitipan(DataPenitipan anggota, HelmModular modular){
        this.anggota = anggota;
        this.modular = modular;
    }
    public void TampilDataUmum(){
        System.out.println("\n        PENITIPAN HELM");
        anggota.tampilData();
        helmMotor.tampilHelm();
    }
    public void TampilDataFullFace(){
        System.out.println("\n        PENITIPAN HELM");
        anggota.tampilData();
        fullFace.tampilHelmFullFace();
    }
    public void TampilDataModular(){
        System.out.println("\n        PENITIPAN HELM");
        anggota.tampilData();
        modular.tampilHelmModular();
    }
}
package pbo.uts;
public class Main {
    public static void main(String[] args) {
        DataPenitipan a1 = new DataPenitipan("Rangga","Jl.Suropati No.4","Men");
        Helm h1 = new Helm("NHK","L","SNI","White");
        Penitipan p1 = new Penitipan(a1, h1);
        p1.TampilDataUmum();
        DataPenitipan a2 = new DataPenitipan("Mustasfa","Jl.Diponegoro No.18","Men");
        HelmFullFace h2 = new HelmFullFace("Helmet","XL","SNI","Black", "FIM");
        Penitipan p2 = new Penitipan(a2, h2);
        p2.TampilDataFullFace();
        DataPenitipan a3 = new DataPenitipan("Vian","Jl.Arjuno No.11","Men");
        HelmModular h3 = new HelmModular("HBC","L","SNI","Red","Approved");
        Penitipan p3 = new Penitipan(a3, h3);
        p3.TampilDataModular();
    } 
}
