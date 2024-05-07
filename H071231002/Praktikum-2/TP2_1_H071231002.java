package Tuprak;

class Person {
    String nama;
    int age;
    boolean isMale;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
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
        return isMale ? "Laki-laki" : "Perempuan";
    }

    public static void main(String[] args) {
        Person nama = new Person();
        nama.setNama("Zul");

        Person umur = new Person();
        umur.setAge(19);

        Person jk = new Person();
        jk.setGender(true);

        System.out.println("Nama : " + nama.getNama());
        System.out.println("Umur : " + umur.getAge());
        System.out.println("Jenis kelamin : " + jk.getGender());
    }
}
