
class Karyawan {
    private String nama;
    private int umur;
    private String jabatan;
    private double gaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}






abstract class Kehidupan {
    abstract void prosesKehidupan();
}


class Pengalaman extends Kehidupan {
    private String jenisPekerjaan;

    public Pengalaman(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    @Override
    void prosesKehidupan() {
        System.out.println("Pengalaman: " + jenisPekerjaan);
    }
}


class Pendidikan extends Karyawan {
    private String pendidikanTerakhir;

    public Pendidikan(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    void tampilkanPendidikan() {
        System.out.println("Pendidikan terakhir: " + pendidikanTerakhir);
    }
}


class Projek extends Karyawan {
    private int jumlahProyek;

    public Projek(int jumlahProyek) {
        this.jumlahProyek = jumlahProyek;
    }

    void tampilkanJumlahProyek() {
        System.out.println("Jumlah projek IT: " + jumlahProyek);
    }

   
}



class Keluarga extends Karyawan{
    private  String Kondisi;
    
    public Keluarga(String Kondisi){      
        this.Kondisi = Kondisi;
    }

    void MenampilkanKondisi(){
        System.out.println("Kondisi Keluarga: " + Kondisi);
    } 



}