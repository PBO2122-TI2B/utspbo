public class Main {
    public static void main(String[] args) {
        FullFace fullFace = new FullFace();

        fullFace.setAirFlow("2 mm di atas");
        fullFace.setKaca("Kaca transparan berwarna hitam");
        fullFace.setMerkHelm("KYT");
        fullFace.setSimbolHelm("Simbol KYT");
        fullFace.setSize("M");
        fullFace.setWarnaHelm("Hitam");

        DataPenitipan dataPenitipan = new DataPenitipan();
        dataPenitipan.setAlamat("Jl. Rahasiaa");
        dataPenitipan.setJenisKelamin("Laki-laki");
        dataPenitipan.setNama("Akhmad Ramadani");

        Penitipan penitipan = new Penitipan();
        penitipan.helm = fullFace;
        penitipan.anggota = dataPenitipan;


        System.out.println("Penitipan 1");
        penitipan.TampilanData();


        OffRoad offRoad = new OffRoad();
        offRoad.setGoggles("Kacamata kuat bagai baja");
        offRoad.setMerkHelm("Kawasaki");
        offRoad.setSimbolHelm("Simbol Bagus");
        offRoad.setSize("L");
        offRoad.setWarnaHelm("Merah");

        DataPenitipan dataPenitipan2 = new DataPenitipan();
        dataPenitipan2.setAlamat("Jl. Bersama");
        dataPenitipan2.setJenisKelamin("Perempuan");
        dataPenitipan2.setNama("Amalia Galuh Putri");


        Penitipan penitipan2 = new Penitipan();
        penitipan2.anggota = dataPenitipan2;
        penitipan2.helm = offRoad;

        System.out.println();
        System.out.println("Penitipan 2");
        penitipan2.TampilanData();

    }
}
