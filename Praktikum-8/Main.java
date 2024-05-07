import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        Scanner input = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        boolean diterima = false;

        while (true) {
            System.out.println("\nData karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "a":
                    System.out.print("Masukkan nama: ");
                    karyawan.setNama(input.nextLine());

                    System.out.print("Masukkan umur: ");
                    int umur = 0;
                    while (true) {
                        try {
                            umur = Integer.parseInt(input.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.print("Inputan harus berupa integer: ");
                        }
                    }
                    karyawan.setUmur(umur);




                    System.out.println("Pengalaman sebelumnya:");
                    System.out.println("1. Freelancer");
                    System.out.println("2. Magang");
                    System.out.println("3. Pekerja tetap");
                    System.out.println("4. Tidak ada");
                    System.out.print("Input: ");
                    int pengalamanInput = 0;
                    while (true) {
                        try {
                            pengalamanInput = Integer.parseInt(input.nextLine());
                            if (pengalamanInput >= 1 && pengalamanInput <= 4) {
                                break;
                            } else {
                                System.out.print("Inputan harus berupa angka 1-4: ");
                            }
                        } catch (NumberFormatException e) {
                            System.out.print("Inputan harus berupa angka 1-4: ");
                        }
                    }
                    String jenisPekerjaan = "";
                    switch (pengalamanInput) {
                        case 1:
                            jenisPekerjaan = "Freelancer";
                            break;
                        case 2:
                            jenisPekerjaan = "Magang";
                            break;
                        case 3:
                            jenisPekerjaan = "Pekerja tetap";
                            break;
                        case 4:
                            jenisPekerjaan = "Tidak ada";
                            break;
                    }
                    Pengalaman pengalaman = new Pengalaman(jenisPekerjaan);

                    if (pengalamanInput != 4) {
                        System.out.print("Gaji sebelumnya: ");
                        double gajiSebelumnya = 0;
                        while (true) {
                            try {
                                gajiSebelumnya = Double.parseDouble(input.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.print("Inputan harus berupa angka: ");
                            }
                        }
                        karyawan.setGaji(gajiSebelumnya);
                    }

                    System.out.println("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
                    String pendidikanInput = input.nextLine();
                    Pendidikan pendidikan = new Pendidikan(pendidikanInput);

                    System.out.println("Projek IT:\n1.Minimal 4\n2.Minimal 8\n3.Minimal 12 \n4.Lebih dari 15");
                    System.out.print("Input: ");
                    int proyekInput = 0;
                    while (true) {
                        try {
                            proyekInput = Integer.parseInt(input.nextLine());
                            if (proyekInput >= 1 && proyekInput <= 4) {
                                break;
                            } else {
                                System.out.print("Inputan harus berupa angka 1-4: ");
                            }
                        } catch (NumberFormatException e) {
                            System.out.print("Inputan harus berupa angka 1-4: ");
                        }
                    }
                    int jumlahProyek = 0;
                    switch (proyekInput) {
                        case 1:
                            jumlahProyek = 4;
                            break;
                        case 2:
                            jumlahProyek = 8;
                            break;
                        case 3:
                            jumlahProyek = 12;
                            break;
                        case 4:
                            jumlahProyek = 16;
                            break;
                    }
                    Projek projek = new Projek(jumlahProyek);

                    System.out.println("Kondisi Keluarga: (Harmonis/Kurang Harmonis/Tidak Harmonis): ");
                    String KondisiKeluargaInput = input.nextLine();
                    Keluarga Keluarga = new Keluarga(KondisiKeluargaInput);

                    
                    
                    System.out.println("\nPengalaman sedang diproses...\n");
                    pengalaman.prosesKehidupan();
                    pendidikan.tampilkanPendidikan();
                    projek.tampilkanJumlahProyek();
                    Keluarga.MenampilkanKondisi();


                    if (pendidikanInput.equalsIgnoreCase("SD") || pendidikanInput.equalsIgnoreCase("SMP")
                            || jumlahProyek == 4 || umur < 18) {
                        System.out.println("============\nKaryawan tidak memenuhi syarat.\n============");
                    
                    } else {
                        System.out.println("============\nSelamat, karyawan diterima!\n============");
                        AudioFile.Audio("ringtone4.wav");
                        karyawan.setJabatan("Karyawan");
                        diterima = true;
                    }
                    break;

                case "b":
                    if (diterima) {
                        System.out.println("\nDetail karyawan:");
                        System.out.println("Nama: " + karyawan.getNama());
                        System.out.println("Umur: " + karyawan.getUmur());
                        System.out.println("Jabatan: " + karyawan.getJabatan());
                        System.out.println("Gaji: " + karyawan.getGaji());
                    } else {
                        System.out.println("\nBelum ada data karyawan.");
                    }
                    break;

                case "c":
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
