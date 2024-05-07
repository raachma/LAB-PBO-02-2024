package TP5_2_H071231047;

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran Layar: " + screenSize + " inci");
        System.out.println("Kapasitas Penyimpanan: " + storageCapacity + "GB");
    }
}