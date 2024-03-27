package Soaal1;


public class Person {

    String name;
    int age;
    boolean IsMale;




    public void SetName(String name){
        this.name = name;
    }

    
    public String GetName(){
        return name;
    
    }


    public void SetAge(int age){
        this.age = age;
    }

    public  int GetAge(){
        return age;
    } 


    public void SetGender(boolean IsMale){
        this.IsMale = IsMale;
    }

    public String GetGender(){
       
       return this.IsMale ? "Male" : "Female";



        }
    }



    
