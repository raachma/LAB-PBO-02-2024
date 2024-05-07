package TP5_2_H071231047;

class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolusi: " + resolution + "MP");
        System.out.println("Tipe Lensa: " + lensType);
    }
}