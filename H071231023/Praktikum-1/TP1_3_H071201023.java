import java.util.HashMap;
import java.util.Scanner;

public class TP1_3_H071201023 {
    
    public static String convertDateString(String input) {
        String[] parts = input.split("-");
        int date = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (date > 31) {
            return "Error: Tanggal tidak valid";
        }

        HashMap<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "Januari");
        monthMap.put(2, "Februari");
        monthMap.put(3, "Maret");
        monthMap.put(4, "April");
        monthMap.put(5, "Mei");
        monthMap.put(6, "Juni");
        monthMap.put(7, "Juli");
        monthMap.put(8, "Agustus");
        monthMap.put(9, "September");
        monthMap.put(10, "Oktober");
        monthMap.put(11, "November");
        monthMap.put(12, "Desember");


        String yearString = String.valueOf(year);
        if (yearString.length() == 2) {
            year = Integer.parseInt(yearString);
            if (year < 70) {
                year += 2000;
            } else {
                year += 1900;
            }
        }


        String convertedDate = date + " " + monthMap.get(month) + " " + year;
        return convertedDate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("");
        String input = scanner.nextLine();
        
        String output = convertDateString(input);
        System.out.println(output);
        
        scanner.close();
    }
}