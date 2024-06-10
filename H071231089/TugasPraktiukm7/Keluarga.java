import java.util.Scanner;

public class Keluarga {
    String status;

    void statusKeluarga() {
        Scanner scan = new Scanner(System.in);
        boolean isValid = false;
        
        while (!isValid) {
            System.out.println("Status (Menikah/Belum Menikah): ");
            status = scan.nextLine().toUpperCase();
            
            if (status.equals("MENIKAH") || status.equals("BELUM MENIKAH")) {
                isValid = true; // Set isValid menjadi true untuk keluar dari loop
            } else {
                System.out.println("Status yang dimasukkan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
