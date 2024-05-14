package TP5_1_H071231090.BangunDatar;

import java.util.Scanner;

public class Lingkaran extends BangunDatar {
    public Lingkaran(double jariJari){
    this.setJariJari(jariJari);
    }

    @Override
    double HitungLuas(){
        double luas = this.getPi() * this.getJariJari() * this.getJariJari();
        return luas;
    }

    @Override
    double HitungKeliling(){
        double diameter = this.getJariJari() * 2;
        double keliling = this.getPi() * diameter;
        return keliling;
    }

    public static void runLingkaran(){
        Scanner input = new Scanner(System.in);
    
        System.out.println("=== LINGKARAN ===");
        System.out.println("Masukkan jari-jari: ");
        int inpJariJari = input.nextInt();
        input.nextLine();
        
        Lingkaran lingkaran = new Lingkaran(inpJariJari);

        double result = 0;
        result = lingkaran.HitungLuas();
        System.out.println("Luas lingkaran: " + result);
        result = lingkaran.HitungKeliling();
        System.out.println("Keliling lingkaran: " + result);

        input.close();
    }

}