import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
        try{

        double pi = 3.14;

        System.out.println("Masukkan Jari-Jari: ");
        double Jari2 = InputUser.nextInt();


        double hasil = pi * Jari2 * Jari2;

        System.out.printf("%.2f",hasil);
        InputUser.close();
        
    }catch (Exception e){
        System.out.println("Input Harus berupa angka");
    }


    }
    
}
