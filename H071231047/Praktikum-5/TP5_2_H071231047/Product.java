package TP5_2_H071231047;

class Product {
    String brand;
    int seriesNumber;
    double price;

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Merek: " + brand);
        System.out.println("Nomor Seri: " + seriesNumber);
        System.out.println("Harga: $" + price);
    }
}