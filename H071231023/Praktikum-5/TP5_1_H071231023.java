import java.util.Scanner;

class BangunDatar {
    double luas;

    void hitungLuas() {
    }

    void hitungKeliling() {
    }
}

class BangunRuang extends BangunDatar {

    double volume;

    void hitungLuas() {
    }
}

class Persegi extends BangunDatar {
    double sisi; 

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    void hitungLuas() {
        luas = sisi * sisi;
    }

    void hitungKeliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void hitungLuas() {
        luas = panjang * lebar;
    }

    void hitungKeliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}

class Kubus extends BangunRuang {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    void hitungLuas() {
        luas = 6 * Math.pow(sisi, 2);
    }
    
    void hitungVolume() {
        volume = Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    public Balok (double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    void hitungLuas() {
        luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    void hitungVolume() {
        volume = panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    void hitungLuas() {
        luas = 4 * Math.PI * jariJari;
    }

    void hitungVolume() {
        volume = (4/ 3) * Math.PI * jariJari * jariJari * jariJari;
    }
}

class Tabung extends BangunRuang {
    double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    void hitungLuas() {
        luas = 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    void hitungVolume() {
        volume = Math.PI * jariJari * jariJari * tinggi;
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    void hitungLuas() {
        luas = 3.14 * jariJari * jariJari;
    }

    void hitungKeliling() {
        double keliling = (22/7) * jariJari;
        System.out.println("Keliling Lingkaran; " + keliling);
    }
}

class Trapesium extends BangunDatar {
    double sisi1, sisi2, sisi3, sisi4;
    double tinggi;

    Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }

    void hitungLuas() {
        double setengahAlas = (sisi1 + sisi2) / 2;
        double luasTrapesium = setengahAlas * tinggi;
        System.out.println("Luas Trapesium: " + luasTrapesium);
    }

    void hitungKeliling() {
        double keliling = sisi1 + sisi2 + sisi3 + sisi4;
        System.out.println("Keliling Trapesium: " + keliling);
    }
}

class TP5_1_H071231023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int pilihan;
            System.out.println("---------------------------------------");
            System.out.println("=======BANGUN RUANG=======");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.println("=======BANGUN DATAR=======");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. TRAPESIUM");
            System.out.println("---------------------------------------");

            System.out.print("Masukkan pilihan anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: // Kubus
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();

                    Kubus kubus = new Kubus(sisiKubus);
                    kubus.hitungLuas();
                    kubus.hitungVolume();

                    System.out.println("Luas Kubus: " + kubus.luas);
                    System.out.println("Volume Kubus: " + kubus.volume);
                    break;

                case 2: // Balok
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = scanner.nextDouble();

                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = scanner.nextDouble();

                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                
                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    balok.hitungLuas();
                    balok.hitungVolume();

                    System.out.println("Luas Balok: " + balok.luas);
                    System.out.println("Volume Balok: " + balok.volume);
                    break;

                case 3: // Bola
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariJariBola = scanner.nextDouble();

                    Bola bola = new Bola(jariJariBola);
                    bola.hitungLuas();
                    bola.hitungVolume();

                    System.out.println("Luas Bola: " + bola.luas);
                    System.out.println("Volume Bola: " + bola.volume);
                    break;

                case 4: // Tabung
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();

                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    
                    Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                    tabung.hitungLuas();
                    tabung.hitungVolume();
                
                    System.out.println("Luas tabung: " + tabung.luas);
                    System.out.println("Volume tabung: " + tabung.volume);
                    break;
                    
                case 5: // Persegi
                    System.out.print("Masukkan sisi persegi: ");
                    double sisipersegi = scanner.nextDouble();

                    Persegi persegi = new Persegi(sisipersegi);
                    persegi.hitungLuas ();
                    persegi.hitungKeliling();

                    System.out.println("Luas persegi: " + persegi.luas);
                    break;

                case 6: // Persegi Panjang
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjangPersegiPanjang = scanner.nextDouble();

                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebarPersegiPanjang = scanner.nextDouble();

                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                    persegiPanjang.hitungLuas();
                    persegiPanjang.hitungKeliling();

                    System.out.println("Luas persegi panjang: " + persegiPanjang.luas);
                    break;

                case 7: // Lingkaran
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJariLingkaran = scanner.nextDouble();

                    Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                    lingkaran.hitungLuas();
                    lingkaran.hitungKeliling();

                    System.out.println("Luas lingkaran: " + lingkaran.luas);

                    break;
                    
                case 8: // Trapesium
                    System.out.print("Masukkan sisi 1 trapesium: ");
                    double sisi1Trapesium = scanner.nextDouble();

                    System.out.print("Masukkan sisi 2 trapesium: ");
                    double sisi2Trapesium = scanner.nextDouble();

                    System.out.print("Masukkan sisi 3 trapesium: ");
                    double sisi3Trapesium = scanner.nextDouble();

                    System.out.print("Masukkan sisi 4 trapesium: ");
                    double sisi4Trapesium = scanner.nextDouble();

                    System.out.print("Masukkan tinggi trapesium: ");
                    double tinggiTrapesium = scanner.nextDouble();

                    Trapesium trapesium = new Trapesium(sisi1Trapesium,sisi2Trapesium, sisi3Trapesium, sisi4Trapesium, tinggiTrapesium);
                    trapesium.hitungLuas();
                    trapesium.hitungKeliling();
                    break;
            } 
            scanner.close();
            }
        }