package Praktikum.Tuprak;
import java.util.Scanner;

public class TP1_4_H071231002 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jari = inp.nextDouble();
   
            double luasLingkaran = 3.14 * jari * jari;
            System.out.printf("Luas lingkaran adalah: %.2f", luasLingkaran);
         } catch (Exception e) {
            System.out.println("Input bukan angka");
         }
         inp.close();
    }
}
