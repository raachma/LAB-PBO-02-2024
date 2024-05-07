package Soal4;

public class Main {

    public static void main(String[] args) {
        
        Alamat alamat = new Alamat();

        alamat.Jalan = "Sudiang";
        alamat.Kota = "Makassar";



        Mahasiswa Mahasiswa1 = new Mahasiswa();
        Mahasiswa1.alamat = alamat;
        Mahasiswa1.nama = "Muh.Fajrin Suhar"; 
        Mahasiswa1.Nim = "H071231029";




        System.out.println("Nama: " + Mahasiswa1.GetNama());
        System.out.println("Nim: " + Mahasiswa1.GetNim());
        System.out.println("Alamat: " + Mahasiswa1.GetAlamat().GetAlamatLengkap());



       }
}
