package TP5_1_H071231090.BangunDatar;

import java.util.Scanner;

public class Persegi extends BangunDatar {
    public Persegi(double sisi){
        this.setPanjang(sisi);
    }

    @Override
    double HitungLuas(){
        double luas = this.getPanjang() * this.getPanjang();
        return luas;
    }

    @Override
    double HitungKeliling(){
        double keliling = 4 * this.getPanjang();
        return keliling;
    }

    public static void runPersegi(){
        Scanner input = new Scanner(System.in);

        System.out.println("=== PERSEGI ===");
        System.out.print("Masukkan sisi: ");
        int inpSisi = input.nextInt();
        input.nextLine();
        Persegi persegi = new Persegi(inpSisi);

        double result = 0;
        result = persegi.HitungLuas();
        System.out.println("Luas persegi: " + result);
        result = persegi.HitungKeliling();
        System.out.println("Keliling persegi: " + result);
        input.close();
    }
}

