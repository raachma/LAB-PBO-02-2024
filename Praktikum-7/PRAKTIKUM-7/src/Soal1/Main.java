package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner InputUser = new Scanner(System.in);
        Karyawan[] Karyawan = new Karyawan[10];
        int MenerimaKaryawan = 0;

        char PilihMenu;

        do {
            System.out.println("DATA KARYAWAN: ");
            System.out.println("a. Tambahkan Data karyawan ");
            System.out.println("b. Tampilkan Data karyawan ");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");

            PilihMenu = InputUser.next().charAt(0);

            switch (PilihMenu) {
                
                case 'a':
                    if (MenerimaKaryawan < Karyawan.length) {
                        System.out.println("Masukkan Nama: ");
                        String Nama = InputUser.next();

                        System.out.println("Masukkan umur: ");
                        int Umur = InputUser.nextInt();

                        System.out.println("pengalaman sebelumnya:");
                        System.out.println("1. Freelancer");
                        System.out.println("2. Magang");
                        System.out.println("3. Pekerja Tetap");
                        System.out.println("4. Tidak Ada");
                        System.out.print("Pilihan: ");
                        int PilihanPengalaman = InputUser.nextInt();
                        String jabatan = "";
                        int gaji = 0;
                        String pendidikanTerakhir = " ";
                        int jumlahProjekMinimal = 0;

                        switch (PilihanPengalaman) {
                            case 1:
                                jabatan = "Freelancer";
                                System.out.print("Gaji Sebelumnya: ");
                                gaji = InputUser.nextInt();

                                System.out.print("Pendidikan Terakhir (SD/SMP/SMA/S1/S2/S3): ");
                                pendidikanTerakhir = InputUser.next();

                                System.out.println("Projek IT:");
                                System.out.println("1. Minimal 4");
                                System.out.println("2. Minimal 8");
                                System.out.println("3. Minimal 12");
                                System.out.println("4. Lebih dari 15");
                                System.out.print("Pilihan: ");
                                int pilihanProjek = InputUser.nextInt();
                                switch (pilihanProjek) {
                                    case 1:
                                        jumlahProjekMinimal = 4;
                                        break;
                                    case 2:
                                        jumlahProjekMinimal = 8;
                                        break;
                                    case 3:
                                        jumlahProjekMinimal = 12;
                                        break;
                                    case 4:
                                        jumlahProjekMinimal = 15;
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid!");
                                }
                                break;

                            case 2:
                                jabatan = "Magang";
                                System.out.print("Gaji Sebelumnya: ");
                                int gaji1 = InputUser.nextInt();

                                System.out.print("Pendidikan Terakhir (SD/SMP/SMA/S1/S2/S3): ");
                                String pendidikanTerakhir1 = InputUser.next();

                                System.out.println("Pilih jumlah proyek minimal:");
                                System.out.println("1. Minimal 4");
                                System.out.println("2. Minimal 8");
                                System.out.println("3. Minimal 12");
                                System.out.println("4. Lebih dari 15");
                                System.out.print("Pilihan: ");
                                int pilihanProjek1 = InputUser.nextInt();
                                switch (pilihanProjek1) {
                                    case 1:
                                        jumlahProjekMinimal = 4;
                                        break;
                                    case 2:
                                        jumlahProjekMinimal = 8;
                                        break;
                                    case 3:
                                        jumlahProjekMinimal = 12;
                                        break;
                                    case 4:
                                        jumlahProjekMinimal = 15;
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid!");
                                        break;
                                }
                                break;

                            case 3:
                                jabatan = "Pekerja Tetap";
                                System.out.print("Gaji Sebelumnya: ");
                                int gaji2 = InputUser.nextInt();

                                System.out.print("Pendidikan Terakhir (SD/SMP/SMA/S1/S2/S3): ");
                                String pendidikanTerakhir2= InputUser.next();

                                System.out.println("Pilih jumlah proyek minimal:");
                                System.out.println("1. Minimal 4");
                                System.out.println("2. Minimal 8");
                                System.out.println("3. Minimal 12");
                                System.out.println("4. Lebih dari 15");
                                System.out.print("Pilihan: ");
                                int pilihanProjek2 = InputUser.nextInt();
                                switch (pilihanProjek2) {
                                    case 1:
                                        jumlahProjekMinimal = 4;
                                        break;
                                    case 2:
                                        jumlahProjekMinimal = 8;
                                        break;
                                    case 3:
                                        jumlahProjekMinimal = 12;
                                        break;
                                    case 4:
                                        jumlahProjekMinimal = 15;
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid!");
                                        break;
                                }
                                break;

                            case 4:
                                jabatan = "Tidak Ada";
                                System.out.print("Pendidikan Terakhir (SD/SMP/SMA/S1/S2/S3): ");
                                String pendidikanTerakhir3 = InputUser.next();

                                System.out.println("Pilih jumlah proyek minimal:");
                                System.out.println("1. Minimal 4");
                                System.out.println("2. Minimal 8");
                                System.out.println("3. Minimal 12");
                                System.out.println("4. Lebih dari 15");
                                System.out.print("Pilihan: ");
                                int pilihanProjek3 = InputUser.nextInt();
                                switch (pilihanProjek3) {
                                    case 1:
                                        jumlahProjekMinimal = 4;
                                        break;
                                    case 2:
                                        jumlahProjekMinimal = 8;
                                        break;
                                    case 3:
                                        jumlahProjekMinimal = 12;
                                        break;
                                    case 4:
                                        jumlahProjekMinimal = 15;
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid!");

                                }
                                break;

                            default:
                                System.out.println("Mohon Masukkan Angka");
                        }
                        if (pendidikanTerakhir.equalsIgnoreCase("SD") || pendidikanTerakhir.equalsIgnoreCase("SMP") && jumlahProjekMinimal == 4) {
                            System.out.println("Karyawan Tidak Memenuhi Syarat");
                        }else{
                        Karyawan[MenerimaKaryawan] = new Karyawan(Nama, Umur, jabatan, 0);
                        if (jabatan.equals("Freelancer") || jabatan.equals("Magang") || jabatan.equals("Pekerja Tetap")) {
                            ((Pendidikan) Karyawan[MenerimaKaryawan]).setSD(pendidikanTerakhir);
                            ((Projek) Karyawan[MenerimaKaryawan]).setProjekIT(jumlahProjekMinimal);
                        } else {
                            ((Pendidikan) Karyawan[MenerimaKaryawan]).setSD(pendidikanTerakhir);
                            ((Projek) Karyawan[MenerimaKaryawan]).setProjekIT(jumlahProjekMinimal);
                        }
                        MenerimaKaryawan++;
                    }
                    } else {
                        System.out.println("Kapasitas yang diterima sudah mencapai batas!");
                    }
                    break;

                case 'b':
                    if (MenerimaKaryawan > 0){
                    System.out.println("\nData Karyawan:");
                    for (int i = 0; i < Karyawan.length; i++) {
                        System.out.println("Karyawan ke-" + (i + 1));
                        System.out.println("Nama: " + Karyawan[i].getNama());
                        System.out.println("Umur: " + Karyawan[i].getUmur());
                        System.out.println("Jabatan: " + Karyawan[i].getJabatan());
                        if (Karyawan[i] instanceof Karyawan) {
                            System.out.println("Gaji: " + Karyawan[i].getGaji());
                        }

                    }

                    break;
                }else{
                    System.out.println("Belum ada data karyawan ditambahkan");
                    break;
                } 
                case 'c':
                    System.out.println("Terimah kasih");
                    break;

                default:
                    System.out.println("Mohon Masukkan Inputan yang valid");

            }
        } while (PilihMenu != 'c');
    
        InputUser.close();
    }
}
