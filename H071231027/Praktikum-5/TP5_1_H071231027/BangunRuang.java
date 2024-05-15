import java.util.Scanner;

public class BangunRuang {
    double luasPermukaan;
    double volume;
    Scanner sc = new Scanner(System.in);

    void showLuasVolume() {
        System.out.println("Luas Permukaan : " + luasPermukaan);
        System.out.println("Volume : " + volume);
    }
}

class Kubus extends BangunRuang {
    void showLuasVolumeKubus() {
        System.out.print("Masukkan sisi kubus : ");
        double sisi = sc.nextDouble();

        super.luasPermukaan = 6 * sisi * sisi;
        super.volume = sisi * sisi * sisi;
    }
}

class Balok extends BangunRuang {
    void showLuasVolumeBalok() {
        System.out.print("Masukkan Panjang : ");
        double panjang = sc.nextDouble();
        sc.nextLine();

        System.out.print("Masukkan Lebar : ");
        double lebar = sc.nextDouble();
        sc.nextLine();

        System.out.print("Masukkan Tinggi : ");
        double tinggi = sc.nextDouble();

        super.luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (tinggi * lebar));
        super.volume = panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    void showLuasVolumeBola() {
        System.out.println("Pilih yang diketahui : ");
        System.out.println("1. Jari-jari \n2. Diameter");
        System.out.println("> ");
        int pilih = sc.nextInt();
        sc.nextLine();
        while (true) {
            if (pilih == 1) {
                System.out.print("Masukkan jari-jari : ");
                double jariJari = sc.nextDouble();
                super.luasPermukaan = 4 * 3.14 * jariJari * jariJari;
                super.volume = (4 * (3.14 * jariJari * jariJari * jariJari)) / 3;
                break;
            } else if (pilih == 2) {
                System.out.print("Masukkan diameter : ");
                double diameter = sc.nextDouble();
                double j = diameter / 2;
                super.luasPermukaan = 4 * 3.14 * j * j;
                super.volume = (4 * (3.14 * j * j * j)) / 3;
                break;
            } else {
                System.out.println("Tidak ada di menu pilihan");
            }
        }
    }
}

class Tabung extends BangunRuang {
    void showLuasVolumeTabung() {
        System.out.println("Pilih yang diketahui : ");
        System.out.println("1. Jari-jari \n2. Diameter");
        System.out.print("> ");
        int pilih = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan tinggi : ");
        double tinggi = sc.nextDouble();
        sc.nextLine();

        while (true) {
            if (pilih == 1) {
                System.out.print("Masukkan jari-jari : ");
                double jariJari = sc.nextDouble();
                super.luasPermukaan = 2 * 3.14 * jariJari * (jariJari + tinggi);
                super.volume = 3.14 * (jariJari * jariJari) * tinggi;
                break;
            } else if (pilih == 2) {
                System.out.print("Masukkan diameter : ");
                double diameter = sc.nextDouble();
                double j = diameter / 2;
                super.luasPermukaan = 2 * 3.14 * j * (j + tinggi);
                super.volume = 3.14 * (j * j) * tinggi;
                break;
            } else {
                System.out.println("Tidak ada di menu pilihan");
            }
        }
    }
}