package login_app.models;
import login_app.utils.StringUtils;

public class Profile {
    private String fullName;
    private int age;
    private String hobby;
    public String nickName;

    public Profile(String fullName, int age, String hobby) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = StringUtils.generateNickname(fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNickName() {
        return nickName;
    }
}
