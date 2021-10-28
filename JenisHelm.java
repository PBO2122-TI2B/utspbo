package UTSsmt3.UTSPBO;

public class JenisHelm extends Helm{
    public String Jenis, Harga, Visor;

    public String getJenis(){
        return Jenis;
    }
    public String getHarga(){
        return Harga;
    }
    public String getVisor(){
        return Visor;
    }
    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
    public void setHarga(String Harga){
        this.Harga = Harga;
    }
    public void setVisor(String Visor){
        this.Visor = Visor;
    }
    public void tampilFF(){
        super.tampilDataH();
        System.out.println("Visor \t\t\t: " + Visor);
        System.out.println("Jenis Helm \t\t: " + Jenis);
        System.out.println("Harga \t\t\t: " + Harga);
    }

}
