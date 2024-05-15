import java.util.Scanner;

public class Projek extends Kehidupan {
    int inputProjek;

    public void prosesKehidupan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Input: ");
                inputProjek = Integer.parseInt(scanner.nextLine());
                if (inputProjek >= 1 && inputProjek <= 4) {
                    validInput = true;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka.");
            }
        }
    }

    public int getInputProjek() {
        return inputProjek;
    }

    public void getJumlahProjek() {
        if (inputProjek == 1) {
            System.out.print("4");
        } else if (inputProjek == 2) {
            System.out.print("8");
        } else if (inputProjek == 3) {
            System.out.print("12");
        } else if (inputProjek == 4) {
            System.out.print("15");
        }
    }
}
