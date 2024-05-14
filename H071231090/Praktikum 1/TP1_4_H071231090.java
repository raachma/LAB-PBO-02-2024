import java.util.Scanner;

public class TP1_4_H071231090 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = xyz.nextDouble();
   
            double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
            System.out.printf("Luas lingkaran adalah: %.2f", luasLingkaran);
         } catch (Exception e) {
            System.out.println("Hanya menerima angka");
         }
         xyz.close();
    }
    
}