package Praktikum.Tuprak;

import java.util.Scanner;

public class TP1_5_H071231002{
    public static void main(String[] args) {
        int[][] angka = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, } };
        Scanner inp = new Scanner(System.in);

        try {
            System.out.print("Input angka yang ingin di cari : ");
            int inputAngka = inp.nextInt();
            for (int i = 0; i < angka.length; i++) {
                for (int j = 0; j < angka[i].length; j++) {
                    int angka1 = angka[i][j];
                    if (angka1 == inputAngka) {
                        System.out.println("Found " + inputAngka + " at [" + i + "][" + j + "]");
                        return;
                    }
                }
            }
            System.out.println("Angka tidak ditemukan!");
        } catch (Exception e) {
            System.out.println("Input harus berupa data integer (angka)");
        }
        inp.close();
    }
}
