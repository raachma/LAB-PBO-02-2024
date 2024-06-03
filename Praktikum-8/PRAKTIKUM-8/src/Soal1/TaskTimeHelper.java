package Soal1;


import java.util.Random;

public class TaskTimeHelper {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}