package Tuprak;

class Alamat{
    String jalan;
    String kota;

    // public String getJalan() {
    //     return jalan;
    // }
    // public void setJalan(String jalan) {
    //     this.jalan = jalan;
    // }
    // public String getKota() {
    //     return kota;
    // }
    // public void setKota(String kota) {
    //     this.kota = kota;
    // } 
    public String getAlamat(){
        return jalan + "," + kota;
    }
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }
    // public void setNama(String nama) {
    //     this.nama = nama;
    // }
    public String getNim() {
        return nim;
    }
    // public void setNim(String nim) {
    //     this.nim = nim;
    // }
    public Alamat getAlamatMahasiswa() {
        return alamat;
    }
}



public class TP2_4_H071231002 {
    public static void main(String[] args) {
        Alamat alam = new Alamat();
        alam.jalan = "Toddopuli";
        alam.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alam;
        mahasiswa.nim = "H071231002";
        mahasiswa.nama = "A. Muhammad Zulfikar";

        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("Nim: "+ mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamatMahasiswa().getAlamat());
    }
}
