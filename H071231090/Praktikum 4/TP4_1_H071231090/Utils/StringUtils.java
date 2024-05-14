package TP4_1_H071231090.Utils;

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] words = fullName.split(" "); //variabel

        if (words.length == 1) {
            return fullName;
        } else {
            return words[1];
        }
    }
}