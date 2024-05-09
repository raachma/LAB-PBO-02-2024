import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String brand;
    int seriesNumber;
    double price;
    String productType;

    Product(String brand, int seriesNumber, double price, String productType) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        this.productType = productType;
    }

    void displayInfo() {
        System.out.println("Jenis Produk    : " + productType);
        System.out.println("Brand           : " + brand);
        System.out.println("Series Number   : " + seriesNumber);
        System.out.println("Price           : $" + price);
    }
}

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity, String productType) {
        super(brand, seriesNumber, price,productType);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size         : " + screenSize);
        System.out.println("Storage Capacity    : " + storageCapacity);
        System.out.println("----------------------------------------------------------");
    }
}

class Camera extends Product {
    int resolution;
    String lensType;

    Camera(String brand, int seriesNumber, double price, int resolution, String lensType, String productType) {
        super(brand, seriesNumber, price,productType);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution  : " + resolution);
        System.out.println("Lens Type   : " + lensType);
        System.out.println("----------------------------------------------------------");
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType, String productType) {
        super(brand, seriesNumber, price,productType);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Ram Size        : " + ramSize);
        System.out.println("Processor Type  : " + processorType);
        System.out.println("----------------------------------------------------------");
    }
}

public class Tp5_2_H071231002 {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayAllProduct();
                    break;
                case 3:
                    buyProduct();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Harap masukkan nomor antara 1 dan 4.");
            }
        } while (choice != 4);
        scanner.close();
    }

    public static void addProduct() {
        System.out.println("===================== Tambah Produk ======================");
        System.out.print("Masukkan Nama Produk  : ");
        String brand = sc.nextLine();
        System.out.print("Masukkan Nomor Seri   : ");
        int seriesNumber = sc.nextInt();
        System.out.print("Masukkan Harga        : ");
        double price = sc.nextDouble();
        sc.nextLine();

        int productType;
        do {
            System.out.println("==================== Pilih Tipe Produk ===================");
            System.out.println("1. Smartphone\n2. Laptop\n3. Camera");
            System.out.print("Pilih tipe produk (1-3): ");
            productType = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------------------------------");
        } while (productType < 1 || productType > 3);

        switch (productType) {
            case 1:
                System.out.print("Masukkan Ukuran Layar (inci)          : ");
                double screenSize = sc.nextDouble();
                sc.nextLine();
                System.out.print("Masukkan Kapasitas Penyimpanan (GB)   : ");
                int storageCapacity = sc.nextInt();
                sc.nextLine();
                String tipeProduk = "Smartphone";
                System.out.println("----------------------------------------------------------");
                products.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity, tipeProduk));
                break;
            case 2:
                System.out.print("Masukkan Ukuran RAM       : ");
                int ramSize = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Tipe Prosesor    : ");
                String processorType = sc.nextLine();
                String tipeProduk2 = "Laptop";
                System.out.println("----------------------------------------------------------");
                products.add(new Laptop(brand, seriesNumber, price, ramSize, processorType, tipeProduk2));
                break;
            case 3:
                System.out.print("Masukkan Resolusi     : ");
                int resolution = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Tipe Lensa   : ");
                String lensType = sc.nextLine();
                String tipeProduk3 = "Camera";
                System.out.println("----------------------------------------------------------");
                products.add(new Camera(brand, seriesNumber, price, resolution, lensType, tipeProduk3));
                break;

            default:
                System.out.println("Invalid Product Type...");
        }
        System.out.print("Produk Berhasil Ditambahkan!");
    }

    public static void displayAllProduct() {
        System.out.println("\n====================== DAFTAR PRODUK =====================");
        if (products.isEmpty()) {
            System.out.println("No product Found");
        } else {
            for (Product product : products) {
                product.displayInfo();
            }
        }
    }


    private static void buyProduct() {
        if (products.isEmpty()) {
            System.out.println("Tidak ada produk yang tersedia untuk dibeli.");
            return;
        }

        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int seriesNumber = sc.nextInt();

        boolean found = false;
        for (Product product : products) {
            if (product.seriesNumber == seriesNumber) {
                found = true;
                System.out.println("Anda telah membeli produk:");
                product.displayInfo();
                products.remove(product);
                break;
            }
        }
        if (!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }
}
