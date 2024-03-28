import java.util.HashMap;
import java.util.Scanner;

public class TP1_3_H071231027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();

        System.out.println(konversiTanggal(input1));
    }

    public static String konversiTanggal(String tanggal) {
        HashMap<String, String> monthMap = new HashMap<>();
        monthMap.put("01", "Januari");
        monthMap.put("02", "Februari");
        monthMap.put("03", "Maret");
        monthMap.put("04", "April");
        monthMap.put("05", "Mei");
        monthMap.put("06", "Juni");
        monthMap.put("07", "Juli");
        monthMap.put("08", "Agustus");
        monthMap.put("09", "September");
        monthMap.put("10", "Oktober");
        monthMap.put("11", "November");
        monthMap.put("12", "Desember");

        String[] parts = tanggal.split("-");
        int day = Integer.parseInt(parts[0]);
        String month = monthMap.get(parts[1]);
        int year = Integer.parseInt(parts[2]);

        return day + " " + month + " " + (year > 50 ? "19" : "20") + parts[2];
    }
}
