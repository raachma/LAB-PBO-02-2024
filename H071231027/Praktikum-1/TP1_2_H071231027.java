import java.util.ArrayList;
import java.util.Scanner;

public class TP1_2_H071231027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan Judul Film : ");
        // String kalimat = input.nextLine();
        // kalimatKapital1(kalimat);
        System.out.println("Masukkan judul film");
        String kata = input.nextLine();
        String[] text = kata.toLowerCase().split(" ");
        String textBaru = "";

        for (int i = 0; i < text.length; ++i) {
            textBaru += text[i].substring(0, 1).toUpperCase() + text[i].substring(1) + " ";
        }
        System.out.println("" + textBaru);
    }

    // public static void kalimatKapital1(String i) {

    // ArrayList<String> kapital = new ArrayList<>();
    // String[] Katakata = i.split(" ");

    // for (String kata : Katakata) {
    // String kataKapital = kata.substring(0, 1).toUpperCase() +
    // kata.substring(1).toLowerCase();
    // kapital.add(kataKapital);
    // }

    // String kalimatKapital = String.join(" ", kapital);
    // System.out.println(kalimatKapital);
    // }
}
