interface Dog {
    void move();
    void describe();
}

abstract class DogBase implements Dog {
    protected int position;
    protected int averageLength;

    public DogBase(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }
}

class Pitbull extends DogBase {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println("Pitbull adalah jenis anjing yang dikenal dengan kekuatan, kelincahan, dan kesetiaannya.");
        System.out.println("Pitbull memiliki ciri fisik seperti rahang yang kuat, otot yang kokoh, dan bulu pendek.");
        System.out.println("Panjang rata-rata Pitbull adalah " + averageLength + " cm.");
    }
}

class SiberianHusky extends DogBase {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
    }

    @Override
    public void describe() {
        System.out.println("Siberian Husky adalah jenis anjing yang dikenal dengan ketahanan, kecerdasan, dan ramah.");
        System.out.println("Siberian Husky memiliki bulu tebal dan panjang, mata biru, dan telinga tegak.");
        System.out.println("Panjang rata-rata Siberian Husky adalah " + averageLength + " cm.");
    }
}

class Bulldog extends DogBase {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 1;
    }

    @Override
    public void describe() {
        System.out.println("Bulldog adalah jenis anjing yang dikenal dengan kekuatan, keuletan, dan kelembutannya.");
        System.out.println("Bulldog memiliki rahang kuat, tubuh kekar, dan wajah keriput.");
        System.out.println("Panjang rata-rata Bulldog adalah " + averageLength + " cm.");
    }
}

// Concrete class GermanShepherd
class GermanShepherd extends DogBase {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println("German Shepherd adalah jenis anjing yang dikenal dengan kecerdasan, kesetiaan, dan keberaniannya.");
        System.out.println("German Shepherd memiliki tubuh ramping, bulu lebat, dan telinga tegak.");
        System.out.println("Panjang rata-rata German Shepherd adalah " + averageLength + " cm.");
    }
}

interface Movable {
    void move();
}

class Smartphone implements Movable {
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone " + brand + " berpindah dengan harga " + price);
    }
}


class Car implements Movable {
    private int totalForwardGear;
    private String color;
    private int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil " + color + " dengan Forward Gear " + totalForwardGear + " sedang berakselerasi, dengan kecepatan maksimum " + maxSpeed + " Km/h");
    }
}

public class TP6_1_H071231023 {
    public static void main(String[] args) {
        Dog pitbull = new Pitbull(0, 60);
        Dog husky = new SiberianHusky(0, 55);
        Dog bulldog = new Bulldog(0, 50);
        Dog shepherd = new GermanShepherd(0, 65);

        Movable smartphone = new Smartphone(1000, "Samsung");
        Movable car = new Car(6, "Black", 200);

        System.out.println();
        moveAndDescribe(pitbull);
        System.out.println();

        moveAndDescribe(husky);
        System.out.println();

        moveAndDescribe(bulldog);
        System.out.println();

        moveAndDescribe(shepherd);
        System.out.println();

        moveObject(smartphone);
        moveObject(car);
        System.out.println();
    }

    private static void moveAndDescribe(Dog dog) {
        dog.move();
        dog.describe();
    }

    private static void moveObject(Movable movable) {
        movable.move();
    }
}
