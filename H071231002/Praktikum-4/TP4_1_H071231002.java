import java.util.ArrayList;
import java.util.Scanner;


class Profile {

    private String fullName;
    private int age;
    private String hobby;
    private String nickname;


    public Profile() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getNickName() {
        return nickname;
    }

    public void setNickName(String nickname) {
        this.nickname = nickname;
    }


}

class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}

class StringUtils {
    public static String buatNicname(String fullName) {
        String[] names = fullName.split(" ");
        if (names.length == 1) {
            return fullName;
        } else {
            return names[1];
        }
    }

}

public class TP4_1_H071231002 {
    private static ArrayList<User> ListUser = new ArrayList<>();
    private static ArrayList<Profile> ListUserProfil = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("--------------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("--------------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        
        String selecMenu = sc.nextLine();
        switch (selecMenu) {
            case "1":
            if (ListUser.isEmpty()) {
                    System.out.println("Belum ada USer yang terdaftar, Silahkan Register Terlebih dahulu");
                    showRegisterMenu();
                } else {
                    showLoginMenu();
                }
                break;
                case "2":
                showRegisterMenu();
                break;
                default:
                System.out.println("imputan salah silahkan pilih lagi: ");
                runApp();
            }        
        }
        
        
        private static void showLoginMenu() {
            System.out.println("---------------------------");
            System.out.println("Login");
            System.out.println("Masukkan Username");
            System.out.print("> ");
            
            String username = sc.nextLine();
            while (username.isEmpty()) {
                System.out.println("inputan kosong, silakan masukkan Username");
                System.out.print("> ");
                username = sc.nextLine();
                sc.nextLine();
            }
            
            int userIndex = -1;
            for (int i = 0; i < ListUser.size(); i++){
                if (ListUser.get(i).getUsername().equals(username)){
                    userIndex = i;
                    break;
                }
            }
            
            if (userIndex != -1){
                System.out.println("Password");
                System.out.print("> ");
                String password = sc.nextLine();
                boolean passwordCorrect = ListUser.get(userIndex).getPassword().equals(password);
                if (passwordCorrect){
                    System.out.println("Berhasil Login");
                    showDetailUser(ListUserProfil.get(userIndex));
                    runApp();
                } else{
                    System.out.println("Password Salah");
                }
            }
    }
        
    

    private static void showRegisterMenu() {
        System.out.println("--------------------------");
        System.out.println("REGISTER");
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        for (User user : ListUser) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username sudah digunakan");
                showRegisterMenu();
                return;
            }
        }
        
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        User user = new User(username, password);
        if (password.length() < 8) {
            System.out.println("Panjang password harus minimal 8 karakter");
            showRegisterMenu();
            return;
        }
        ListUser.add(user);

        Profile profile = new Profile();

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        // Generate Nickname
        String nickname = StringUtils.buatNicname(fullName);
        profile.setNickName(nickname);

        ListUserProfil.add(profile);

        System.out.println("--------------------------");
        System.out.println("berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("--------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("--------------------------");
        System.out.println("Nama Lengkap   : " + profile.getFullName());
        System.out.println("Nama Panggilan : " + profile.getNickName());
        System.out.println("Umur           : " + profile.getAge());
        System.out.println("Hobby          : " + profile.getHobby());
    }
}


