import java.io.IOException;
import java.util.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


abstract class Kehidupan {
    public abstract void prosesKehidupan();
}

class Pengalaman extends Kehidupan {
    private String jenisPekerjaan;
    private String sertifikasi;
    private String organisasi;

    public Pengalaman(String jenisPekerjaan, String sertifikasi, String organisasi) {
        this.jenisPekerjaan = jenisPekerjaan;
        this.sertifikasi = sertifikasi;
        this.organisasi = organisasi;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Pengalaman kerja:");
        System.out.println("Jenis Pekerjaan: " + jenisPekerjaan);
        System.out.println("Sertifikasi: " + sertifikasi);
        System.out.println("Organisasi: " + organisasi);
    }
}

class Pendidikan {
    private String tingkatPendidikan;

    public Pendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public void pendidikanTerakhir() {
        System.out.println("Pendidikan terakhir: " + tingkatPendidikan);
    }
}

class Projek {
    private int jumlahProjek;

    public Projek() {
        this.jumlahProjek = 0;
    }

    public void tambahProjek(int jumlah) {
        this.jumlahProjek += jumlah;
    }

    public int getJumlahProjek() {
        return jumlahProjek;
    }

    @Override
    public String toString() {
        return "Jumlah projek IT: " + jumlahProjek;
    }
}

class Organisasi {
    public String jenisOrganisasi(int pilihan) {
        String jenis = "";
        switch (pilihan) {
            case 1:
                jenis = "Pengurus OSIS";
                break;
            case 2:
                jenis = "Ketua Himpunan";
                break;
            case 3:
                jenis = "Anggota PASKIBRA";
                break;
            case 4:
                jenis = "Tidak ada";
                break;
            default:
                jenis = "Tidak ada";
                break;
        }
        return jenis;
    }
}

class Karyawan {
    private String nama;
    private int umur;
    private String jabatan;
    private double gaji;
    private boolean menikah;
    private Projek projek;
    private Pengalaman pengalaman;
    private Pendidikan pendidikan;
    private String jenisOrganisasi;

    public Karyawan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = "Karyawan";
        this.gaji = 0.0;
        this.menikah = false;
        this.projek = new Projek();
        this.jenisOrganisasi = "Tidak ada";
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public void setPengalaman(String jenisPekerjaan, String sertifikasi, String organisasi) {
        this.pengalaman = new Pengalaman(jenisPekerjaan, sertifikasi, organisasi);
    }

    public void setPendidikan(String tingkatPendidikan) {
        this.pendidikan = new Pendidikan(tingkatPendidikan);
    }

    public void tambahProjek(int jumlah) {
        projek.tambahProjek(jumlah);
    }

    public void setProjek(Projek projek) {
        this.projek = projek;
    }

    public void setJenisOrganisasi(String jenisOrganisasi) {
        this.jenisOrganisasi = jenisOrganisasi;
    }

    public void displayDetail() {
        System.out.println();
        System.out.println("Detail karyawan:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jabatan: " + jabatan);
        System.out.printf("Gaji: %.0f%n", gaji);
        System.out.println("Status Pernikahan: " + (menikah ? "Sudah Menikah" : "Belum Menikah"));
        System.out.println("Jenis Organisasi: " + jenisOrganisasi);
        
        System.out.print("Jumlah projek IT: ");
        if (projek.getJumlahProjek() ==1 ) {
            System.out.println("minimal 4");
        } else if (projek.getJumlahProjek() == 2 ) {
            System.out.println("minimal 8");
        } else if (projek.getJumlahProjek() == 3) {
            System.out.println("minimal 12");
        } else {
            System.out.println("lebih dari 15");
        }

        if (pengalaman != null) {
            pengalaman.prosesKehidupan();
        }

        if (pendidikan != null) {
            pendidikan.pendidikanTerakhir();
        }
    }
}

public class TP7_H071231023 {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        Scanner input = new Scanner(System.in);
        List<Karyawan> daftarKaryawan = new ArrayList<>();

        try {
            while (true) {
                System.out.println("\nData karyawan:");
                System.out.println("a. Tambah data karyawan");
                System.out.println("b. Tampilkan detail karyawan");
                System.out.println("c. Keluar");
                System.out.print("Pilih opsi (a-c): ");
                String opsi = input.nextLine();

                switch (opsi) {
                    case "a":
                        System.out.print("Masukkan nama: ");
                        String nama = input.nextLine();

                        System.out.print("Masukkan umur: ");
                        int umur = Integer.parseInt(input.nextLine());

                        System.out.println("Pengalaman sebelumnya:");
                        System.out.println("1. Freelancer");
                        System.out.println("2. Magang");
                        System.out.println("3. Pekerja tetap");
                        System.out.println("4. Tidak ada");
                        System.out.print("Input: ");
                        int pengalaman = Integer.parseInt(input.nextLine());

                        if (pengalaman == 4 || umur < 18) {
                            System.out.println("Maaf, karyawan tidak memenuhi syarat.");
                            System.out.println("Suara: Oh tidak!");
                            break;
                        }

                        Organisasi organisasi = new Organisasi();
                        System.out.println("Organisasi:");
                        System.out.println("1. Pengurus OSIS");
                        System.out.println("2. Ketua Himpunan");
                        System.out.println("3. Anggota PASKIBRA");
                        System.out.println("4. Tidak ada");
                        System.out.print("Input: ");
                        int pilihanOrganisasi = Integer.parseInt(input.nextLine());
                        String jenisOrganisasi = organisasi.jenisOrganisasi(pilihanOrganisasi);
                        System.out.println("Anda memilih: " + jenisOrganisasi);

                        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
                        String tingkatPendidikan = input.nextLine();

                        Projek projek = new Projek();
                        System.out.println("Projek IT:");
                        System.out.println("1. Minimal 4");
                        System.out.println("2. Minimal 8");
                        System.out.println("3. Minimal 12");
                        System.out.println("4. Lebih dari 15");
                        System.out.print("Input: ");
                        int jumlahProjek = Integer.parseInt(input.nextLine());
                        projek.tambahProjek(jumlahProjek);

                        String jabatan = "Karyawan";
                        if (tingkatPendidikan.equalsIgnoreCase("S3") && jumlahProjek >= 3) {
                            jabatan = "Project Manager";
                        } else if (tingkatPendidikan.equalsIgnoreCase("S2") && jumlahProjek == 2) {
                            jabatan = "Senior Developer";
                        } else if (tingkatPendidikan.equalsIgnoreCase("S1") && jumlahProjek == 1) {
                            jabatan = "Junior Developer";
                        }

                        System.out.println("Status Pernikahan:");
                        System.out.println("1. Sudah Menikah");
                        System.out.println("2. Belum Menikah");
                        System.out.print("Input: ");
                        int statusNikahInput = Integer.parseInt(input.nextLine());
                        boolean statusNikah = (statusNikahInput == 1);

                        Karyawan newKaryawan = new Karyawan(nama, umur);
                        newKaryawan.setJabatan(jabatan);
                        newKaryawan.setGaji(hitungGaji(jabatan));
                        newKaryawan.setMenikah(statusNikah);
                        newKaryawan.setPendidikan(tingkatPendidikan);
                        newKaryawan.setProjek(projek);
                        newKaryawan.setJenisOrganisasi(jenisOrganisasi);
                        daftarKaryawan.add(newKaryawan);

                        System.out.println("=======================");
                        System.out.println("Suara: Selamat, karyawan diterima!");
                        System.out.println("Status Pernikahan: " + (statusNikah ? "Sudah Menikah" : "Belum Menikah"));
                        AudioFile.Audio("suarayes.wav");
                        System.out.println("=======================");
                        break;

                    case "b":
                        if (daftarKaryawan.isEmpty()) {
                            System.out.println("Belum ada data karyawan.");
                        } else {
                            System.out.println("Detail karyawan:");
                            for (Karyawan k : daftarKaryawan) {
                                k.displayDetail();
                            }
                        }
                        break;

                    case "c":
                        System.out.println("Terima kasih!");
                        input.close();
                        return;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        } finally {
            input.close();
        }
    }

    private static double hitungGaji(String jabatan) {
        double gaji = 0.0;
        switch (jabatan) {
            case "Junior Developer":
                gaji = 5000000;
                break;
            case "Senior Developer":
                gaji = 8000000;
                break;
            case "Project Manager":
                gaji = 12000000;
                break;
            default:
                gaji = 3000000; 
                break;
        }
        return gaji;
    }
}
