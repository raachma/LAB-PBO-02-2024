package Tuprak;

class Cuboid {
    double height;
    double widht;
    double length;

    double getVolume(){
        return height * widht * length;
    }
}

public class TP2_3_H071231002{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 18;
        cuboid.widht = 12.5;
        cuboid.length = 20;

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}