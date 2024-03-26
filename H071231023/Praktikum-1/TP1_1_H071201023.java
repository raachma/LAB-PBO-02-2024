import java.util.Scanner;

public class TP1_1_H071201023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countIntegers = 0;
        int countDecimals = 0;

        try {
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                String input = scanner.next();
                try {
                    double number = Double.parseDouble(input);
                    if (number % 1 == 0) {
                        countIntegers++;
                    } else {
                        countDecimals++;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Input tidak valid");
                    return;
                }
            }

            System.out.println(countIntegers + " Bilangan Bulat");
            System.out.println(countDecimals + " Bilangan Desimal");
            System.exit(0);
            
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid");
        } finally {
            scanner.close();
        }
    }
}