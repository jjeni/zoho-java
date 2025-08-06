package Assignment8;


class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [Brand=" + brand + ", Year=" + year + "]";
    }
}

public class Q7 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);
        System.out.println(myCar);
    }
}
