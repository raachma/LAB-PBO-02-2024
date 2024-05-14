import java.util.Scanner;
import java.util.HashMap;

class Product {
    String brand;
    int seriesNumber;
    double price;

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand          : " + this.brand);
        System.out.println("Serial Number  : " + this.seriesNumber);
        System.out.println("Price          :$ " + this.price);

    }
}

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen size      : " + this.screenSize + " inches");
        System.out.println("Storage capacity : " + this.storageCapacity + " GB");
    }
}

class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolusi   : " + this.resolution);
        System.out.println("Tipe lensa : " + this.lensType);
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Ram size       : " + this.ramSize + " GB");
        System.out.println("Processor tipe : " + this.processorType);
    }
}

public class TP5_2_H071231090{
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        HashMap<Integer, Product> inPro = new HashMap<>();

        while (true) {
            System.out.println("Menu:\n1. Tambah Produk\n2. Tampilkan Semua Produk\n3. Beli Produk\n4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");

            if (!inputan.hasNextInt()) {
                System.out.println("Inputan tidak valid.");
                inputan.next();
                continue;
            }
            int pilihan = inputan.nextInt();
            inputan.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama produk: ");
                    String brand = inputan.nextLine();
                    System.out.print("Masukkan nomor seri: ");
                    int seriesNumber = inputan.nextInt();
                    inputan.nextLine();
                    System.out.print("Masukkan harga: ");
                    double price = inputan.nextDouble();
                    inputan.nextLine();
                    System.out.println("Pilih tipe produk:");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Laptop");
                    System.out.println("3. Camera");
                    System.out.print("Pilih tipe produk (1-3): ");
                    int pilih = inputan.nextInt();
                    inputan.nextLine();

                    switch (pilih) {
                        case 1:
                            System.out.print("Masukkan ukuran layar (inci): ");
                            double screenSize = inputan.nextDouble();
                            inputan.nextLine();
                            System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                            int storageCapacity = inputan.nextInt();
                            inputan.nextLine();
                            inPro.put(seriesNumber, new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
                            break;
                        case 2:
                            System.out.print("Masukkan ukuran RAM (GB): ");
                            int ramSize = inputan.nextInt();
                            inputan.nextLine();
                            System.out.print("Masukka tipe prosesor: ");
                            String processorType = inputan.nextLine();
                            inPro.put(seriesNumber, new Laptop(brand, seriesNumber, price, ramSize, processorType));
                            break;
                        case 3:
                            System.out.print("Masukkan resolusi kamera: ");
                            int resolution = inputan.nextInt();
                            inputan.nextLine();
                            System.out.print("Masukkan tipe lensa: ");
                            String lensType = inputan.nextLine();
                            inPro.put(seriesNumber, new Camera(brand, seriesNumber, price, resolution, lensType));
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Daftar produk:");
                    for (Product cek : inPro.values()) {
                        cek.displayInfo();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                    int nomor = inputan.nextInt();
                    Product cek = inPro.get(nomor);
                    if (cek != null) {
                        System.out.println("Anda telah membeli produk:");
                        cek.displayInfo();
                    } else {
                        System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    inputan.close();
                    return;
                default:
                    break;
            }
        }
    }
}