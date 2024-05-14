package TP5_1_H071231090.BangunRuang;

import java.util.Scanner;

public class Kubus extends BangunRuang {
    public Kubus(double sisi){
        this.setPanjang(sisi);
    }

   @Override
    double HitungLuasPermukaan(){
        double luas = 6 * (this.getPanjang() * this.getPanjang());
        return luas;
    }

    @Override
    double HitungVolume(){
        double volume = this.getPanjang() * this.getPanjang() * this.getPanjang();
        return volume;
    }

    public static void runKubus(){
        Scanner input = new Scanner(System.in);

        System.out.println("=== KUBUS ===");
        System.out.print("Masukkan Sisi: ");
        int inpSisi = input.nextInt();
        input.nextLine();
        Kubus kubus = new Kubus(inpSisi);

        double result = 0;
        result = kubus.HitungLuasPermukaan();
        System.out.println("Luas permukaan Kubus: " + result);
        result = kubus.HitungVolume();
        System.out.println("Volume Kubus: " + result);
        input.close();
    }
}
