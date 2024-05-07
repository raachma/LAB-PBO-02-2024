import java.util.Scanner;


    public class TP1_5_H071231029 {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
        boolean Found = false;
          
        try{
            int [][] Array1 = { {1,2,3}, {4,5,6}, {7,8,9} };

            System.out.print("Masukkan Pencarian: ");
            int Pencarian = InputUser.nextInt();
            
            
            for(int i = 0; i<Array1.length; i++){
                for(int j=0; j<Array1[i].length; j++){
                    if(Array1[i][j] == Pencarian){
                        System.out.println("Found at" + Pencarian + "["+ i + "]["+ j + "]");
                        Found = true;
                        break;
                    }
                }
                
            }
            if(!Found) {
                System.out.println("Tidak ditemukan angka " + Pencarian);
            }     
        } catch (Exception e){
            System.out.println("Input Harus Berupa Angka");
        }
        InputUser.close();
    }
}