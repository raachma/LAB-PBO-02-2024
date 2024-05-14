package TP5_1_H071231090.BangunRuang;

import java.util.Scanner;

public class Bola extends BangunRuang {
    public Bola(double jariJari){
        this.setJariJari(jariJari);
    }

    @Override
    double HitungLuasPermukaan(){
        double luas = 4 * this.getPi() * (this.getJariJari() * this.getJariJari());
        return luas;
    }

    @Override
    double HitungVolume(){
        double volume = 4/3 * this.getPi() * (this.getJariJari() * this.getJariJari() * this.getJariJari());
        return volume;
    }

    public static void runBola(){
        Scanner input = new Scanner(System.in);

        System.out.println("=== BOLA ===");
        System.out.println("Masukkan jari-jari: ");
        int inpJariJari = input.nextInt();
        input.nextLine();
        Bola bola = new Bola(inpJariJari);

        double result = 0;
        result = bola.HitungLuasPermukaan();
        System.out.println("Luas permukaan bola: " + result);
        result = bola.HitungVolume();
        System.out.println("Volume bola: " + result);
        input.close();

    }
}
