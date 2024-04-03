import java.util.Scanner;

public class TP1_1_H071231090 {
    
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        try{
        System.out.print("Masukkan jumlah bilangan: ");
        int n = xyz.nextInt();
        
        int desimal = 0;
        int bulat = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan ke-" + (i+1) + ": ");
            double num = xyz.nextDouble();
            
            if (num % 2 == 0) {
                bulat++;
            } else {
                desimal++;
            }
        }
        
        System.out.println(bulat + " Bilangan Bulat");
        System.out.println(desimal + " Bilangan Desimal");
        xyz.close();
    } catch (Exception e) {
        System.out.println("Hanya bisa menerima angka");
    }
    }
}