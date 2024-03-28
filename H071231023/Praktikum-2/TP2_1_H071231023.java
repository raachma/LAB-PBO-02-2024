public class TP2_1_H071231023 {
    private String name;
    private int age;
    private boolean isMale;

    public TP2_1_H071231023(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return isMale ? "Male" : "Female";
    }

    public static void main(String[] args) {
        // Imput pertama
        TP2_1_H071231023 person = new TP2_1_H071231023("John", 30, true);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        // Input yang dibarukan
        person.setName("Alice");
        person.setAge(25);
        person.setGender(false);

        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
