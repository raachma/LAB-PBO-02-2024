import java.util.Scanner;

class Pengalaman extends Kehidupan { //Mendeklarasikan kelas Pengalaman yang mewarisi dari kelas Kehidupan
    String[] pengalaman = {"Freelancer", "Magang", "Pekerja Tetap", "Tidak ada" };
    int inputPengalaman;
    double gajiSebelumnya;
    String inputOganisasi;

    @Override //Menandakan bahwa prosesKehidupan meng-override dengan nama yang sama di superclass Kehidupan
    void prosesKehidupan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pengalaman sebelumnya:");
        for (int i = 0; i < pengalaman.length; i++) { //Loop untuk mencetak setiap pilihan pengalaman kerja dari array pengalaman.
            System.out.println((i + 1) + ". " + pengalaman[i]);
        }
        inputPengalaman = InputBukanAngka.inputInteger(scan, "Input: ");

        if (inputPengalaman != 4) {
            gajiSebelumnya = InputBukanAngka.inputDouble(scan, "Gaji Sebelumnya: ");
        }

        System.out.print("Pengalaman Organisasi: ");
        inputOganisasi = scan.nextLine();
    }
    public void jenisPekerjaan(String jenisPekerjaan) {
        System.out.println("Jenis Pekerjaan: " + jenisPekerjaan);
    }
    public String[] getPengalaman() {
        return pengalaman;
    }
    public void setPengalaman(String[] pengalaman) {
        this.pengalaman = pengalaman;
    }
    public int getInputPengalaman() {
        return inputPengalaman;
    }
    public void setInputPengalaman(int inputPengalaman) {
        this.inputPengalaman = inputPengalaman;
    }
    public double getGajiSebelumnya() {
        return gajiSebelumnya;
    }
    public void setGajiSebelumnya(double gajiSebelumnya) {
        this.gajiSebelumnya = gajiSebelumnya;
    }
    public String getInputOganisasi() {
        return inputOganisasi;
    }
    public void setInputOganisasi(String inputOganisasi) {
        this.inputOganisasi = inputOganisasi;
    }
}
