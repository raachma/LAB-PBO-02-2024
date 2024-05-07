package TP6_1_H071231047.main;
import TP6_1_H071231047.device.*;
import TP6_1_H071231047.dog.*;

public class Main {
    public static void main(String[] args) {
        Dog bulldog = new Bulldog(70);
        System.out.println();
        bulldog.describe();
        System.out.println("\nPosisi Bulldog sebelum bergerak: " + bulldog.position);
        bulldog.move();
        System.out.println("Posisi Bulldog setelah bergerak: " + bulldog.position);

        Device smartphone = new Smartphone(30000, "Samsung S25 Ultra");
        smartphone.displayInfo();
        smartphone.move();

        Device car = new Car(40000000, "BMW M3 GTR", 7, "Blue", 300);
        car.displayInfo();
        car.move();
    }
}
