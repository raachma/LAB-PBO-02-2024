class Pou {
    String nama;
    int energy;
    String mood;

    // Method Setter Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // Constructor
    public Pou(){

    }

    public Pou(String nama, int energy) {
        this.nama = nama;
        this.energy = energy;
    }


    // Method 
    public void pouInfo() {
        System.out.println("========================================================");
        System.out.println("Nama " + nama + "\nMemiliki Energy Awal: " + energy + "\n");
    }

    public void lastInfo() {
        System.out.println("========================================================");
        System.out.println(this.nama + " Memiliki Energy: " + this.energy + "\n"  + "Dengan Mood " + this.mood + "\n");
    }

    public void mainGame(){
        System.out.println("Pou Sedang bermain , energi berkurang 10\n");
        this.energy -= 10;
        this.mood = "CaPe";
    }

    public void makan(){
        System.out.println("Pou Sedang makan , energi bertambah 10\n");
        this.energy += 10;
        this.mood = "Baik";
    }
}




public class TP3_1_H071231090 {
    public static void main(String[] args) {
        Pou pou1 = new Pou("Pou", 100);

        pou1.pouInfo();
    
        pou1.mainGame();
        pou1.lastInfo();
        pou1.makan();
        pou1.lastInfo();

        Pou pou2 = new Pou("Pou Kedua", 100);
        pou2.pouInfo();
    
        pou2.mainGame();
        pou2.lastInfo();
        pou2.makan();
        pou2.lastInfo();

    }
}