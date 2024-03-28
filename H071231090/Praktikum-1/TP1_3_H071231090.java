import java.util.Scanner;

public class TP1_3_H071231090 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        String tanggal = xyz.nextLine();
        String[] arraytanggal = tanggal.split("-");
        int[] arraytanggal2 = new int[3];
        for (int i = 0; i < arraytanggal.length; i++) {
            arraytanggal2[i] = Integer.parseInt(arraytanggal[i]);
        }
        int tahun = arraytanggal2[2];
        String tahun2 = "";
        if (tahun <= 30) {
            tahun2 = "20" + arraytanggal[2];
        } else {
            tahun2 = "19" + arraytanggal[2];
        }
        
        String namaBulan = "";
        switch (arraytanggal2[1]) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "";
        
        }

        System.out.println(arraytanggal2[0] + " " + namaBulan + " " + tahun2);
        xyz.close();
    }
}
