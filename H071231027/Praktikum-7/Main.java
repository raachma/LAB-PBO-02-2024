import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = null;
        List<Karyawan> daftarKaryawan = new ArrayList<>();
        Sound sound = new Sound();

        while (true) {
            System.out.println("\nData karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "a":
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();

                    System.out.print("Masukkan umur: ");
                    int umur = Integer.parseInt(scanner.nextLine());

                    Keluarga keluarga = new Keluarga();
                    keluarga.prosesKehidupan();

                    Pengalaman pengalaman = new Pengalaman();
                    pengalaman.prosesKehidupan();

                    Pendidikan pendidikan = new Pendidikan();
                    pendidikan.prosesKehidupan();

                    Projek projek = new Projek();
                    projek.prosesKehidupan();

                    if ((pendidikan.getInputPendidikan() <= 1 || projek.getInputProjek() < 2 || umur < 18
                            || pengalaman.getInputOrganisasi() == "tidak ada"
                            || pengalaman.getInputPengalaman() <= 0)) {

                        System.out.println("Karyawan tidak memenuhi syarat.");
                        sound.playSound("Error.wav");
                    } else {
                        System.out.println("Pengalaman sedang diproses....");
                        System.out.println("Pendidikan terakhir: " + pendidikan.getJenjang());
                        System.out.print("Jumlah projek IT: ");
                        projek.getJumlahProjek();
                        System.out.println();
                        System.out.println("====================");
                        System.out.println("Selamat, karyawan diterima");
                        System.out.println("====================");
                        sound.playSound("Accepted.wav");
                        karyawan = new Karyawan(nama, umur, "Karyawan", pengalaman.getGajiSebelumnya());
                        daftarKaryawan.add(karyawan);
                    }
                    break;
                case "b":

                    if (daftarKaryawan.isEmpty()) {
                        System.out.println("Belum ada data karyawan.");
                    } else {
                        System.out.println("Detail Karyawan yang Diterima:");
                        for (Karyawan karyawan1 : daftarKaryawan) {
                            karyawan1.prosesKehidupan();
                        }
                    }
                    break;
                case "c":
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
