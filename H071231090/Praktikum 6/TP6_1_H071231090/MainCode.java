public class MainCode {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(5, 50);
        pitbull.move();
        pitbull.describe();

        SiberianHusky sibHus = new SiberianHusky(5, 50);
        sibHus.move();
        sibHus.describe();

        Bulldog bulldog = new Bulldog(5, 50);
        bulldog.move();
        bulldog.describe();

        GermanShepherd gerShp = new GermanShepherd(5, 50);
        gerShp.move();
        gerShp.describe();

        Smartphone phone = new Smartphone(100000000, "Samsung");
        phone.move();

        Car car = new Car(10, 100, "biru");
        car.move();
    }
}
