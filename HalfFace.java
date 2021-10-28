public class HalfFace extends Helm {
    
        protected String Visor;
        protected String Bentuk;
        
        public void setVisor(String Visor){
            this.Visor = Visor;
        }
        public String getVisor(){
            return Visor;
        }
        public void setBentuk(String Warna){
            this.Bentuk = Bentuk;
        }
        public String getBentuk(){
            return Bentuk;
        }
        public void TampilData(){
            super.TampilData();
            System.out.println(" Pilihan Visor Helm :" +getVisor());
            System.out.println("Pilihan Bentuk :"+getBentuk());
        }
}
    
