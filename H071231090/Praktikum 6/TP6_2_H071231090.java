public class TP6_2_H071231090 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(130000000, "Vivo");

        Car car = new Car(5, 80, "biru");

        DogInfo dog = new Pitbull(1, 80);

        smartphone.move();
        car.move();
        dog.move();
        dog.describe();
        }
}
