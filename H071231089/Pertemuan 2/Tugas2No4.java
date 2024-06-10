class Alamat {
    String jalan;
    String kota;
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    String getAlamat(){
        return alamat.jalan + ", " + alamat.kota;
    }
}
public class Tugas2No4 {

    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Sungai Limboto";
        alamat.kota = "Makassar";
        // String alamat1 = alamat.getAlamat();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Chandra Junardi T";
        mahasiswa.nim = "H071231089";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());

    }
}
