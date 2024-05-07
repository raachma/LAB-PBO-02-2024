package COBAA;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        Product[] products = new Product[10]; 
        int productCount = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambahkan produk");
            System.out.println("2. Tampilkan produk");
            System.out.println("3. Beli produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Tambahkan produk
                    if (productCount < 10) {
                        System.out.print("Masukkan Nama Produk: ");
                        String NamaProduk = scanner.next();
                     
                        System.out.print("Masukkan Nomor Seri: ");
                        int NomorSeri = scanner.nextInt();
                        

                        System.out.print("Masukkan Harga: ");
                        double HargaBarang = scanner.nextDouble();



                        System.out.println("Pilih tipe produk (1-3):");
                        System.out.println("1. Smartphone");
                        System.out.println("2. Kamera");
                        System.out.println("3. Laptop");
                     
                        System.out.print("Masukkan pilihan Anda: ");
                        int TipeProduk = scanner.nextInt();

                        switch (TipeProduk) {
                            case 1:
                                // Tambahkan Smartphone
                             
                                System.out.print("Masukkan ukuran layar smartphone: ");
                                double screenSize = scanner.nextDouble();
                              
                                System.out.print("Masukkan kapasitas penyimpanan smartphone: ");
                                int storageCapacity = scanner.nextInt();

                                products[productCount] = new Smartphone(screenSize, storageCapacity, NamaProduk, NomorSeri, HargaBarang);
                                productCount++;
                                break;
                            case 2:
                                // Tambahkan Kamera
                                System.out.print("Masukkan resolusi kamera: ");
                                int resolution = scanner.nextInt();
                                System.out.print("Masukkan jenis lensa kamera: ");
                                String lensType = scanner.next();

                                products[productCount] = new Camera(resolution, lensType,  NamaProduk, NomorSeri, HargaBarang);
                                productCount++;
                                break;
                            case 3:
                                // Tambahkan Laptop
                                System.out.print("Masukkan ukuran RAM laptop: ");
                                int ramSize = scanner.nextInt();
                              
                                scanner.nextLine();


                                System.out.print("Masukkan jenis prosesor laptop: ");
                                String processorType = scanner.nextLine();

                                products[productCount] = new Laptop(ramSize, processorType,  NamaProduk, NomorSeri, HargaBarang);
                                productCount++;
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    } else {
                        System.out.println("Maaf, tidak dapat menambahkan produk lagi. Batas maksimal produk telah tercapai.");
                    }
                    break;
                case 2:
                    // Tampilkan produk
                    if (productCount > 0) {
                        System.out.println("\nDaftar Produk:");
                        for (int i = 0; i < productCount; i++) {
                            System.out.println("Produk " + (i + 1) + ":");
                            products[i].DisplayInfo();
                            System.out.println("\n");
                        }
                    } else {
                        System.out.println("Belum ada produk yang ditambahkan.");
                    }
                    break;
                case 3:
                    // Beli produk
                    if (productCount > 0) {
                        System.out.print("Masukkan nomor seri produk yang ingin Anda beli: ");
                        int serialNumberToBuy = scanner.nextInt();
                        // boolean found = false;
                        for (int i = 0; i < productCount; i++) {
                            if (products[i].SerialNumber == serialNumberToBuy) {
                            //    found = true;
                               System.out.println("\nAnda telah membeli produk");
                               products[i].DisplayInfo();
                               System.out.println("\n");
                                break;
                                
                            } else {
                            System.out.println("Nomor seri tidak ditemukan.");
                            break;   
                    } 

                }
            } else {
                System.out.println("Belum ada produk yang ditambahkan.");
            }
            break;
                case 4:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
