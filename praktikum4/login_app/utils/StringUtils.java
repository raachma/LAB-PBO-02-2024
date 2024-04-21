package login_app.utils;

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] words = fullName.split(" ");

        if (words.length == 1) {
            return fullName;
        } else {
            return words[1];
        }
    }
}