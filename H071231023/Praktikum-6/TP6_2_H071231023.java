public class TP6_2_H071231023 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(100, "Samsung");

        Car car = new Car(6, "Black", 200);

        Dog dog = new Pitbull(0, 60);

        smartphone.move();
        car.move();
        dog.move();

        if (dog instanceof Dog) {
            ((Dog) dog).describe();
        }
    }
}
