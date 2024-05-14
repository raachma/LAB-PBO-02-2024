package TP5_1_H071231090.BangunDatar;

import java.util.Scanner;

public class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double panjang, double lebar){
    this.setPanjang(panjang);
    this.setLebar(lebar);
    }

    @Override
    double HitungLuas(){
        double luas = this.getPanjang() * this.getLebar();
        return luas;
    }

    @Override
    double HitungKeliling(){
        double keliling = (2 * this.getPanjang()) + (2 * this.getLebar());
        return keliling;
    }

    public static void runPersegiPanjang(){
        Scanner input = new Scanner(System.in);

        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Masukkan panjang: ");
        int inpPanjang = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan lebar: ");
        int inpLebar = input.nextInt();
        input.nextLine();
        PersegiPanjang persegiPanjang = new PersegiPanjang(inpPanjang, inpLebar);

        double result = 0;
        result = persegiPanjang.HitungLuas();
        System.out.println("Luas persegi panjang: " + result);
        result = persegiPanjang.HitungKeliling();
        System.out.println("Keliling persegi panjang: " + result);
        input.close();
    }
}
