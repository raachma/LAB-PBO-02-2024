import java.util.ArrayList;
import java.util.Scanner;

public class BangunDatar {
    double luas;
    double keliling;

    Scanner input = new Scanner(System.in);

    void showLuasKeliling() {
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);

    }
}

class Persegi extends BangunDatar {

    void showLuasKelilingPersegi() {
        System.out.print("Masukkan sisi persegi : ");
        double sisi = input.nextDouble();

        super.luas = sisi * sisi;
        super.keliling = 4 * sisi;

    }
}

class PersegiPanjang extends BangunDatar {
    void showLuasKelilingPersegiPanjang() {
        System.out.print("Masukkan sisi panjang : ");
        double panjang = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan sisi lebar: ");
        double lebar = input.nextDouble();

        super.luas = panjang * lebar;
        super.keliling = 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;
    double diameter;

    void showLuasKelilingLingkaran() {
        System.out.println("Pilih yang diketahui : ");
        System.out.println("1. Jari-jari \n2. Diameter");
        System.out.println("> ");
        int pilih = input.nextInt();
        input.nextLine();
        while (true) {
            if (pilih == 1) {
                System.out.print("Masukkan jari-jari : ");
                jariJari = input.nextDouble();
                super.luas = 3.14 * jariJari * jariJari;
                super.keliling = 2 * 3.14 * jariJari;
                break;
            } else if (pilih == 2) {
                System.out.println("Masukkan diameter : ");
                diameter = input.nextDouble();
                super.luas = 3.14 * (diameter / 2);
                super.keliling = 3.14 * diameter;
                break;
            } else {
                System.out.println("Tidak ada di menu pilihan");
            }
        }
    }
}

class Trapesium extends BangunDatar {
    Scanner input = new Scanner(System.in);

    void showLuasKelilingTrapesium() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            System.out.print("Masukkan sisi " + i + " trapesium : ");
            int side = input.nextInt();
            list.add(side);
        }

        System.out.print("Masukkan tinggi trapesium: ");
        double tinggi = input.nextDouble();

        super.luas = ((list.get(0) + list.get(1)) * tinggi) / 2;
        super.keliling = list.get(0) + list.get(1) + list.get(2) + list.get(3);
    }
}
