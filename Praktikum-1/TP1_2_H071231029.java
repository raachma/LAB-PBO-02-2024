import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
        
        System.out.println("Masukkan Judul Film: ");
        String Input = InputUser.nextLine();


       String hasil = InputFilm(Input);
        System.out.println(hasil);
       InputUser.close();

        
    }

    public static String InputFilm(String Judul) {
        String [] Array1  = Judul.split(" ");
        String Hasil = "";

        for(int i=0; i<Array1.length; i++){
            String Kata = Array1[i];
            String HurufAwal = Kata.substring(0,1); 
            String HurufBelakang = Kata.substring(1);
            Hasil += HurufAwal.toUpperCase() + HurufBelakang.toLowerCase() + " ";
        }
        
        return Hasil;
    }
    
    
}
