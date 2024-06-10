import java.util.Scanner;

class Person {
    String name;
    String gender;
    int age;
    boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String nama) {
        name = nama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        gender = gender.toLowerCase();
        if (gender.equals("male")) {
            isMale = true;
        } else if (gender.equals("female")) {
            isMale = false;
        }

        if (isMale) {
            return "Boy";
        } else {
            return "Girl";
        }
    }

    public void setGender(String kelamin) {
        gender = kelamin;
    }
    
    public void getProfile(){
        System.out.println("\n-------------------Your Indentity-------------------");
        System.out.println("Name\t: " + getName());
        System.out.println("Age\t: " + getAge());
        System.out.println("Gender\t: " + getGender());

    }
}

public class Tugas2No1 {
    public static void main(String[] args) {
        Person cacan = new Person();
        Scanner input = new Scanner(System.in);

        System.out.print("Input Your Name\t\t\t: ");
        String nama = input.nextLine();
        System.out.print("Input Your Age\t\t\t: ");
        int umur = input.nextInt();
        input.nextLine();
        System.out.print("Your Gender (male / female)\t: ");
        String kelamin = input.nextLine();

        cacan.setName(nama);
        cacan.setAge(umur);
        cacan.setGender(kelamin);

        cacan.getProfile();
    }
}
