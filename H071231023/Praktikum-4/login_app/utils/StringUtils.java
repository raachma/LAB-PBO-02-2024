package login_app.utils;

public class StringUtils {
    public static String generateNickname(String fullName) {
        String[] names = fullName.split(" ");

        if (names.length == 1) {
            return names[0];
        }else if (names.length > 1){
            return names[1];
        } else {
            return "NoNickname";
        }
    }
}
