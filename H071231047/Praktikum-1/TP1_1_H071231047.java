import java.util.Scanner;

public class TP1_1_H071231047{
    public static void main(String[] args) {
        try{ 
        Scanner scanner = new Scanner(System.in);
            
        int BilanganBulat = 0;
        int BilanganDesimal = 0;

        System.out.print("Masuukan Bilangan: ");
        int N = scanner.nextInt();


        System.out.println("Masukkan " + N + " Bilangan:");

        for(int i=0; i<N; i++){
        double Input = scanner.nextDouble();

        if(Input == (int)Input){
            BilanganBulat++;
        }
        else{
            BilanganDesimal++;
        }


        }
        System.out.println(BilanganBulat +" Bilangan Bulat " );
        System.out.println(BilanganDesimal +" Bilangan Desimal ");
        scanner.close();

    }catch (Exception e){
        System.out.println("Inputan Harus Berupa angka! ");
    }
        

    }
}