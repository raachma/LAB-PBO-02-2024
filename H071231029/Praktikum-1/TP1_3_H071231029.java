import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Hari/Bulan/Tahun (dd/mm/yy):");
        String TglLahir = InputUser.nextLine();
        
        // String hasil = menghitunglahir(TglLahir);
        // System.out.println(hasil);
        InputUser.close();
    
        String Hari = TglLahir.substring(0, 2);
        int Day = Integer.parseInt(Hari);
        System.out.print(Day);


        String Bulan = TglLahir.substring(3, 5);
        int Month = Integer.parseInt(Bulan);

      
        switch (Month) {
            case 1:
            System.out.print( " Januari ");
                break;
            case 2:
            System.out.print( "Februari");
                break;
            case 3:
            System.out.print( "Maret");
                break;
            case 4:
            System.out.print( "April");
                break;
            case 5:
            System.out.print( "Mei");
                break;
            case 6:
            System.out.print( "Juni");
                break;
            case 7:
            System.out.print( "Juli");
                break;
            case 8:
            System.out.print( "Agustus");
                break;
            case 9:
            System.out.print( "September");
                break;
            case 10:
            System.out.print( "Oktober");
                break;
            case 11:
            System.out.print( " November ");
                break;
            case 12:
            System.out.print( " Desember ");
                break;


            default:
            System.out.println("Inputan Bulan Anda salah !");
                break;
        }

        String Tahun = TglLahir.substring(6, 8);
        int Year = Integer.parseInt(Tahun);
        if (Year <= 24) {
            System.out.println("200" + Year);
        } else {
            System.out.println("19" + Year);
        }
    }
}
