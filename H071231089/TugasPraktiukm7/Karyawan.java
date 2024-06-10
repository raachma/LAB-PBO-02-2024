public class Karyawan extends PlaySound {
    String nama;
    int umur;
    String jabatan;
    double gaji;
    Pengalaman pengalaman = new Pengalaman();
    public Karyawan(){};
    public Karyawan(String nama, int umur, String jabatan, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
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
    public void tampilkanDetilKaryawan() {
        System.out.println("Nama   : " + getNama());
        System.out.println("Umur   : " + getUmur());
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Gaji   : " + getGaji());
        System.out.println("============================\n");
    
    }
    public void soundDiterima() {
        playAudio("AudioDiTerima.wav");
    }
    public void soundDitolak() {
        playAudio("AudioDiTolak.wav");
    }

}
