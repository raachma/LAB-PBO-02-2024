package Praktikum.Tuprak;
import java.util.Scanner;

public class TP1_2_H071231002 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Judul Film : ");
        String judul = scanner.nextLine();

        System.out.println(Title(judul));

    }

    public static String Title(String judul) {
        judul = judul.toLowerCase();
        char[] inputArray = judul.toCharArray();

        for (int i = 0; i < inputArray.length ; i++) {

            if(i == 0 || inputArray[i-1] == ' '){

                inputArray[i] = Character.toUpperCase(inputArray[i]);
            }
        }
        String result = new String(inputArray);
        return result;
    }
}
