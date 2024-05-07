import java.util.Scanner;
class Soal1{
    public static void main(String[] args) {
        try{
        Scanner InputUser = new Scanner(System.in);
        
        int BilBulat = 0;
        int BilDesimal =0;

        System.out.print("Masuukan Bilangan: ");
        int Bilangan = InputUser.nextInt();


        System.out.println("Masukkan " + Bilangan + " Bilangan:");

        for(int i=0; i<Bilangan; i++){
        double Input = InputUser.nextDouble();

        if(Input == (int)Input){
            BilBulat++;
        }
        else{
            BilDesimal++;
        }


        }
        System.out.println(BilBulat +" Bilangan Bulat " );
        System.out.println(BilDesimal +" Bilangan Desimal ");
        InputUser.close();

    }catch (Exception e){
        System.out.println("Inputan Harus Berupa angka! ");
    }
        

    }
}