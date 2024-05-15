import java.util.Scanner;

public class Pengalaman extends Kehidupan {
    String[] pengalaman = { "Freelancer", "Magang", "Pekerja tetap", "Tidak ada" };
    String organisasi;
    int inputPengalaman;
    int gajiSebelumnya;
    String inputOrganisasi;

    @Override
    void prosesKehidupan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pengalaman sebelumnya:");
        for (int i = 0; i < pengalaman.length; i++) {
            System.out.println((i + 1) + ". " + pengalaman[i]);
        }

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Input: ");
                inputPengalaman = Integer.parseInt(scanner.nextLine());
                if (inputPengalaman >= 1 && inputPengalaman <= pengalaman.length) {
                    validInput = true;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka.");
            }
        }
        if (inputPengalaman != 4) {
            System.out.print("Gaji sebelumnya: ");
            gajiSebelumnya = (int) Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Pengalaman Organisasi: ");
        inputOrganisasi = scanner.nextLine();

    }

    public int getInputPengalaman() {
        return inputPengalaman;
    }

    public double getGajiSebelumnya() {
        return gajiSebelumnya;
    }

    public String getInputOrganisasi() {
        return inputOrganisasi;
    }
}