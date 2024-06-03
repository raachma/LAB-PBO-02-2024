interface TP6_1_H071231002 {
    void move();
}


class Car implements TP6_1_H071231002{
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSped){
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSped;
    }

    @Override
    public void move(){
        System.out.println("Mobil sedang berakselerasi");
    }

    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}


class Smartphone implements TP6_1_H071231002{
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move(){
        System.out.println("Smartpone berpindah");
    }


    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }   
}


abstract class Dog implements TP6_1_H071231002{
    int position;
    int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void describe();
}


class Pitbull extends Dog{

    public Pitbull(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 3;
        System.out.println("Pitbull berpindah sebanyak " + position + " titik ke kanan");
    }

    public void describe(){
        System.out.println("Deskripsi :");
        System.out.println("Pitbull merupakan jenis anjing yang terkenal menyeramkan dengan wajah sangar dan dianggap suka menyerang. Salah satu karakteristik anjing pitbull yang sering dianggap menyeramkan adalah memiliki fisik dan mental yang kuat");
    }
}


class SiberianHusky extends Dog{

    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 2;
        System.out.println("Siberian Husky berpindah " + position + " titik ke kanan");
    }

    public void describe(){
        System.out.println("Deskripsi :");
        System.out.println("Siberian husky adalah anjing yang kuat, berukuran sedang, memiliki bulu tebal untuk menahan suhu dingin yang ekstrem, telinga segitiga yang tegak, dan kaki yang kuat.");
    }
}


class Bulldog extends Dog{

    public Bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 1;
        System.out.println("Bulldog berpindah " + position + " titik ke kanan");
    }

    public void describe(){
        System.out.println("Deskripsi :");
        System.out.println("Ras Bulldog memiliki tubuh yang pendek, kokoh dan kulit yang lentur, terutama di bagian kepala, leher dan bahu. Ciri khas lainnya adalah tengkoraknya yang besar. Bulldog memiliki warna rambut belang-belang, merah, coklat kekuningan atau putih.");
    }
}


class GermanShepherd extends Dog{

    public GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 3;
        System.out.println("German Shepherd berpindah " + position + " titik ke kanan");
    }

    public void describe(){
        System.out.println("Deskripsi :");
        System.out.println("German Shepherd adalah salah satu ras murni anjing yang populer. Ukurannya besar, dikenal cerdas namun penurut. Anjing ini relatif tidak memiliki variasi warna, yaitu coklat dengan variasi hitam.");
    }
}
