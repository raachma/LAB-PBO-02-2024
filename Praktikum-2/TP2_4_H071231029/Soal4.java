package Soal4;


class Mahasiswa{

    String nama;
    String Nim;
    Alamat alamat;


    String GetNama(){
        return nama;

    }

    void SetNama(String nama){
        this.nama = nama;
    }


    String GetNim(){
        return Nim;
    }


    void SetNim(String Nim){

        this.Nim = Nim;
    }


    Alamat GetAlamat(){
        return alamat;

    }


     void SetAlamat(Alamat alamat){
        this.alamat = alamat;
    }



}


class Alamat {

    String Kota;
    String Jalan;


     String getKota() {
        return Kota;
    }
    
  String getJalan() {
        return Jalan;
    }

    public void setKota(String kota) {
        Kota = kota;
    }


    public void setJalan(String jalan) {
        Jalan = jalan;
    }


     String GetAlamatLengkap(){
        return Jalan + ", " + Kota;
    }

}