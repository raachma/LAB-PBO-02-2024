import java.util.Scanner;

public class InputBukanAngka {
    public static int inputInteger(Scanner scan, String kata) {
        while (true) {
            System.out.print(kata);
            try {
                int angka = Integer.parseInt(scan.nextLine()); //Mencoba mengonversi input pengguna menjadi bilangan bulat
                return angka;
            } catch (NumberFormatException e) { //Jika input yang dimasukkan bukan bilangan bulat
                System.out.println("Inputan harus berupa bilangan bulat. Silahkan coba lagi.");
            }
        }
    }

    public static double inputDouble(Scanner scan, String kata) {
        while (true) {
            System.out.print(kata);
            try {
                double angka = Double.parseDouble(scan.nextLine()); //mencoba mengonversi input pengguna menjadi tipe data double 
                return angka;
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka. Silahkan coba lagi.");
            }
        }
    }
}
