public class Penitipan{
    DataPenitipan anggota;
    Helm Helmotor;

    public void dataTitip(DataPenitipan anggota, Helm Helmotor){
        this.anggota = anggota;
        this.Helmotor = Helmotor;
    }

    public void TampilData(){
        anggota.tampilDataPenitipan();
        System.out.println("----- Data Helm -----");
        Helmotor.tampilHelm();
    }
}

//Adika Ahmad Hanif Nazhir