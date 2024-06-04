import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.*;

public class MainCode {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        Scanner inputan = new Scanner(System.in);
        List<Karyawan> karyawan = new ArrayList<>();
        String[] validFormat = {"SD", "SMP", "SMA", "SMK", "S1", "S2", "S3"};

        try{
            while (true){
                System.out.println(" ");
                System.out.println("Data Karyawan");
                System.out.println("a. Tambah data karyawan\nb. Tampilkan detail karyawan\nc. Keluar");
                System.out.print("Pilih opsi (a-c): ");
                String input = inputan.nextLine();

                switch (input) {
                    
                    case "a":
                        System.out.print("Masukkan nama: ");
                        String nama = inputan.nextLine();
                        System.out.print("Masukkan umur: ");
                        int umur = inputan.nextInt();
                        inputan.nextLine();
                        System.out.println("Pengalaman sebelumnya: ");
                        System.out.println("1. Freelancer\n2. Magang\n3. Pekerja tetap\n4. Tidak ada");
                        System.out.print("Input: ");
                        int pengalaman = inputan.nextInt();
                        inputan.nextLine();

                        if (pengalaman >= 5) {
                            System.out.println("=".repeat(50));
                            System.out.println("Inputan tidak valid.");
                            System.out.println("=".repeat(50));
                            break;
                        }

                        String tingkatPendidikan = "";
                        boolean validInput = false;
                        while (!validInput) {
                            System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
                            tingkatPendidikan = inputan.nextLine();
                            for (String pilih : validFormat) {
                                if (tingkatPendidikan.equals(pilih)) {
                                    validInput = true;
                                    break;
                                }
                            }
                            if (!validInput) {
                                System.out.println("Input tidak valid.");
                            }
                        }

                        if (pengalaman == 4 && tingkatPendidikan.equals("SD") || pengalaman == 4 && tingkatPendidikan.equals("SMP") || umur < 18) {
                            System.out.println("=".repeat(50));
                            System.out.println("Karyawan tidak memenuhi syarat.");
                            System.out.println("=".repeat(50));
                            WavPlayer player = new WavPlayer("C:\\Users\\LENOVO\\OneDrive\\文档\\Praktikum 7\\TP7_1_H071231090\\tidak memenuhi syarat.wav");
                            player.play();
                            break;
                        }

                        System.out.println("Projek IT:");
                        System.out.println("1. Minimal  4\n2. Minimal 8\n3. Minimal 12\n4. Lebih dari 15");
                        System.out.print("Input: ");
                        int jumlahProyek = inputan.nextInt();
                        inputan.nextLine();

                        if (jumlahProyek >= 5) {
                            System.out.println("=".repeat(50));
                            System.out.println("Inputan tidak valid.");
                            System.out.println("=".repeat(50));
                            break;

                        }
                        System.out.println("Pengalaman Organisasi: ");
                        System.out.println("1. Ketua BEM\n2. Ketua Himpunan\n3. Sekretaris Divisi\n4. Bendahara Divisi\n5. Panitia Acara\n6. Tidak ada");
                        System.out.print("Input: ");
                        int tentukanOrganisasi = inputan.nextInt();
                        inputan.nextLine();

                        if (tentukanOrganisasi >= 7) {
                            System.out.println("=".repeat(50));
                            System.out.println("Inputan tidak valid.");
                            System.out.println("=".repeat(50));
                            break;
                        }

                        Pengalaman org = new Pengalaman("");
                        String OrganisasiInfo = org.OrganisasiInfo(tentukanOrganisasi);
                        System.out.println("Pengalaman sedang diproses...");
                        System.out.println("Pendidikan terakhir: " + tingkatPendidikan);
                        System.out.println("Pengalaman Organisasi: " + OrganisasiInfo);

                        if (jumlahProyek == 1 && tentukanOrganisasi == 6) {
                            System.out.println("=".repeat(50));
                            System.out.println("Karyawan tidak memenuhi syarat.");
                            System.out.println("=".repeat(50));
                            WavPlayer player = new WavPlayer("C:\\Users\\LENOVO\\OneDrive\\文档\\Praktikum 7\\TP7_1_H071231090\\tidak memenuhi syarat.wav");
                            player.play();
                            break;
                        }else {
                            Karyawan karyawan1 = new Karyawan(nama, umur, jumlahProyek, OrganisasiInfo, false, tingkatPendidikan);
                            karyawan.add(karyawan1);
                            System.out.print("Status pernikahan (true untuk Menikah, false untuk Belum menikah): ");
                            boolean statusMenikah = inputan.nextBoolean();
                            System.out.println("Status pernikahan: " + (statusMenikah ? "Menikah" : "Belum menikah"));
                            System.out.println("=".repeat(50));
                            System.out.println("Selamat, karyawan diterima!");
                            System.out.println("=".repeat(50));
                            WavPlayer player12 = new WavPlayer("C:\\Users\\LENOVO\\OneDrive\\文档\\Praktikum 7\\TP7_1_H071231090\\diterima.wav");
                            player12.play();
                        }
                        break;

                    case "b":
                    if (karyawan.isEmpty()) {
                        System.out.println("=".repeat(50));
                        System.out.println("Belum ada data karyawan.");
                        System.out.println("=".repeat(50));
                    } else {
                        for (Karyawan kar : karyawan) {
                            kar.displayDetail();
                        }
                    }
                        break;

                    case "c":
                        System.out.println("=".repeat(50));
                        System.out.println("Sampai jumpa!");
                        System.out.println("=".repeat(50));
                        break;
                    default:
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("=".repeat(50));
            System.out.println("Inputan tidak valid");
            System.out.println("=".repeat(50));

        } finally {
            inputan.close();
            }
    }
}
