public class Utama {

    public static void main(String[] args) {
        DataPenitipan dataPenitipan = new DataPenitipan();
        dataPenitipan.setNama("Yasmin");
        dataPenitipan.setAlamat("Jalan Munif No 61");
        dataPenitipan.setJenisKelamin("Perempuan");
        
        Helm helm = new Helm();
        helm.setMerkHelm("Honda");
        helm.setSize("M");
        helm.setSymbolHelm("Stiker Matrix 4.0");
        helm.setWarnaHelm("Hitam");

        Penitipan penitipan = new Penitipan();
        penitipan.dataTitip(dataPenitipan, helm);
        penitipan.TampilData();

        HalfFaceHelm hfHelm = new HalfFaceHelm("Honda", "M", "Stiker Matrix 4.0", "Hitam", "Tidak Memiliki Visor", "Berkendaraan jangka pendek");
        hfHelm.tampilHfHelm();

        FullFaceHelm ffHelm = new FullFaceHelm("Hiu Helmet", "M", "Stiker Prima LX", "Biru", "Bagian Dagu Tertutup dan memiliki visor", "Touring");
        ffHelm.tampilFfHelm();
        
    }
}

//Adika Ahmad Hanif Nazhir