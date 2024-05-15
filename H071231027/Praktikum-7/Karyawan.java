public class Karyawan extends Kehidupan {
    String nama;
    int umur;
    String jabatan;
    double gaji;
    Keluarga keluarga = new Keluarga();

    public Karyawan(String nama, int umur, String jabatan, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        keluarga.sudahMenikah();
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: Rp. " + gaji);
        System.out.println();

    }
}
