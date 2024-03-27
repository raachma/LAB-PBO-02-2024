package Soaal1;

public class Main {

    public static void main(String[] args) {

        Person MahasiswaAbadi = new Person();


        MahasiswaAbadi.name = "Fajrin";
        MahasiswaAbadi.age = 19;
        MahasiswaAbadi.IsMale = true;


       System.out.println(MahasiswaAbadi.GetName());
       System.out.println(MahasiswaAbadi.GetAge());
       System.out.println(MahasiswaAbadi.GetGender());

     
        
    }

    
}
