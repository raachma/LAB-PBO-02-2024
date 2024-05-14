public interface Info{
    void move();
}

class Smartphone implements Info {
    int price;
    String brand;

    public Smartphone(int price, String brand){
        this.price = price;
        this.brand = brand;
    }

    public void move(){
        System.out.println("-".repeat(50));
        System.out.println("Kamu membeli hp seharga Rp." + price + " dari brand " + brand);
        System.out.println("Smartphone berpindah.");
    }
}

class Car implements Info{
    int totalForwardGear, maxSpeed;
    String color;

    public Car(int totalForwardGear, int maxSpeed, String color){
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void move(){
        System.out.println("-".repeat(50));
        System.out.println("Mobil berwarna " + color + " dengan posisi gear " + totalForwardGear + " dikecepatan " + maxSpeed + " km/jam");
        System.out.println("Mobil sedang berakselerasi.");
    }
}
