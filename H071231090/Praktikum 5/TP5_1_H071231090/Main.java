package TP5_1_H071231090;

import java.util.Scanner;

import TP5_1_H071231090.BangunDatar.Lingkaran;
import TP5_1_H071231090.BangunDatar.Persegi;
import TP5_1_H071231090.BangunDatar.PersegiPanjang;
import TP5_1_H071231090.BangunDatar.Trapesium;
import TP5_1_H071231090.BangunRuang.Balok;
import TP5_1_H071231090.BangunRuang.Bola;
import TP5_1_H071231090.BangunRuang.Kubus;
import TP5_1_H071231090.BangunRuang.Tabung;

public class Main {
    public static void main(String[] args) {
        runApp();   
    }

    static void runApp(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. KUBUS \n2. BALOK \n3. BOLA \n4. TABUNG");
        System.out.println("===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI \n6. PERSEGI PANJANG \n7. LINGKARAN \n8. TRAPESIUM");
        System.out.println("----------------------------");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();
        input.nextLine();
        switch (pilih){
            case 1:
                Kubus.runKubus();
                break;
            case 2:
                Balok.runBalok();
                break;
            case 3:
                Bola.runBola();
                break;
            case 4:
                Tabung.runTabung();
                break;
            case 5:
                Persegi.runPersegi();
                break;
            case 6:
                PersegiPanjang.runPersegiPanjang();
                break;
            case 7:
                Lingkaran.runLingkaran();
                break;
            case 8:
                Trapesium.runTrapesium();
                break;
            default:
                break;
        }

        input.close();
    }
}
