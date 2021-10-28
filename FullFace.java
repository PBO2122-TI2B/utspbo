public class FullFace extends Helm {
    protected String Carbon;
    protected String Spoiler;
    
    public void setCarbon(String Carbon){
        this.Carbon = Carbon;
    }
    public String getCarbon(){
        return Carbon;
    }
    public void setSpoiler(String Spoiler){
        this.Spoiler = Spoiler;
    }
    public String getSpoiler(){
        return Spoiler;
    }
    public void TampilData(){
        super.TampilData();
        System.out.println("Bahan Helm :" +getCarbon());
        System.out.println("Include Spoiler:"+getSpoiler());
    }
}