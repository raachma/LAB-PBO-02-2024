public class TP6_2_H071231002 {
    public static void main(String[] args) {
        Car car = new Car(5, "Abu-abu", 240);
        Smartphone hp = new Smartphone(5000000, "Samsung");
        Pitbull pitbul = new Pitbull(0, 5);
        SiberianHusky sh = new SiberianHusky(0, 5);
        Bulldog buldog = new Bulldog(0, 5);
        GermanShepherd  gs = new GermanShepherd(0, 5);

        garis();
        pitbul.move();
        pitbul.describe();
        garis();
        sh.move();
        sh.describe();
        garis();
        buldog.move();
        buldog.describe();
        garis();
        gs.move();
        gs.describe();
        garis();
        hp.move();
        System.out.println("---Informasi Smartphone---");
        System.out.println("Merek HP : " + hp.getBrand());
        System.out.println("Harga HP : Rp." + hp.getPrice() + ".-");
        garis();
        car.move();
        System.out.println("---Informasi Car---");
        System.out.println("Total Forward Gear  : " + car.getTotalForwardGear());
        System.out.println("Warna Mobil         : " + car.getColor());
        System.out.println("Kecepatan Maksimal  : " + car.getMaxSpeed() + "km/jam");
        garis();
    }

    public static void garis(){
        System.out.println("-----------------------------------------------");
    }
}
