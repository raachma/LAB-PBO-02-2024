import java.util.Scanner;

public class Keluarga extends Kehidupan {
    boolean sudahMenikah;

    @Override
    public void prosesKehidupan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah sudah menikah? (ya/tidak): ");
        String input = scanner.nextLine().toLowerCase();
        sudahMenikah = input.equals("ya");
    }

    public void sudahMenikah() {
        if (sudahMenikah == true) {
            System.out.println("Status: Sudah menikah");
        } else {
            System.out.println("Status: Belum menikah");
        }

    }
}
