package uts;

public class DataPenitipan {
    private String nama;
    private String alamat;
    private String jenisKelamin;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    public void printData() {
        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
    }
}
