public class Penitipan {
    public Helm HelmMotor;
    public DataPenitipan anggota;

    void Motor(Helm HelmMotorBaru, DataPenitipan anggotaBaru){
        HelmMotor = HelmMotorBaru;
        anggota = anggotaBaru;
    }
    void TampilData(){
        System.out.println("====================================================");
        System.out.println("======================DATA Anggota==================");
        System.out.println("====================================================");
        System.out.println("Nama : "+ anggota.getNama());
        System.out.println("Alamat : "+ anggota.getAlamat());
        System.out.println("JenisKelamin : "+ anggota.getJenisKelamin());
        System.out.println("====================================================");
        System.out.println("======================DATA Helm=====================");
        System.out.println("====================================================");
        System.out.println("Merk Helm : "+ HelmMotor.getMerkHelm());
        System.out.println("Size Helm : "+ HelmMotor.getSize());
        System.out.println("Symbol Helm : "+ HelmMotor.getSymbolHelm());
    }
}
