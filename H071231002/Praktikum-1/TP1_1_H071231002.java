package Praktikum.Tuprak;
import java.util.Scanner;

public class TP1_1_H071231002 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try{
        System.out.print("Masukkan jumlah bilangan: ");
        int banyak = inp.nextInt();
        
        int desimal = 0;
        int bulat = 0;
        
        for (int i = 0; i < banyak; i++) {
            double angka = inp.nextDouble();
            
            if (angka % 1 == 0) {
                bulat++;
            } else {
                desimal++;
            }
        }
        
        System.out.println(bulat + " Bilangan Bulat");
        System.out.println(desimal + " Bilangan Desimal");
        inp.close();
    } catch (Exception e) {
        System.out.println("Input bukan angka");
    }
    }
}
