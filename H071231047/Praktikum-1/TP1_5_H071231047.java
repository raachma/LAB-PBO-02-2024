import java.util.Scanner;


    public class TP1_5_H071231047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        try{
            int [][] Array = { {1,2,3}, {4,5,6}, {7,8,9} };

            System.out.print("Masukkan Pencarian: ");
            int Pencarian = scanner.nextInt();
            
            
            for(int i = 0; i<Array.length; i++){
                for(int j=0; j<Array[i].length; j++){
                    if(Array[i][j] == Pencarian){
                        System.out.println("Found at ["+ i + "]["+ j + "]");
                        break;

                    }
                }
                
            }
        
        } catch (Exception e){
            System.out.println("Input Harus Berupa Angka");
        }
        scanner.close();
    }
}