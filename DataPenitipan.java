public class DataPenitipan {
    private String nama;
    private String alamat;
    private String JenisKelamin;

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setAlamat(String newAlamat) {
        this.alamat = newAlamat;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setJenisKelamin(String newJenisKelamin) {
        this.JenisKelamin = newJenisKelamin;
    }

    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    public void tampilDataPenitipan(){
        System.out.println("----- Data Anggota -----");
        System.out.println("Nama          : " + getNama());
        System.out.println("Alamat        : " + getAlamat());
        System.out.println("Jenis Kelamin : " + getJenisKelamin());
    }
}

//Adika Ahmad Hanif Nazhir