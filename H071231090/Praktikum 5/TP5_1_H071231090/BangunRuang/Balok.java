package TP5_1_H071231090.BangunRuang;

import java.util.Scanner;

public class Balok extends BangunRuang {
    public Balok( double panjang, double lebar, double tinggi) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
    }

    @Override
    double HitungLuasPermukaan(){
        double luas = 2 * ((this.getPanjang() * this.getLebar()) + (this.getLebar() * (this.getTinggi()) + (this.getTinggi() * this.getPanjang())));
        return luas;
    }

    @Override
    double HitungVolume(){
        double volume = this.getPanjang() * this.getLebar() * this.getTinggi();
        return volume;
    }

    public static void runBalok(){
        Scanner input = new Scanner(System.in);

        System.out.println("=== BALOK ===");
        System.out.println("Masukkan Panjang: ");
        int inpPanjang = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan Lebar: ");
        int inpLebar = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan Tinggi: ");
        int inpTinggi = input.nextInt();
        input.nextLine();

        Balok balok = new Balok(inpPanjang, inpLebar, inpTinggi);

        double result = 0;
        result = balok.HitungLuasPermukaan();
        System.out.println("Luas permukaan balok: " + result);
        result = balok.HitungVolume();
        System.out.println("Volume balok: " + result);
        input.close();
    }
}
