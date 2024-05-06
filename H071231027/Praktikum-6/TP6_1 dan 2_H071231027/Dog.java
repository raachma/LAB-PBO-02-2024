interface Moveable {
    void move();
}

abstract class Dog implements Moveable {
    int position;
    int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void move();

    public abstract void describe();
}

class Pitbull extends Dog {
    public Pitbull(int position) {
        super(position, 30);
    }

    @Override
    public void move() {
        position += 3;
        System.out.println("Pitbull berpindah sejauh " + position);
    }

    @Override
    public void describe() {
        System.out.println();
        System.out.println("=============Deskripsi Pitbull=============");
        System.out.println("Pitbull: Kuat, berotot, dan lincah");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position) {
        super(position, 25);
    }

    @Override
    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah sejauh " + position);
    }

    @Override
    public void describe() {
        System.out.println();
        System.out.println("=============Deskripsi Siberan Husky=============");
        System.out.println("Siberian Husky: Energik, mantel ganda tebal, dan mata biru atau multi-warna.");
    }
}

class Bulldog extends Dog {
    public Bulldog(int position) {
        super(position, 20);
    }

    @Override
    public void move() {
        position += 1;
        System.out.println("Bull dog berpindah sejauh " + position);
    }

    @Override
    public void describe() {
        System.out.println();
        System.out.println("=============Deskripsi Bulldog=============");
        System.out.println("Bulldog: Berotot dengan hidung pesek khas dan wajah keriput.");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position) {
        super(position, 35);
    }

    @Override
    public void move() {
        position += 3;
        System.out.println("German Shepherd beroindah sejauh " + position);

    }

    @Override
    public void describe() {
        System.out.println();
        System.out.println("=============Deskripsi German Shepherd=============");
        System.out.println("German Shepherd: Anjing pekerja yang cerdas, setia, dan serbaguna");
    }
}

class Smartphone implements Moveable {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println();
        System.out.println("=============Smartphone=============");
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Moveable {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println();
        System.out.println("=============Car=============");
        System.out.println("Total forward gear         : " + totalForwardGear);
        System.out.println("Mobil sedang berakselerasi : " + maxSpeed);
    }
}

class Main {
    public static void main(String[] args) {

        Pitbull pitbull = new Pitbull(2);
        SiberianHusky siberianHusky = new SiberianHusky(5);
        Bulldog bulldog = new Bulldog(0);
        GermanShepherd germanShepherd = new GermanShepherd(10);

        System.out.println("=======================");
        pitbull.move();
        siberianHusky.move();
        bulldog.move();
        germanShepherd.move();
        System.out.println("=======================");

        pitbull.describe();
        siberianHusky.describe();
        bulldog.describe();
        germanShepherd.describe();

        Smartphone smartphone = new Smartphone(1200000, "Poco X4");
        Car car = new Car(6, "Silver", 200);

        smartphone.move();
        car.move();
    }
}
