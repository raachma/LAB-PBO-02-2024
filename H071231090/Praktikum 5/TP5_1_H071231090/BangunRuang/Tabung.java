package TP5_1_H071231090.BangunRuang;

import java.util.Scanner;

public class Tabung extends BangunRuang {
    public Tabung(double jariJari, double tinggi){
        this.setJariJari(jariJari);
        this.setTinggi(tinggi);
    }

    @Override
    double HitungLuasPermukaan(){
        double luaspermukaan = 2 * this.getPi() * this.getJariJari() * this.getTinggi() + 2 * this.getPi() * (this.getJariJari()*this.getJariJari());
        double luasSelimut = 2 * this.getPi() * this.getJariJari() + this.getTinggi();
        double luasTotal = luaspermukaan + luasSelimut;
        return luasTotal;
    }

    @Override
    double HitungVolume(){
        double volume = this.getPi() * (this.getJariJari() * this.getJariJari()) * this.getTinggi();
        return volume;
    }

    public static void runTabung(){
        Scanner input = new Scanner(System.in);

        System.out.println("=== TABUNG ===");
        System.out.println("Masukkan jari-jari: ");
        int inpJariJari = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan tinggi: ");
        int inpTinggi = input.nextInt();
        input.nextLine();
        Tabung tabung = new Tabung(inpJariJari, inpTinggi);

        double result = 0;
        result = tabung.HitungLuasPermukaan();
        System.out.println("Luas permukaan tabung: " + result);
        result = tabung.HitungVolume();
        System.out.println("Volume tabung: " + result);
                
        input.close();
    }
}
