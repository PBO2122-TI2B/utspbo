public class DaftarPenitipan extends Penitipan{
    private String nama,alamat,jk;
    DaftarPenitipan(String nama,String alamat,String jk){
        this.nama=nama;
        this.alamat=alamat;
        this.jk=jk;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setJk(String jk){
        this.jk=jk;
    }
    public String getJk(){
        return jk;
    }
    public void tampilDataP(String noLoker){
        tampilData(noLoker);
        System.out.println("Pemilik");
        System.out.println("--------------------");
        System.out.println("Nama\t\t:\t"+ nama);
        System.out.println("Alamat\t\t:\t"+alamat);
        System.out.println("Jenis Kelamin\t:\t"+jk);
        System.out.println(" ");
        System.out.println("Helm");
        System.out.println("--------------------");
    }
}
