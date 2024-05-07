import java.util.Scanner;

public class TP1_4_H071231047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        double pi = 3.14;

        System.out.println("Masukkan Jari-Jari: ");
        double JariJari = scanner.nextInt();


        double hasil = pi * JariJari * JariJari;

        System.out.printf("%.2f",hasil);
        scanner.close();
        
    }catch (Exception e){
        System.out.println("Input harus berupa angka");
    }


    }
    
}