import java.util.Scanner;

public class TP1_1_H071231027 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int elemen1 = 0;
        while (true) {
            try {
                System.out.print("Masukkan jumlah elemen: ");
                elemen1 = input1.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Input tidak valid. Mohon masukkan bilangan bulat.");
                input1.nextLine();
            }
        }
        input1.nextLine();
        while (true) {
            System.out.print("Masukkan elemen-elemen: ");
            String inputs = input1.nextLine();
            String[] array = inputs.split(" ");
            if (array.length != elemen1) {
                System.out.println("Jumlah elemen tidak sesuai dengan yang dimasukkan. Silakan coba lagi.");
            } else {
                processElements(array);
                break;
            }
        }
    }

    public static void processElements(String[] array) {
        int countInteger = 0;
        int countDouble = 0;
        for (String inputs2 : array) {
            Scanner input2 = new Scanner(inputs2);
            try {
                if (input2.hasNextInt()) {
                    countInteger++;
                } else if (input2.hasNextDouble()) {
                    double angka = input2.nextDouble();
                    if (angka % 1 == 0) {
                        countInteger++;
                    } else {
                        countDouble++;
                    }
                } else {
                    System.out.println("Input tidak valid. Mohon masukkan angka.");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Mohon masukkan angka.");
                return;
            }
        }

        System.out.println(countInteger + " Bilangan Bulat");
        System.out.println(countDouble + " Bilangan Desimal");
    }
}
