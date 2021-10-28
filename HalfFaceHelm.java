public class HalfFaceHelm extends Helm{
    private String ciri;
    private String fungsi;
    
    HalfFaceHelm(){

    }

    HalfFaceHelm(String merkHelm, String size, String symbolHelm, String warnaHelm, String ciri, String fungsi){
        super(merkHelm, size, symbolHelm, warnaHelm);
        this.ciri = ciri;
        this.fungsi = fungsi;
    }

    public void tampilHfHelm(){
        System.out.println("----- Half Face Helm -----");
        super.tampilHelm();
        System.out.println("Ciri - ciri : " + ciri);
        System.out.println("Fungsi      : " + fungsi);
    }
}

//Adika Ahmad Hanif Nazhir