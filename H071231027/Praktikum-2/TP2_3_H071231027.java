import java.util.Scanner;

class Cuboid {
    double height;
    double widht;
    double length;

    double getVolume() {
        return height * widht * length;
    }

    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        Scanner input = new Scanner(System.in);
        System.out.print("Height = ");
        cuboid.height = input.nextDouble();
        System.out.print("Widht = ");
        cuboid.widht = input.nextDouble();
        System.out.print("Length = ");
        cuboid.length = input.nextDouble();

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
