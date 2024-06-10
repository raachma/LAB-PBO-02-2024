class Cuboid{
    double height;
    double widht;
    double legnth;

    double getVolume(){
        return height * widht * legnth ;
    }
}

public class Tugas2No3{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 50;
        cuboid.widht = 3;
        cuboid.legnth = 30;
        System.out.printf("Volume = %.2f", cuboid.getVolume());       
    }
}