import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Data Karyawan:");
            System.out.println("a. Tambah data Karyawan \nb. Tampilkan detail karyawan \nc. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String opsi = scan.nextLine();
            switch (opsi) {
                case "a":
                    System.out.print("Masukkan nama: ");
                    String nama = scan.nextLine();
                    boolean cekUmur = false;
                    int umur = InputBukanAngka.inputInteger(scan, "Masukkan umur: ");
                    if (umur >= 0) {
                        cekUmur = true;
                    } else {
                        System.out.println("Umur harus bernilai positif.");
                    }

                    Pengalaman pengalaman = new Pengalaman();
                    pengalaman.prosesKehidupan();

                    Pendidikan pendidikan = new Pendidikan();
                    pendidikan.prosesPendidikan();

                    Keluarga keluarga = new Keluarga();
                    keluarga.statusKeluarga();
                    
                    // Proses projek
                    Projek projek = new Projek();
                    projek.jenisProjek();
                    int jumlahProjek = projek.getJumlahProjek();

                    String inputPendidikan = pendidikan.getInputPendidikan();

                    String jabatan = "Karyawan";
                    
                    if (!inputPendidikan.equalsIgnoreCase("SD") && !inputPendidikan.equalsIgnoreCase("SMP") && jumlahProjek > 4 && umur >= 18) {
                        System.out.println("Pengalaman sedang diproses...");
                        System.out.println("Pendidikan terakhir: " + inputPendidikan);
                        System.out.println("Jumlah projek IT: " + jumlahProjek);
                        System.out.println("============================");
                        System.out.println("Selamat, karyawan diterima!");
                        System.out.println("============================");

                        pengalaman.gajiSebelumnya += 1000000;
                        Karyawan karyawan = new Karyawan(nama, umur, jabatan, pengalaman.gajiSebelumnya);
                        daftarKaryawan.add(karyawan);
                        karyawan.soundDiterima();

                    } else {
                        System.out.println("Karyawan tidak memenuhi syarat.");
                        Karyawan karyawan = new Karyawan();
                        karyawan.soundDitolak();
                    }
                    break;

                case "b":
                    if (daftarKaryawan.isEmpty()) {
                        System.out.println("Belum ada data karyawan");
                    } else {
                        System.out.println("Detail Semua Karyawan:");
                        for (Karyawan karyawan : daftarKaryawan) {
                            karyawan.tampilkanDetilKaryawan();
                        }
                    }
                    break;
                    
                case "c":
                    System.out.println("Terima kasih!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Inputan tidak valid. Silahkan masukkan a-c");
            }
        }
        scan.close();
    }
}
