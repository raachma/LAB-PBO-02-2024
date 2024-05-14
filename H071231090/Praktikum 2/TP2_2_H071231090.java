import java.util.Scanner;
import java.util.Random;

public class TP2_2_H071231090 {
    public static void main(String[] args) {
        tokoAcak toko = new tokoAcak();
        toko.inputData();
        toko.printData();
        toko.cekProduk();
    }
}

class tokoAcak {
    String ID;
    String nama;
    int stok = 0;
    double harga = 0.0;

    public String dataID(){
        Random acak = new Random();
        int angkaAcak = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 12; i++){
            angkaAcak = acak.nextInt(0, 9);
            str.append(angkaAcak);
        }
        ID = nama.substring(0,1).toUpperCase() + str.toString();
        return ID;
    }

    public void inputData() {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        nama = n.nextLine();
        System.out.print("Masukkan stok barang: ");
        stok = n.nextInt();
        System.out.print("Masukkan harga barang: ");
        harga = n.nextDouble();
        n.close();
    }

    public void printData() {
        System.out.println("Nama produk: " + nama);
        System.out.println("ID barang: " + dataID());
        System.out.println("Stok tersedia sebanyak: " + stok);
        System.out.printf("Harga : Rp.%.2f/pcs \n", harga);
    }

    public void cekProduk() {
        if (stok == 0) {
            System.out.println("Barang tidak tersedia.");
        } else {
            System.out.println("Barang tersedia di toko.");
        }
    }
}