package TP5_2_H071231047;

class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran RAM: " + ramSize + "GB");
        System.out.println("Tipe Processor: " + processorType);
    }
}