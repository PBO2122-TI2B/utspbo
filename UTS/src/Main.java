public class Main {
    public static void main(String[] args) throws Exception {
    DaftarPenitipan df1 = new DaftarPenitipan("Samsul","Madura","Wanita");
    HelmFullFace h1 = new HelmFullFace("KYT","Full Face","M","Hitam","Aerodinamis");
    df1.tampilDataP("3F");
    h1.tampilDataHelm();
    DaftarPenitipan df2 = new DaftarPenitipan("Umi Kulsum","Madura","Wanita");
    HelmHalfFace h2 = new HelmHalfFace("JPN","Full Face","M","Merah","Bogo");
    df2.tampilDataP("5E");
    h2.tampilDataHelm();
    }
}
