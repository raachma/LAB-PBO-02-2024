package Praktikum8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TP8_1_H071231023 {
    private static int jumlahData = 4; // Total jumlah data yang akan dimuat
    private static int berhasil; // Penghitung data yang berhasil dimuat

    public static void main(String[] args) {
        System.out.println(String.format("Start Load %d data", jumlahData));

        // Membuat layanan eksekutor untuk mengelola thread
        ExecutorService executorPribadi = Executors.newSingleThreadExecutor();
        ExecutorService executorPribadi1 = Executors.newSingleThreadExecutor();
        UiThread ui = new UiThread();

        // Loop untuk memulai thread yang memuat data
        for (int i = 1; i <= jumlahData; i++) {
            Bot bot = new Bot();
            executorPribadi.execute(ui); // Memulai thread UI
            executorPribadi1.execute(bot); // Memulai thread bot yang memuat data
        }

        executorPribadi1.shutdown(); // Menghentikan eksekutor setelah semua thread selesai dijalankan

        // Menunggu hingga semua thread pada executorPribadi1 selesai
        while (!executorPribadi1.isTerminated()) {
        }

        ui.stopProgram(); // Menghentikan thread UI
        executorPribadi.shutdown(); // Menghentikan eksekutor UI
        while (!executorPribadi.isTerminated()) {
        }

        System.out.println();
        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + UiThread.jumlah + "s");

        // Mengecek jumlah data yang berhasil dimuat
        if (berhasil == jumlahData) {
            System.out.println("All Data Is Successfully Loaded");
        } else {
            int gagal = jumlahData - berhasil; // Menghitung jumlah data yang gagal dimuat
            System.out.println(String.format("%d Data Successfully loaded & %d Data failed to load", berhasil, gagal));
        }
    }

    // Metode sinkronisasi untuk menambah jumlah data yang berhasil dimuat
    public static synchronized void dataBerhasil() {
        berhasil++;
    }
}

class Bot extends Thread {

    public void run() {
        int waktuEksesuki = TaskTimeHelper.getTaskExecutionTime(); // Mendapatkan waktu eksekusi tugas
        if (waktuEksesuki < 5) {
            try {
                Thread.sleep(waktuEksesuki * 1000); // Menunggu sesuai waktu eksekusi
                TP8_1_H071231023.dataBerhasil(); // Menambah data yang berhasil dimuat

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Request Timeout"); // Jika waktu eksekusi lebih dari 5 detik
        }
    }
}

class UiThread extends Thread {
    private boolean yes = true; // Status kontrol untuk menjalankan atau menghentikan thread UI
    public static int jumlah; // Penghitung waktu eksekusi

    @Override
    public void run() {
        while (yes) {
            try {
                jumlah++;
                Thread.sleep(1000); // Menunggu 1 detik
                System.out.println(String.format("Loading... (%ds)", jumlah)); // Menampilkan status loading
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopProgram() {
        yes = false; // Menghentikan loop di metode run
    }
}

class TaskTimeHelper {
    public static int getTaskExecutionTime() {
        return (int) (Math.random() * 6) + 1; // Menghasilkan waktu eksekusi acak antara 1 hingga 6 detik
    }
}
