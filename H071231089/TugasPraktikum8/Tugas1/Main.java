package TugasPraktikum8.Tugas1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static int jumlahData = 4;
    // private static int jumlahBot = 3;
    private static int berhasil;

    public static void main(String[] args) {
        System.out.println(String.format("Star Load %d data", jumlahData));

        // ExecutorService executor = Executors.newFixedThreadPool(jumlahBot);

        ExecutorService executorPribadi = Executors.newSingleThreadExecutor(); //Membuat ExecutorService dengan satu thread untuk UiThread.
        ExecutorService executorPribadi1 = Executors.newSingleThreadExecutor(); //Membuat ExecutorService dengan satu thread untuk Bot.
        // ExecutorService executor = Executors.newFixedThreadPool(jumlahBot);
        UiThread ui = new UiThread(); //Membuat objek UiThread untuk menampilkan informasi loading.

        for (int i = 1; i <= jumlahData; i++) { //berjalan dari 1 hingga jumlahData, yang dalam konteks ini adalah 4
            Bot bot = new Bot();
            executorPribadi.execute(ui); //menampilkan pesan loading dijalankan dalam thread-nya sendiri setiap kali loop iterasi terjadi.
            executorPribadi1.execute(bot);
            // executor.execute(bot);

        }

        executorPribadi1.shutdown(); //Menghentikan executorPribadi1 setelah semua tugas dijalankan.
        // executor.shutdown();

        while (!executorPribadi1.isTerminated()) {
        }
        // while (!executor.isTerminated()) {
        // }
        ui.stopProgram();
        executorPribadi.shutdown();
        while(!executorPribadi.isTerminated()){

        }
        System.out.println();
        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + UiThread.jumlah + "s");
        
        if (berhasil == jumlahData) {
            System.out.println("All Data Is Successfully Loaded");
        } else {
            int gagal = jumlahData - berhasil;
            System.out.println(String.format("%d Data Successfully loaded & %d Data failed to load", berhasil, gagal));

        }
    }

    public static synchronized void dataBerhasil() {
        berhasil++;
    }
}

class Bot extends Thread {

    public void run() {
        int waktuEksesuki = TaskTimeHelper.getTaskExecutionTime(); //Mendapatkan waktu eksekusi acak untuk tugas.
        if (waktuEksesuki < 5) {
            try {
                Thread.sleep(waktuEksesuki * 1000);
                Main.dataBerhasil();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Request Timeout");
        }//Menunda eksekusi thread jika waktu eksekusi kurang dari 5 detik dan menambah jumlah tugas berhasil, atau menampilkan pesan "Request Timeout" jika lebih.
    }
}

class UiThread extends Thread {
    private boolean yes = true;
    public static int jumlah;

    @Override
    public void run() {
        while (yes) { //terus berjalan selama variabel yes bernilai true. 
            try {
                jumlah++;
                Thread.sleep(1000);
                System.out.println(String.format("Loading... (%ds)", jumlah));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopProgram(){
        yes = false;
    }

}

class TaskTimeHelper {
    public static int getTaskExecutionTime() {
        return (int) (Math.random() * 6) + 1;
    }
}