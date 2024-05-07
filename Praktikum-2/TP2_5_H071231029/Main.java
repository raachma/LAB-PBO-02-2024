package Soal5;

class Main{
  
    String name;
    int age;
    boolean IsMale;




    void Setname(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    void SetAgee(int age){
        this.age = age;

    }

    int gettAge(){
        return age;
    }

    void SetGender(boolean IsMale){
        this.IsMale = IsMale;

    }

    String GetGenderr(){
        if(this.IsMale == true){
           return "Male";
        }else{
           return "Female";
        }
    }

        public static void main(String[] args) {
        
            Main Mahasiswa1 = new Main();

            Mahasiswa1.name = "Fajrin";
            Mahasiswa1.age = 19;
            Mahasiswa1.IsMale = true;


            System.out.println("Nama: " + Mahasiswa1.getName());
            System.out.println(("Umur: " + Mahasiswa1.gettAge()));
            System.out.println(("Jenis Kelamin: " + Mahasiswa1.GetGenderr()));
           
     
    
    
    }
}