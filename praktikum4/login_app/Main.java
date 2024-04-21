package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner xy = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        int selectMenu = xy.nextInt();
        xy.nextLine();
        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showRegisterMenu();
                break;
            default:
                runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = xy.next();
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = xy.next();

            boolean isPaswordMatch = listUser.get(userIndex).checkPassword(password);

            if (isPaswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password Salah");
                runApp();
            }
            }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        System.out.println("Username");
        System.out.print("> ");
        String username = xy.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = xy.nextLine();

        if (password.length() < 8) {
            System.out.println("Password harus terdiri dari minimal 8 karakter. Silakan coba lagi.");
            runApp();
        } else {

        // Instance objek User baru, dan tambahkan username dan password yang diinput
        User user = new User(username, password);

        // Instance objek Profile baru
        Profile profile = new Profile();

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = xy.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = xy.nextInt();
        xy.nextLine(); // Membersihkan newline dari input stream
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = xy.nextLine();

        // Berikan nilai fullName, age, dan hobby ke objek profile
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        // Berikan nilai nickName ke objek profile
        String nickName = StringUtils.getNickName(fullName);
        profile.setNickName(nickName);

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);

        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
        }
    }
        
    

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap   : " + profile.getFullName());
        System.out.println("Nama Panggilan : " + profile.getNickName());
        System.out.println("Umur           : " + profile.getAge());
        System.out.println("Hobby          : " + profile.getHobby());
        System.out.println("-------------------------");
        runApp();
    }
}