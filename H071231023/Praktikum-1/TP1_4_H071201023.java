import java.util.Scanner;

public class TP1_4_H071201023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 0;

        try {
            System.out.print("");
            radius = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Masukan tidak valid. Pastikan Anda memasukkan angka.");
            scanner.close(); 
            return;
        }

        scanner.close(); 

        double area = Math.PI * radius * radius;
        System.out.printf("%.2f\n", area);
    }
}