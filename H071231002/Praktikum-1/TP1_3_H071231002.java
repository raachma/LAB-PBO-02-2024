package Praktikum.Tuprak;
import java.util.Scanner;

public class TP1_3_H071231002 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // String tanggal = inp.nextLine();
        // String [] arraytanggal = tanggal.split("-");
        // int [] arraytanggal2 = new int [3];
        // for (int i = 0; i < arraytanggal.length; i++) {
        //     arraytanggal2[i] = Integer.parseInt(arraytanggal[i]);
        // }

        // int tahun = arraytanggal2[2];
        // String tahun2 = "";
        // if (tahun >= 0 && tahun <= 24){
        //     tahun2 = "20" + arraytanggal[2];
        // } else {
        //     tahun2 = "19" + arraytanggal[2];
        // }

        // System.out.println(arraytanggal2[0] + " " + ubahBulan(arraytanggal2[1])+ " " + tahun2);
        // inp.close();
    // }

    // public static String ubahBulan(int angka){
        // if (angka == 1) {
        //     return "Januari";
        // } else if (angka == 2) {
        //     return "Februari";
        // } else if (angka == 3) {
        //     return "Maret";
        // } else if (angka == 4) {
        //     return "April";
        // } else if (angka == 5) {
        //     return "Mei";
        // } else if (angka == 6) {
        //     return "Juni";
        // } else if (angka == 7) {
        //     return "Juli";
        // } else if (angka == 8) {
        //     return "Agustus";
        // } else if (angka == 9) {
        //     return "September";
        // } else if (angka == 10) {
        //     return "Oktober";
        // } else if (angka == 11) {
        //     return "November";
        // } else if (angka == 12) {
        //     return "Desember";
        // } else {
        //     return "";

        String input = inp.nextLine();
        String hari = input.substring(0,2);
        System.out.print(Integer.parseInt(hari));

        String bulan = input.substring(3, 5);
        int month = Integer.parseInt(bulan);

        switch (month){
            case 1 :
            System.out.print(" Januari ");
            break;
            case 2 :
            System.out.print(" Februari ");
            break;
            case 3 :
            System.out.print(" Maret ");
            break;
            case 4 :
            System.out.print(" April ");
            break;
            case 5 :
            System.out.print(" Mei ");
            break;
            case 6 :
            System.out.print(" Juni ");
            break;
            case 7 :
            System.out.print(" Juli ");
            break;
            case 8 :
            System.out.print(" Agustus ");
            break;
            case 9 :
            System.out.print(" September ");
            break;
            case 10 :
            System.out.print(" Oktober ");
            break;
            case 11 :
            System.out.print(" November ");
            break;
            case 12 :
            System.out.print(" Desember ");
            break;
            default : 
            System.out.print("Angka Salah");
            break;
        }

        String tahun = input.substring(6, 8);
        int year = Integer.parseInt(tahun);

        if (year >= 0 && year <= 24){
            System.out.print("20"+tahun);
        } else {
            System.out.print("19"+tahun);
        }
    }
}