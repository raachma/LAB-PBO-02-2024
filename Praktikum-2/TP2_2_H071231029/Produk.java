

public class Produk {

    int ID;
    String Nama;
    int Stok;
    double Harga;


  public Produk(int ID, String Nama, int Stok, double Harga){

    this.ID = ID;
    this.Nama = Nama;
    this.Stok = Stok;
    this.Harga = Harga;
  }


    void SetNamaPd(String Nama){
      this.Nama = Nama;
  }

    String GetnamaPd(){
      return Nama;
    }

    void SetId(int ID){
      this.ID = ID;

    }

    int GetId(){
      return ID;
    }

    void SetStok(int Stok){
      this.Stok = Stok;
    }


    int getStok() {
      return Stok;

    }
    

    void Harga(double Harga){
      this.Harga = Harga;
      
    }


    void PengecekanBarang(){

      if(this.Stok == 0){
        System.out.println("Barang Tidak Tersedia");

      }else{
        System.out.println("Barang  Tersedia");
      }


    }


   public void ShowDataProduk(){
    System.out.println("ID Produk \t:" + ID);
    System.out.println("Nama Produk\t: " + Nama);
    System.out.println("Stok\t\t: " + Stok);
    System.out.printf("Harga\t\t: %.4f\n\n",Harga);


    }



}