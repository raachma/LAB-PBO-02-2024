import java.util.Scanner;

class Produk {
    int id;
    String nama;
    int stok;
    double harga;

    public boolean isTersedia() {
        return stok > 0;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }
}

public class TP2_2_H071231023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID produk: ");
        int id = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan stok produk: ");
        int stok = scanner.nextInt();

        System.out.print("Masukkan harga produk: ");
        double harga = scanner.nextDouble();


        Produk produk = new Produk();
        produk.id = id;
        produk.nama = nama;
        produk.stok = stok;
        produk.harga = harga;

        System.out.println("\nInformasi Produk:");
        System.out.println("ID: " + produk.getId());
        System.out.println("Nama: " + produk.getNama());
        System.out.println("Stok: " + produk.getStok());
        System.out.printf("Harga: %.3f\n", produk.getHarga());
        System.out.println("Tersedia di Stok: " + (produk.isTersedia() ? "Ya" : "Tidak"));
        scanner.close();
    }
}
