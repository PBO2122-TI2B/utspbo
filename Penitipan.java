package UTS;

public class Penitipan {
    private DataPenitipan anggota;
    private Helm helmMotor;

    public void TampilData(Helm helmMotor, DataPenitipan anggota){
        System.out.println("==================PENITIPAN HELM=================");
        System.out.println("----------Data Anggota----------");
        System.out.println("Nama \t\t\t: "+anggota.getNama());
        System.out.println("Alamat \t\t\t: "+anggota.getAlamat());
        System.out.println("Jenis Kelamin \t: "+anggota.getJenisKelamin());
        System.out.println("");
        System.out.println("---------HELM-----------");
        System.out.println("Merk Helm \t\t: "+helmMotor.getMerkHelm());
        System.out.println("Size \t\t\t: "+helmMotor.getSize());
        System.out.println("Simbol \t\t\t: "+helmMotor.getSymbolHelm());
        System.out.println("Warna \t\t\t: "+helmMotor.getWarnaHelm());

    }
}
