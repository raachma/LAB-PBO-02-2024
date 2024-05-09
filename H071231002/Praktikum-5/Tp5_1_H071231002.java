import java.util.Scanner;

class BangunRuang {
    double luasPermukaan(){
        return 0;
    }
    double volume(){
        return 0;
    }
}

class BangunDatar {
    double luas(){
        return 0;
    }
    double keliling(){
        return 0;
    }
}


class Kubus extends BangunRuang {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
    double volume() {
        return Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang {
    double panjang;
    double lebar;
    double tinggi;
    
    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + tinggi * lebar);
    }    
    double volume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    double jari;

    Bola(double jari) {
        this.jari = jari;
    }

    @Override
    double luasPermukaan() {
        return 4 * Math.PI * Math.pow(jari, 2);
    }
    double volume() {
        return (4 / 3) * 3.14 * Math.pow(jari, 3);
    }
}

class Tabung extends BangunRuang {
    double jari;
    double tinggi;

    Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    @Override
    double luasPermukaan() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }
    double volume() {
        return Math.PI * Math.pow(jari, 2) * tinggi;
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return Math.pow(sisi, 2);
    }
    double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double luas() {
        return panjang * lebar;
    }
    double keliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    double jari;

    Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    double luas() {
        return Math.PI * Math.pow(jari, 2);
    }
    double keliling() {
        return 2 * Math.PI * jari;
    }
}

class Trapesium extends BangunDatar {
    double sisiAtas;
    double sisiBawah;
    double sisiKiri;
    double sisiKanan;
    double tinggi;

    Trapesium(double sisiAtas, double sisiBawah, double sisiKiri, double sisiKanan, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }
    double keliling() {
        return sisiAtas + sisiBawah + sisiKanan + sisiKiri;
    }
}

public class Tp5_1_H071231002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("================ BANGUN RUANG ================");
        System.out.println("1. Kubus\n2. Balok\n3. Bola\n4. Tabung");
        System.out.println("================ BANGUN DATAR ================");
        System.out.println("5. Persegi\n6. Persegi Panjang\n7. Lingkaran\n8. Trapesium");
        System.out.println("------------------------------------------------");
        System.out.print("Pilihan : ");
        int opsi = sc.nextInt();
        System.out.println("------------------------------------------------");

        switch (opsi) {
            case 1: // Kubus
                System.out.print("Masukkan Panjang Sisi Kubus : ");
                double sisiKubus = sc.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("------------------------------------------------");
                System.out.printf("Volume Kubus        : %.2f\n", kubus.volume());
                System.out.printf("Luas Permukaan Kubus: %.2f\n", kubus.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;

            case 2: // Balok
                System.out.print("Masukkan Panjang Balok    : ");
                double panjang = sc.nextDouble();
                System.out.print("Masukkan Lebar Balok      : ");
                double lebar = sc.nextDouble();
                System.out.print("Masukkan Tinggi Balok     : ");
                double tinggiBalok = sc.nextDouble();
                Balok balok = new Balok(panjang, lebar, tinggiBalok);
                System.out.println("------------------------------------------------");
                System.out.printf("Volume Balok        : %.2f\n", balok.volume());
                System.out.printf("Luas Permukaan Balok: %.2f\n", balok.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;

            case 3: // Bola
                System.out.print("Masukkan Jari Bola    : ");
                double jariBola = sc.nextDouble();
                Bola bola = new Bola(jariBola);
                System.out.println("------------------------------------------------");
                System.out.printf("Volume Bola         : %.2f\n", bola.volume());
                System.out.printf("Luas Permukaan Bola : %.2f\n", bola.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;

            case 4: // Tabung
                System.out.print("Masukkan Jari Tabung      : ");
                double jariTabung = sc.nextDouble();
                System.out.print("Masukkan Tinggi Tabung    : ");
                double tinggiTabung = sc.nextDouble();
                Tabung tabung = new Tabung(jariTabung, tinggiTabung);
                System.out.println("------------------------------------------------");
                System.out.printf("Volume Tabung           : %.2f\n", tabung.volume());
                System.out.printf("Luas Permukaan Tabung   : %.2f\n", tabung.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;

            case 5: // Persegi
                System.out.print("Masukkan Sisi Persegi :");
                double sisiPersegi = sc.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("------------------------------------------------");
                System.out.printf("Luas Persegi    : %.2f\n", persegi.luas());
                System.out.printf("Keliling Persegi: %.2f\n", persegi.keliling());
                System.out.println("------------------------------------------------");
                break;

            case 6: // Persegi Panjang
                System.out.print("Masukkan Panjang Persegi Panjang  : ");
                double panjangPP = sc.nextDouble();
                System.out.print("Masukkan Lebar Persegi Panjang: ");
                double lebarPP = sc.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(panjangPP, lebarPP);
                System.out.println("------------------------------------------------");
                System.out.printf("Luas Persegi Panjang    : %.2f\n", pp.luas());
                System.out.printf("Keliling Persegi Panjang: %.2f\n", pp.keliling());
                System.out.println("------------------------------------------------");
                break;

            case 7: // Lingkaran
                System.out.print("Masukkan Jari Lingkaran   : ");
                double jariLingkaran = sc.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariLingkaran);
                System.out.println("------------------------------------------------");
                System.out.printf("Luas Lingkaran      : %.2f\n", lingkaran.luas());
                System.out.printf("Keliling Lingkaran  : %.2f\n", lingkaran.keliling());
                System.out.println("------------------------------------------------");
                break;

            case 8: // Trapesium
                System.out.print("Masukkan Panjang Sisi Atas Trapesium  : ");
                double atas = sc.nextDouble();
                System.out.print("Masukkan Panjang Sisi Bawah Trapesium : ");
                double bawah = sc.nextDouble();
                System.out.print("Masukkan Panjang Sisi Kiri Trapesium  : ");
                double sisiKiri = sc.nextDouble();
                System.out.print("Masukkan Panjang Sisi Kanan Trapesium : ");
                double sisiKanan = sc.nextDouble();
                System.out.print("Masukkan Tinggi Trapesium             : ");
                double tinggiTrap = sc.nextDouble();
                Trapesium trapesium = new Trapesium(atas, bawah, sisiKiri, sisiKanan, tinggiTrap);
                System.out.println("------------------------------------------------");
                System.out.printf("Luas Trapesium      : %.2f\n", trapesium.luas());
                System.out.printf("Keliling Trapesium  : %.2f\n", trapesium.keliling());
                System.out.println("------------------------------------------------");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        sc.close();
    }
}