import java.util.Scanner;

public class TP1_4_H071231027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = 0;
        for (int i = 0; i < 1; i++)
            try {
                System.out.print("Masukkan nilai r = ");
                r = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Masukkan Angka!!!");
                input.nextLine();
                i--;
            }
        System.out.printf("Hasil : %.2f", LuasLingkaran(r));
    }

    public static double LuasLingkaran(double r) {
        return 3.14 * r * r;
    }
}
