package TP7_1_H071231090;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCode {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        List<Karyawan> karyawan = new ArrayList<>();

        try{
            while (true){
                System.out.println("Data Karyawan");
                System.out.println("a. Tambah data karyawan\nb. Tampilkan detail karyawan\nc. Keluar");
                System.out.print("Pilih opsi (a-c): ");
                String input = inputan.nextLine();

                switch (input) {
                    case "a":
                        System.out.print("Masukkan nama: ");
                        String nama = inputan.nextLine();
                        System.out.println("Masukkan umur: ");
                        int umur = inputan.nextInt();
                        inputan.nextLine();
                        System.out.println("");
                        break;
                
                    default:
                        break;
                }
            }
        }
    }
}
