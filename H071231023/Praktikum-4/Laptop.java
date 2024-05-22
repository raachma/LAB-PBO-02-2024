public class Laptop {
    private String merk;
    private String model;
    private double harga;
    private String deskripsi;
    
    public Laptop(String merk, String model, double harga, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setInfo(String merk, String model, double harga, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }
    
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo", "Ideapad", 500.0, "Laptop ringan dengan layar 14 inci");
        displayInfo(laptop1);
        
        Laptop laptop2 = new Laptop("Apple", "MacBook Pro", 1500.0, "Laptop premium dengan layar retina");
        displayInfo(laptop2);
        
        displaySelfData();
    }
    
    public static void displayInfo(Laptop laptop) {
        System.out.println("Merk: " + laptop.getMerk());
        System.out.println("Model: " + laptop.getModel());
        System.out.println("Harga: $" + laptop.getHarga());
        System.out.println("Deskripsi: " + laptop.getDeskripsi());
        System.out.println();
    }
    
    public static void displaySelfData() {
        System.out.println("Nama: Muhammad Rifky Kurniawan");
        System.out.println("NIM: H071231023");
    }
}