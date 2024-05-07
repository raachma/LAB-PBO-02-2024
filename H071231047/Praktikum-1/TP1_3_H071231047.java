import java.util.Scanner;

public class TP1_3_H071231047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Hari/Bulan/Tahun (dd/mm/yy):");
        String Tanggal = scanner.nextLine();
        
        String hasil = menghitunglahir(Tanggal);
        System.out.println(hasil);
        scanner.close();
    }

    public static String menghitunglahir(String lahir) {
        String Hari = lahir.substring(0, 2);
        int Day = Integer.parseInt(Hari);


        String Bulan = lahir.substring(3, 5);
        int Month = Integer.parseInt(Bulan);

        switch (Month) {

            case 1:
            System.out.print(Day + " Januari ");
            break;
            case 2:
            System.out.print(Day + " Februari ");
            break;
            case 3:
            System.out.print(Day + " Maret ");
            break;
            case 4:
            System.out.print(Day + " April ");
            break;
            case 5:
            System.out.print(Day + " Mei ");
            break;
            case 6:
            System.out.print(Day + " Juni ");
            break;
            case 7:
            System.out.print(Day + " Juli ");
            break;
            case 8:
            System.out.print(Day + " Agustus ");
            break;
            case 9:
            System.out.print(Day + " September ");
            break;
            case 10:
            System.out.print(Day + " Oktober ");
            break;
            case 11:
            System.out.print(Day + " November ");
            break;
            case 12:
            System.out.print(Day + " Desember ");
            break;
            default:
            System.out.println();
            break;
        }






        // if (Month == 1) {
        //     System.out.print(Day + " Januari ");
        // } else if (Month == 2) {
        //     System.out.print(Day + " Februari ");
        // } else if (Month == 3) {
        //     System.out.print(Day + " Maret ");
        // } else if (Month == 4) {
        //     System.out.print(Day + " April ");
        // } else if (Month == 5) {
        //     System.out.print(Day + " Mei ");
        // } else if (Month == 6) {
        //     System.out.print(Day + " Juni ");
        // } else if (Month == 7) {
        //     System.out.print(Day + " Juli ");
        // } else if (Month == 8) {
        //     System.out.print(Day + " Agustus ");
        // } else if (Month == 9) {
        //     System.out.print(Day + " September ");
        // } else if (Month == 10) {
        //     System.out.print(Day + " Oktober ");
        // } else if (Month == 11) {
        //     System.out.print(Day + " November ");
        // } else if (Month == 12) {
        //     System.out.print(Day + " Desember ");
        // }

        String Tahun = lahir.substring(6, 8);
        int Year = Integer.parseInt(Tahun);
        if (Year <= 24) {
            return "20" + Tahun;
        } else {
            return "19" + Tahun;
        }
    }
}