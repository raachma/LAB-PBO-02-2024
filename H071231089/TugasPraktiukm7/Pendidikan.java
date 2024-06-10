import java.util.Scanner;

public class Pendidikan {
    String inputPendidikan;

    public void prosesPendidikan() {
        Scanner scan = new Scanner(System.in);

        while (true) { //Loop tak hingga yang digunakan untuk meminta input pengguna hingga input yang valid diterima.
            System.out.print("Masukkan tingkat pendidikan (SD/SMP/SMA/S1/S2/S3): ");
            inputPendidikan = scan.nextLine().toUpperCase(); //Membuat objek Scanner untuk membaca input dari pengguna.
            if (inputPendidikan.equals("SD") || inputPendidikan.equals("SMP") || inputPendidikan.equals("SMA") ||
                inputPendidikan.equals("S1") || inputPendidikan.equals("S2") || inputPendidikan.equals("S3")) {
                break;
            } else {
                System.out.println("Tingkat pendidikan yang dimasukkan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public String getInputPendidikan() {
        return inputPendidikan;
    }

    public void setInputPendidikan(String inputPendidikan) {
        this.inputPendidikan = inputPendidikan;
    }
}
