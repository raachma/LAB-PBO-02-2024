// Untuk mencari tahu apakah suatu tanaman sudah boleh diberikan pupuk atau belum

class Info{
    String tanaman;
    int tinggi;
    String usia;
    

    public Info(String tanaman, int tinggi, String usia) {
        this.tanaman = tanaman;
        this.tinggi = tinggi;
        this.usia = usia;
    }

    public String getTanaman(){
        return tanaman;
    }
    public void setTanaman(String tanaman){
        this.tanaman = tanaman;
    }

    public int getTinggi(){
        return tinggi;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public String getUsia(){
        return usia;
    }
    public void setUsia(String usia){
        this.usia = usia;
    }

}

public class TP3_1_H071231002 {
    String jenis;
    int terakhirPupuk;
    Info info;

    public TP3_1_H071231002(String jenis, int terakhirPupuk, String infoTanaman, int infoTinggi, String infoUsia){
        this.jenis = jenis;
        this.terakhirPupuk = terakhirPupuk;
        this.info = new Info(infoTanaman, infoTinggi, infoUsia);
    }

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getTerakhirPupuk() {
        return terakhirPupuk;
    }
    public void setTerakhirPupuk(int terakhirPupuk) {
        this.terakhirPupuk = terakhirPupuk;
    }

    public Info getInfo() {
        return info;
    }
    public void setInfo(Info info) {
        this.info = info;
    }

    
    
    public void tampilanInfo(){
        System.out.println("==============Informasi Tanaman==============");
        System.out.println("Jenis Tanaman      : " + this.getInfo().getTanaman());
        System.out.println("Tinggi Tanaman(cm) : " + this.getInfo().getTinggi() + " cm");
        System.out.println("Usia Tanaman       : " + this.getInfo().getUsia());
        System.out.println("Jenis Pupuk        : " + this.getJenis());
        System.out.println("Terakhir Dipupuk   : " + this.getTerakhirPupuk() + " hari yang lalu");
    }


    public void jadwalPupuk(){
        int selanjutnya = (60 - this.getTerakhirPupuk());
        if (this.getTerakhirPupuk() >= 60 && this.getTerakhirPupuk() <= 90){
            System.out.println(this.getInfo().getTanaman() +" Sudah Saatnya Diberikan Pupuk " + this.getJenis());
            System.out.println("Pemberian Pupuk Selanjutnya di 60 Hari");
            System.out.println("Jangan Lupa Gemburkan Tanahnya Yak!!!");
        } else if (this.getTerakhirPupuk() > 90){
            System.out.println(this.getInfo().getTanaman() +" Sudah Saatnya Diberikan Pupuk " + this.getJenis());
            System.out.println("Pemberian Pupuk Telat " + selanjutnya * -1 + " Hari");
            System.out.println("Tambahkan Dosis Pupuk");
            System.out.println("Jangan Lupa Gemburkan Tanahnya Yak!!!");
        } else {
            System.out.println(this.getInfo().getTanaman() + " Belum Saatnya Untuk Diberi Pupuk " + this.getJenis());
            System.out.println("Pemberian Pupuk Selanjutnya Sisa " + selanjutnya + " Hari");
            System.out.println("Baiknya Gemburkan Tanah Terlebih Dahulu");
        }
        
    }


    public static void main(String[] args) {
        Info info1 = new Info("Aglonema", 25, "6 Bulan");
        Info info2 = new Info("Kadaka", 30, "1 Tahun");
        Info info3 = new Info("Palm Merah", 70, "3 Tahun");
        Info info4 = new Info("Palm Kuning", 150, "6 Tahun");
        Info info5 = new Info("Anggrek", 60, "4 Tahun");
        

        TP3_1_H071231002 pupuk1 = new TP3_1_H071231002("NPK Daun", 40, info1.getTanaman(), info1.getTinggi(), info1.getUsia());
        TP3_1_H071231002 pupuk2 = new TP3_1_H071231002("NPK Daun", 60, info2.getTanaman(), info2.getTinggi(), info2.getUsia());
        TP3_1_H071231002 pupuk3 = new TP3_1_H071231002("NPK Daun", 160, info3.getTanaman(), info3.getTinggi(), info3.getUsia());
        TP3_1_H071231002 pupuk4 = new TP3_1_H071231002("NPK Daun", 200, info4.getTanaman(), info4.getTinggi(), info4.getUsia());
        TP3_1_H071231002 pupuk5 = new TP3_1_H071231002("NPK Bunga", 80, info5.getTanaman(), info5.getTinggi(), info5.getUsia());


        pupuk1.tampilanInfo();
        printBarriers();
        pupuk1.jadwalPupuk();
        printClose();

        pupuk2.tampilanInfo();
        printBarriers();
        pupuk2.jadwalPupuk();
        printClose();

        pupuk3.tampilanInfo();
        printBarriers();
        pupuk3.jadwalPupuk();
        printClose();

        pupuk4.tampilanInfo();
        printBarriers();
        pupuk4.jadwalPupuk();
        printClose();

        pupuk5.tampilanInfo();
        printBarriers();
        pupuk5.jadwalPupuk();
        printClose();

    }


        public static void printBarriers() {
            System.out.println("=============================================");
    }
        public static void printClose(){
            System.out.println("=============================================");
            System.out.println("=============Semoga Tumbuh Subur=============");
            System.out.println("==================Cemungutt==================");
            System.out.println("=============================================");
            System.out.println(" ");
        }
}   
