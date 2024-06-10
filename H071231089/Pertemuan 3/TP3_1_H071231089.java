import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class TP3_1_H071231089 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to game!\nPress '1' to play!\n>> ");
        int pilihan = input.nextInt();
        boolean menu = true;
        AyamKampung player1 = null;
        AyamJago player2 = null;
        if (pilihan == 1){
            do { 
            System.out.print("==================================\nHi Player!\nWhat character do u want to use?\n1. Ayam Kampung\n2. Ayam Jago\n3. Guide \n>> ");
            pilihan = input.nextInt();
            switch (pilihan){
                case 1:
                    menu = true;
                    System.out.print("U Choose Ayam Kampung! are u want edit ur status or no? (yes/no)\n>> ");
                    String edit = input.next();
                    if (edit.equals("yes")){
                        System.out.println("Edit Status of Ayam Kampung Character : ");
                        System.out.print("HP : ");
                        int hp = input.nextInt();
                        System.out.print("MP : ");
                        int mp = input.nextInt();
                        System.out.print("Level : ");
                        int level = input.nextInt();
                        System.out.print("Strength : ");
                        int str = input.nextInt();
                        player1 = new AyamKampung(hp, mp, level, str);
                    } else {
                        player1 = new AyamKampung();
                    }
                    break;
                case 2:
                    menu = true;
                    System.out.print("U Choose Ayam Jago! are u want edit ur status or no? (yes/no)\n>> ");
                    edit = input.next();
                    if (edit.equals("yes")){
                        System.out.println("Edit Status of Ayam Jago In Character : ");
                        System.out.print("HP : ");
                        int hp = input.nextInt();
                        System.out.print("MP : ");
                        int mp = input.nextInt();
                        System.out.print("Level : ");
                        int level = input.nextInt();
                        System.out.print("Strength : ");
                        int str = input.nextInt();
                        player2 = new AyamJago(hp, mp, level, str);
                    } else {
                        player2 = new AyamJago();
                    }
                    break;
                case 3:
                    System.out.println("=================== GAME INFO (HOW TO PLAY) INDO SAJA BAHASANYA ========================");
                    System.out.println("Player : \nDisini sistem player adalah kita memilih salah satu dari 2 ayam, Ayam Kampung atau");
                    System.out.println("Ayam Jago, lalu sistem dari player juga setiap dia naik level maka HP dan MP nya akan dipulihkan");
                    System.out.println("ke batas maksimumnya (Yang telah disetting)\n");
                    System.out.println("Dungeon : \nSistem Dungeon disini akan memiliki 10 Musuh didalamnya dan jika kita menyerang dungeon");
                    System.out.println("Kita tidak bisa keluar sama sekali sebelum mengalahkan 10 musuh itu atau mendapatkan 'Escape Stone'");
                    System.out.println("ada 1 dari 10 musuh itu yang memiliki kesempatan mengeluarkan 'Escape Stone' yang dapat digunakan kapanpun");
                    System.out.println("untuk keluar dari dalam dungeon, setiap musuh memiliki attack power dan HP (SAMA!) berkisar antara 1 sampai (HP/2)\n");
                    System.out.println("Level : \nSistem Level disini setiap naik +1 level akan memulihkan HP dan MP ke batasnya, lalu menambah");
                    System.out.println("masing-masing status yang dimiliki sebanyak +5, level akan naik ketika berhasil mengalahkan 3 musuh!");
                    System.out.print("==========================================================================================\nApakah ingin melihat info skills dari Kedua Character?\n press y/n (n balik ke menu awal)>>");
                    String backToMenu = input.next();
                    if (backToMenu.equals("n")){
                        menu = false;
                    } else {
                        System.out.println("==============================================================");
                        System.out.println("Ayam Kampung : ");
                        System.out.println("Skills  :\n- Bloodlust\nBloodlust adalah sebuah skill yang dimana akan\nmembuat penggunanya memulihkan darahnya sebanyak 50% HP dari musuhnya\ndan juga mengurangi attack lawan sebesar 50%\nPenggunaan MP : 20 MP");
                        System.out.println("-------------------");
                        System.out.println("Ayam Jago : ");
                        System.out.println("Skills : \n- Dance of the Sword\nMerupakan sebuah skill dimana attack powernya akan meningkat menjadi 3x lipat\ndan akan berhenti ketika keluar dari dungeon, penggunaan MP : 40 MP");
                        System.out.println("==============================================================");
                    }
                    break;
                }
            } while (menu == false);
        } else {
            System.out.print("Exiting the game");
            try {
                for (int i = 0; i < 3; i++){
                    Thread.sleep(1000);
                    System.out.print(".");
                }
                System.exit(1);
            } catch (InterruptedException e){
            }
        }
        Dungeon dungeon1 = new Dungeon();
        while (menu == true){
            if (player1 != null){
                System.out.print("============== MENU ============\n1. Serang Dungeon\n2. Show Status Info\n3. Show Dungeon Enemy Info\n4. Generate Another Dungeon\n5. Job Change\n>> ");
                    int confirm = input.nextInt();
                    if (dungeon1.listMusuh.isEmpty()){
                        dungeon1.pembuatanMusuh(player1.hp);
                    }
                    switch (confirm){
                        case 1 :
                            player1.serangDungeon(dungeon1);
                            menu = true;
                            break;
                        case 2 :
                            if (player1.job != ""){
                                player1.statusWindowJob();
                            } else {
                                player1.statusWindow();
                            }
                            menu = true;
                            break;
                        case 3 :
                            dungeon1.dungeonInfo();
                            menu = true;
                            break;
                        case 4 :
                            dungeon1.listMusuh.clear();
                            dungeon1.pembuatanKeberuntunganEscapeStone();
                            try {
                                System.out.print("Mencari Dungeon lain");
                                for (int i = 0; i < 3; i++){
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                }
                            } catch (InterruptedException e){
                            }
                            System.out.println("\nDungeon Berhasil Ditemukan!");
                            dungeon1.pembuatanMusuh(player1.hp);
                            break;
                        case 5 :
                            System.out.println("Anda akan melakukan pergantian Job! title anda berubah sesuai dengan level anda!");
                            System.out.print("Yakin ingin melanjutkan job change? (y/n)\n>> ");
                            String jobChange = input.next();
                            if (jobChange.equals("y")){
                                try {
                                    System.out.print("Memproses pergantian job");
                                    for (int i = 0; i < 3; i++){
                                        Thread.sleep(1000);
                                        System.out.print(".");
                                    }
                                    if (player1.level > 0 && player1.level <= 10){
                                        System.out.println("Level anda tidak cukup untuk melakukan pergantian job!");
                                    } else if (player1.level > 10 && player1.level <= 20){
                                        System.out.println("Pergantian Job Berhasil!");
                                        System.out.println("Job anda sekarang : Necromancer");
                                        player1.hp += 100;
                                        player1.mp += 200;
                                        player1.str += 50;
                                        player1.job = "Necromancer";
                                    } else if (player1.level > 20){
                                        System.out.println("Pergantian Job Berhasil!");
                                        System.out.println("Job anda sekarang : Shadow Monarch");
                                        player1.job = "Shadow Monarch";
                                        player1.hp += 200;
                                        player1.mp += 300;
                                        player1.str += 100;
                                    }
                                } catch (InterruptedException e){
                                }
                            } else if (jobChange.equals("n")){
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 6 :
                            System.out.println("SECRET MENU!");
                            dungeon1.kemunculanEscapeStone();
                            break;
                    }
            } else if (player2 != null){
                System.out.print("============== MENU ============\n1. Serang Dungeon\n2. Show Status Info\n3. Show Dungeon Enemy Info\n4. Generate Another Dungeon\n>> ");
                    int confirm = input.nextInt();
                    if (dungeon1.listMusuh.isEmpty()){
                        dungeon1.pembuatanMusuh(player2.hp);
                    }
                    switch (confirm){
                        case 1 :
                            player2.serangDungeon(dungeon1);
                            menu = true;
                            break;
                        case 2 :
                            player2.statusWindow();
                            menu = true;
                            break;
                        case 3 :
                            dungeon1.dungeonInfo();
                            menu = true;
                            break;
                        case 4 :
                            dungeon1.listMusuh.clear();
                            dungeon1.pembuatanKeberuntunganEscapeStone();
                            try {
                                System.out.print("Mencari Dungeon Lain");
                                for (int i = 0; i < 3; i++){
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                }
                            } catch (InterruptedException e){
                            }
                            System.out.println("\nDungeon berhasil ditemukan!");
                            dungeon1.pembuatanMusuh(player2.hp);
                            break;
                        case 5 :
                            System.out.println("SECRET MENU!");
                            dungeon1.kemunculanEscapeStone();
                            break;
                    }
            }
        }
        input.close();
    }
}

class AyamKampung{
    Scanner input = new Scanner(System.in);
    final private String nama = "Ayam Kampung";
    String job = "";
    int hp, mp, level, str;
    int escapeStone = 0;

    AyamKampung(){
        level = 1;
        hp = 100;
        mp = 40;
        str = 16;
        System.out.println("Succesfully Created with default status!");
    }

    AyamKampung(int hp, int mp, int level, int str){
        this.hp = hp;
        this.mp = mp;
        this.level = level;
        this.str = str;
        System.out.println("Succesfully Created with custom status!");
    }

    String getName(){
        return nama;
    }
    
    public void serangDungeon(Dungeon target){
        System.out.println("===================================");
        int musuhKeberapa = 1;
        int batasDarah = this.hp;
        int batasMp = this.mp;
        int escapeStone = 0;
        int keluarDungeon = 0;
        for (int darahMusuh : target.listMusuh){
            if (keluarDungeon == 1){
                break;
            }
            int attackMusuh = darahMusuh / 2 + 5;
            System.out.println("Penyerangan Ke-"+musuhKeberapa);
            while (darahMusuh > 0){
                if (keluarDungeon != 0){
                    darahMusuh = 0;
                    break;
                }
                if (escapeStone == 0){
                    if (musuhKeberapa == target.EscapeStoneFound){
                        escapeStone++;
                    }
                    if (this.hp < 30){
                        System.out.println("Darah anda tersisa sedikit, hati-hati melanjutkan penyerangan!");
                    }
                    System.out.println("Darah Musuh : " + darahMusuh);
                    System.out.println("Attack Musuh : "+ attackMusuh);
                    System.out.printf("STATUS ANDA \nHP : %d MP : %d ATK : %d\n", this.hp, this.mp, this.str);
                    System.out.print("Serang Musuh?\n1. Attack Biasa\n2. Attack menggunakan Skill\n>> ");
                    int pilihanAttack = input.nextInt();
                    if (pilihanAttack == 1){
                        this.hp -= attackMusuh;
                        if (this.hp <= 0){
                            System.out.println("Anda Meninggal! Keluar dari game...");
                            System.exit(1);
                        }
                        darahMusuh -= this.str;
                    } else if (pilihanAttack == 2){
                        System.out.println("Menggunakan Skill BloodLust!");
                        Bloodlust(darahMusuh);
                        attackMusuh = attackMusuh/2;
                        this.hp -= attackMusuh;
                        if (this.hp <= 0){
                            System.out.println("Anda Meninggal! Keluar dari game...");
                            System.exit(1);
                        }
                        darahMusuh -= this.str;
                    }
                } else {
                    System.out.println("Anda Menemukan Escape Stone! Anda bisa keluar dari dungeon kapanpun!");
                    if (this.hp < 30){
                        System.out.println("Darah anda tersisa sedikit, hati-hati melanjutkan penyerangan!");
                    }
                    System.out.println("Darah Musuh : " + darahMusuh);
                    System.out.println("Attack Musuh : "+ attackMusuh);
                    System.out.printf("STATUS ANDA \nHP : %d MP : %d ATK : %d\n", this.hp, this.mp, this.str);
                    System.out.print("Serang Musuh?\n1. Attack Biasa\n2. Attack menggunakan Skill\n3. Gunakan Escape Stone\n>> ");
                    int pilihanAttack = input.nextInt();
                    if (pilihanAttack == 1){
                        this.hp -= attackMusuh;
                        if (this.hp <= 0){
                            System.out.println("Anda Meninggal! Keluar dari game...");
                            System.exit(1);
                        }
                        darahMusuh -= this.str;
                    } else if (pilihanAttack == 2){
                        System.out.println("Menggunakan Skill BloodLust!");
                        Bloodlust(darahMusuh);
                        this.hp -= attackMusuh;
                        if (this.hp <= 0){
                            System.out.println("Anda Meninggal! Keluar dari game...");
                            System.exit(1);
                        }
                        darahMusuh -= this.str;
                    } else if (pilihanAttack == 3){
                        System.out.println("Keluar dari dungeon!");
                        System.out.println("Selamat Anda Berhasil Menyelesaikan Dungeon!");
                        keluarDungeon++;
                    }
                } 
            }
            if (musuhKeberapa % 3 == 0){
                System.out.println("NAIK LEVEL! HP dan MP anda dipulihkan!");
                this.hp = batasDarah;
                this.mp = batasMp;
                this.hp += 5;
                this.mp += 5;
                this.str += 5;
                this.level++;
            }
            musuhKeberapa++;
            System.out.println("===================================");
        }
        System.out.println("Anda berhasil menyelesaikan dungeon!");
    }
    
    public void Bloodlust(int hpTarget){
        if (this.mp >= 20){
            this.mp -= 20;
            this.hp += hpTarget/2;
        } else {
            System.out.println("Gagal menggunakan skill! MP tidak cukup!");
            System.out.println("Menyerang biasa!");
        }
    }

    public void statusWindow(){
        System.out.println("=========== STATUS ============");
        System.out.println("Name    : " + getName());
        System.out.println("Level   : " + this.level);
        System.out.println("===============================");
        System.out.println("HP  : " + hp);
        System.out.println("MP  : "+ mp);
        System.out.println("STR   : "+ str);
    }

    public void statusWindowJob(){
        System.out.println("=========== STATUS ============");
        System.out.println("Name    : " + getName());
        System.out.println("Level   : " + this.level);
        System.out.println("Job     : " + job);
        System.out.println("===============================");
        System.out.println("HP  : " + hp);
        System.out.println("MP  : "+ mp);
        System.out.println("STR   : "+ str);
    }
}

class AyamJago{
    Scanner input = new Scanner(System.in);
    final private String nama = "Ayam Jago";
    int hp, mp, level, str;
    int escapeStone = 0;

    AyamJago(){
        level = 1;
        hp = 100;
        mp = 40;
        str = 16;
        System.out.println("Succesfully Created with default status!");
    }

    AyamJago(int hp, int mp, int level, int str){
        this.hp = hp;
        this.mp = mp;
        this.level = level;
        this.str = str;
        System.out.println("Succesfully Created with custom status!");
    }

    public void serangDungeon(Dungeon target){
        System.out.println("===================================");
        int musuhKeberapa = 1;
        int batasDarah = this.hp;
        int batasMp = this.mp;
        int serangdungeon = 0;
        for (int darahMusuh : target.listMusuh){
            if (serangdungeon == 1){
                break;
            }
            int attackMusuh = darahMusuh / 2 + 5;
            System.out.println("Penyerangan Ke-"+musuhKeberapa);
            while (darahMusuh > 0){
                if (serangdungeon != 0){
                    darahMusuh = 0;
                    break;
                }
                if (escapeStone == 0){
                    if (musuhKeberapa == target.EscapeStoneFound){
                        escapeStone++;
                    }
                    if (this.hp < 30){
                        System.out.println("Darah anda tersisa sedikit, hati-hati melanjutkan penyerangan!");
                    }
                    System.out.println("Darah Musuh : " + darahMusuh);
                    System.out.println("Attack Musuh : "+ attackMusuh);
                    System.out.printf("STATUS ANDA \nHP : %d MP : %d ATK : %d\n", this.hp, this.mp, this.str);
                    System.out.print("Serang Musuh?\n1. Attack Biasa\n2. Attack menggunakan Skill\n>> ");
                    int pilihanAttack = input.nextInt();
                    if (pilihanAttack == 1){
                        this.hp -= attackMusuh;
                        if (this.hp <= 0){
                            System.out.println("Anda Meninggal! Keluar dari game...");
                            System.exit(1);
                        }
                        darahMusuh -= this.str;
                    } else if (pilihanAttack == 2){
                        System.out.println("Menggunakan Skill Dance of The Sword!");
                        danceOfTheSword();
                        attackMusuh = attackMusuh/2;
                        this.hp -= attackMusuh;
                        if (this.hp <= 0){
                            System.out.println("Anda Meninggal! Keluar dari game...");
                            System.exit(1);
                        }
                        darahMusuh -= this.str;
                    }
                } else {
                    System.out.println("Anda Menemukan Escape Stone! Anda bisa keluar dari dungeon kapanpun!");
                    if (this.hp < 30){
                        System.out.println("Darah anda tersisa sedikit, hati-hati melanjutkan penyerangan!");
                    }
                    System.out.println("Darah Musuh : " + darahMusuh);
                    System.out.println("Attack Musuh : "+ attackMusuh);
                    System.out.printf("STATUS ANDA \nHP : %d MP : %d ATK : %d\n", this.hp, this.mp, this.str);
                    System.out.print("Serang Musuh?\n1. Attack Biasa\n2. Attack menggunakan Skill\n3. Gunakan Escape Stone\n>> ");
                    int pilihanAttack = input.nextInt();
                    if (pilihanAttack == 1){
                        this.hp -= attackMusuh;
                        if (this.hp <= 0){
                            System.out.println("Anda Meninggal! Keluar dari game...");
                            System.exit(1);
                        }
                        darahMusuh -= this.str;
                    } else if (pilihanAttack == 2){
                        System.out.println("Menggunakan Skill Dance of The Sword!");
                        danceOfTheSword();
                        this.hp -= attackMusuh;
                        if (this.hp <= 0){
                            System.out.println("Anda Meninggal! Keluar dari game...");
                            System.exit(1);
                        }
                        darahMusuh -= this.str;
                    } else if (pilihanAttack == 3){
                        System.out.println("Keluar dari dungeon!");
                        System.out.println("Selamat Anda Berhasil Menyelesaikan Dungeon!");
                        serangdungeon++;
                    }
                } 
            }
            if (musuhKeberapa % 3 == 0){
                System.out.println("NAIK LEVEL! HP dan MP anda dipulihkan!");
                this.hp = batasDarah;
                this.mp = batasMp;
                this.hp += 5;
                this.mp += 5;
                this.str += 5;
                this.level++;
            }
            musuhKeberapa++;
            System.out.println("===================================");
        }
        System.out.println("Anda Berhasil Menyelesaikan Dungeon!");
    }

    String getName(){
        return nama;
    }

    public void danceOfTheSword(){
        if (mp < 40){
            System.out.println("MP Tidak cukup! Gagal menggunakan skill!");
        } else {
            mp -= 40;
            this.str = this.str * 3;
        }
    }

    public void statusWindow(){
        System.out.println("=========== STATUS ============");
        System.out.println("Name    : " + getName());
        System.out.println("Level   : " + this.level);
        System.out.println("===============================");
        System.out.println("HP  : " + hp);
        System.out.println("MP  : "+ mp);
        System.out.println("STR   : "+ str);
    }
}

class Dungeon{
    ArrayList<Integer> listMusuh = new ArrayList<Integer>();
    Random rand = new Random();
    int EscapeStoneFound = rand.nextInt(9) + 1; 

    public void pembuatanMusuh(int hp){
        for (int i = 0; i < 9; i++){
            int attackAcak = rand.nextInt(hp/2) + 1;
            listMusuh.add(attackAcak);
        }
    }

    public void pembuatanKeberuntunganEscapeStone(){
        EscapeStoneFound = rand.nextInt(9) + 1;
    }

    public void kemunculanEscapeStone(){
        System.out.println("Escape Stone Keluar pada Musuh ke-"+ EscapeStoneFound);
    }

    public void dungeonInfo(){
        int berapa = 1;
        System.out.println("Musuh Anda disetiap pertarungan adalah berikut : ");
        for (int enemy : listMusuh){
            int attackPower = enemy/2 + 5;
            System.out.println("Musuh ke-"+berapa);
            System.out.println("HP : " + enemy + "     Attack Power : " + attackPower);
            berapa++;
        }
    }
}

