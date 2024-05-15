class Person {
    String name;
    int age;
    boolean isMale;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int setAge(int age) {
        this.age = age;
        return age;
    }

    int getAge() {
        return age;
    }

    void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    String getGender() {
        return isMale ? "Laki-laki" : "Perempuan";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Kevin";
        person.age = 19;
        person.setGender(true);
        System.out.println("Nama : " + person.getName());
        System.out.println("Umur : " + person.getAge());
        System.out.print("Gender : " + person.getGender());
    }
}