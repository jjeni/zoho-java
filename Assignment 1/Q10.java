import java.util.Scanner;

class Car {
    String brand;
}

class Bike {
    String brand;
}

public class Q10 {

    public static void main(String[] args) {
        Car bmw = new Car();
        Bike re = new Bike();

        if (bmw instanceof Car){
            System.out.println("BMW is Instance of class Car !");
        }

        if (re instanceof Bike){
            System.out.println("RE is Instance of class Bike !");
        }

    }
}

