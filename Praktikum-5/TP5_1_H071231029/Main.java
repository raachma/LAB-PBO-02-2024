package Soal123;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        BangunRuang BangunRuang1 = new BangunRuang(0, 0);  
        BangunDatar BangunDatar1 = new BangunDatar(0, 0);

      
        
        System.out.println(" ==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        
        System.out.println(" ==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        
        System.out.println("--------------------------------------");
        System.out.print("Pilihan: ");
        int InputUser = scanner.nextInt();
        System.out.println("--------------------------------------");
           
            switch (InputUser) {
                case 1:
                System.out.print(" Masukkan sisi kubus: ");
                double sisi        = scanner.nextDouble();
                
                Kubus kubus1 = new Kubus(sisi,0, 0);
                
                double luas        = kubus1.LuasKubus();
                System.out.println("Luas Kubus  : " +   luas);
                
                double volume      = kubus1.Volume();
                System.out.println("Volume Kubus: " + volume);    
                break;
                

                case 2:
                System.out.println("Masukkan Panjang : ");
                double Panjang = scanner.nextDouble();

                System.out.println("Masukkan Lebar   : ");
                double Lebar = scanner.nextDouble();

                System.out.println("Masukkan Tinggi  : ");
                double Tinggi = scanner.nextDouble();

                Balok Balok1 = new Balok(Tinggi, Panjang, Lebar, 0, 0);

                double LuasBalok = Balok1.LuasBalok();
                System.out.println("Luas Balok   : " + LuasBalok);

                double VolumeBalok = Balok1.VolumeBalok();
                System.out.println("Volume Balok : " + VolumeBalok);
                break;
                
                case 3:
                System.out.println("Masukkan JariJari: "); 
                double JariJari = scanner.nextDouble();   
                
                Bola Bola1 = new Bola(JariJari, 0, 0);

                double LuasBola   = Bola1.LuasBola();
                System.out.println("Luas Bola    :   " + LuasBola );

                double VolumeBola = Bola1.VolumeBola();
                System.out.println("Volume Bola  :   " + VolumeBola);
                break;

                case 4:
                System.out.println("Masukkan Tinggi  :   ");
                double Tinggii = scanner.nextDouble();

                System.out.println("Masukkan JariJari:  ");
                double JariJari2 = scanner.nextDouble();


                Tabung Tabung1 = new Tabung(Tinggii, JariJari2, 0, 0);

                double LuasTabung = Tabung1.LuasTabung();
                System.out.println("Luas Tabung  : " + LuasTabung);

                double VolumeTabung = Tabung1.Volume();
                System.out.println("Volume Tabung: " + VolumeTabung);
               
               
                case 5:

                System.out.println("Masukkan sisi: ");
                double Sisi = scanner.nextDouble();
                
                Persegi Persegi1 = new Persegi(Sisi, 0, 0);


                double LuasPersegi = Persegi1.LuasPersegi();
                System.out.println("Luas Persegi " + LuasPersegi);

                double KelilingPersegi = Persegi1.KelilingPersegi();
                System.out.println("Keliling Persegi: " + KelilingPersegi);
                break;


                case 6:

                System.out.println("Masukkan Panjang: ");
                double Panjangg = scanner.nextDouble();

                System.out.println("Masukkan Lebar: ");
                double Lebarr = scanner.nextDouble();

                PersegiPanjang PersegiPanjang1 = new PersegiPanjang(Panjangg, Lebarr, 0, 0);

                double LuasPersegiPanjang = PersegiPanjang1.LuasPersegiPanjang();
                System.out.println("Luas Persegi Panjang: " + LuasPersegiPanjang);

                double KelilingPersegiPanjang = PersegiPanjang1.KelilingPersegiPanjang();
                System.out.println("Kelilig Persegi Panjang: " + KelilingPersegiPanjang);

                case 7:

                System.out.println("Masukkan JariJari: ");
                double JariJari3 = scanner.nextDouble();

                Lingkaran Lingkaran1 = new Lingkaran(JariJari3, 0, 0);

                double LuasLingkaran =Lingkaran1.LuasLingkaran();
                System.out.println("Luas Lingkaran: " + LuasLingkaran);

                double KeliligLingkaran = Lingkaran1.KeliligLingkaran();
                System.out.println("Keliling Lingkaran: " + KeliligLingkaran);
                break;

                case 8:

                System.out.println("Masukkan sisi1: ");
                double sisi1 = scanner.nextDouble();

                System.out.println("Masukkan sisi2: ");
                double sisi2 = scanner.nextDouble();

                System.out.println("Masukkan sisi3: ");
                double sisi3 = scanner.nextDouble();

                System.out.println("Masukkan sisi4:");
                double sisi4 = scanner.nextDouble();

                System.out.println("Masukkan Tinggi: ");
                double TinggiTrapesium = scanner.nextDouble();

                Trapesium Trapesium1 = new Trapesium(TinggiTrapesium, sisi1, sisi2, sisi3, sisi4, 0, 0);

                double LuasTrapesium = Trapesium1.LuasTrapesium();
                System.out.println("Luas Trapesium: " + LuasTrapesium);

                double KeliligTrapesium = Trapesium1.KeliligTrapesium();
                System.out.println("Keliling Trapesium: " + KeliligTrapesium);
                break;

                default:
                System.out.println("Mohon Masukkan No yang benar!");
                break;
            }
            
            scanner.close();
        }
    }
    


    // System.out.println("Masukkan JariJari: "); 
    // double JariJari = scanner.nextDouble();   
    
    // Bola Bola1 = new Bola(JariJari, 0, 0);

    // double LuasBola = Bola1.LuasBola();
    // System.out.println("Luas Bola:" + LuasBola );

    // double VolumeBola = Bola1.VolumeBola();
    // System.out.println("Volume Bola: " + VolumeBola);
