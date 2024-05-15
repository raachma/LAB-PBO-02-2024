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

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    String getGender() {
        return this.isMale ? "Laki-laki" : "Perempuan";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Kevin");
        System.out.println("Nama : " + person.getName());
        person.setAge(19);
        System.out.println("Umur : " + person.getAge());
        person.setGender(true);
        System.out.println("Gender : " + person.getGender());
    }
}
