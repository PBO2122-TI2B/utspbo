public class FullFaceHelm extends Helm{
    private String ciri;
    private String fungsi;
    
    FullFaceHelm(){

    }

    FullFaceHelm(String merkHelm, String size, String symbolHelm, String warnaHelm, String ciri, String fungsi){
        super(merkHelm, size, symbolHelm, warnaHelm);
        this.ciri = ciri;
        this.fungsi = fungsi;
    }

    public void tampilFfHelm(){
        System.out.println("----- Full Face Helm ----- ");
        super.tampilHelm();
        System.out.println("Ciri - ciri : " + ciri);
        System.out.println("Fungsi      : " + fungsi);
    }
}

//Adika Ahmad Hanif Nazhir