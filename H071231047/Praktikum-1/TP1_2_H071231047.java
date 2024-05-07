import java.util.Scanner;

public class TP1_2_H071231047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Judul Film: ");
        String Input = scanner.nextLine();


        String hasil = InputFilm(Input);
        System.out.println(hasil);
        scanner.close();

        
    }

    public static String InputFilm(String Judul) {
        String [] Array  = Judul.split(" ");
        String Hasil = "";

        for(int i=0; i<Array.length; i++){
            String Kata = Array[i];
            String HurufAwal = Kata.substring(0,1); 
            String HurufBelakang = Kata.substring(1);
            Hasil += HurufAwal.toUpperCase() + HurufBelakang.toLowerCase() + " ";
        }
        
        return Hasil;
    }
    
    
}