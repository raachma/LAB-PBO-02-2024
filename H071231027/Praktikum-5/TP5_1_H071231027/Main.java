import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("=======BANGUN RUANG=======");
        System.out.println("1. KUBUS \n2. BALOK \n3. BOLA \n4. TABUNG ");

        System.out.println("=======BANGUN DATAR=======");
        System.out.println("5. PERSEGI \n6. PERSEGI PANJANG \n7. LINGKARAN \n8. TRAPESIUM ");
        System.out.println("----------------------------------------");
        System.out.print("Pilihan : ");
        int pilih = s.nextInt();
        s.nextLine();
        if (pilih == 1) {
            Kubus kubus = new Kubus();
            kubus.showLuasVolumeKubus();
            kubus.showLuasVolume();
        } else if (pilih == 2) {
            Balok balok = new Balok();
            balok.showLuasVolumeBalok();
            balok.showLuasVolume();
        } else if (pilih == 3) {
            Bola bola = new Bola();
            bola.showLuasVolumeBola();
            bola.showLuasVolume();
        } else if (pilih == 4) {
            Tabung tabung = new Tabung();
            tabung.showLuasVolumeTabung();
            tabung.showLuasVolume();
        } else if (pilih == 5) {
            Persegi persegi = new Persegi();
            persegi.showLuasKelilingPersegi();
            persegi.showLuasKeliling();
        } else if (pilih == 6) {
            PersegiPanjang persegiPanjang = new PersegiPanjang();
            persegiPanjang.showLuasKelilingPersegiPanjang();
            persegiPanjang.showLuasKeliling();
        } else if (pilih == 7) {
            Lingkaran lingkaran = new Lingkaran();
            lingkaran.showLuasKelilingLingkaran();
            lingkaran.showLuasKeliling();
        } else if (pilih == 8) {
            Trapesium trapesium = new Trapesium();
            trapesium.showLuasKelilingTrapesium();
            trapesium.showLuasKeliling();
        } else {
            System.out.println("Tidak ada di menu pilihan");
        }

    }
}
