package TP7_1_H071231090;

public class Karyawan {
    String nama, umur, jabatan;
    int gaji;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getUmur() {
        return umur;
    }
    public void setUmur(String umur) {
        this.umur = umur;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}

abstract class Kehidupan{
    public void prosesKehidupan(){

    }
}

class Pengalaman extends Kehidupan{
    String sertifikasi, organisasi;

    public Pengalaman(String sertifikasi, String organisasi) {
        this.sertifikasi = sertifikasi;
        this.organisasi = organisasi;
    }

    @Override
    public void prosesKehidupan(){
        System.out.println("Pengalaman sebelumnya:");
        System.out.println("Setifikasi: " + sertifikasi + "\nOrganisasi: " + organisasi);
    }
}

class Pendidikan{
    String tingkatPendidikan;

    public Pendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public void pendidikanInfo(){
        System.out.println("Pendidikan terakhir: " + tingkatPendidikan);
    }
}

class Proyek{
    int jumlahProyek = 0;

    public void proyekInfo(int jumlah){
        this.jumlahProyek += jumlah;
    }

    public int getJumlahProyek() {
        return jumlahProyek;
    }

    public String toString() {
        return "Jumlah projek IT: " + jumlahProyek;
    }
}

class Organisasi{
    public String OrganisasiInfo(int pilih){
        String pilihan = "";
        switch (pilih) {
            case 1:
                pilihan = "Ketua BEM";
                break;
            case 2:
                pilihan = "Ketua Himpunan";
                break;
            case 3:
                pilihan = "Ketua Himpunan";
                break;
            case 4:
                pilihan = "Sekretaris Divisi";
                break;
             case 5:
                pilihan = "bendahara Divisi";
                break;
            default:
                pilihan  = "Tidak ada";
                break;
        }
        return pilihan;
    }
}