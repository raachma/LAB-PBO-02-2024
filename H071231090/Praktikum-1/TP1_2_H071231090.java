import java.util.Scanner;

public class TP1_2_H071231090 {
    
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        System.out.print("Masukkan Teks: ");
        String teks = xyz.nextLine();
        String[] kata = teks.toLowerCase().split(" ");
        String hasil = "";

        for (int i = 0; i < kata.length; i++) {
            hasil += kata[i].substring(0,1).toUpperCase() + kata[i].substring(1)+ " ";
        }
        System.out.println(""+ hasil);
        xyz.close();
}
}