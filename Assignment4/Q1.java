package Assignment4;

class Vehicle{
    int mileage;
    double price;
}

class Car extends Vehicle{
    double cost;
    int warranty;
    int seatingCapacity;
    String fuel;
}

class Bike extends Vehicle{
    int numCylinder;
    int gears;
    String coolingType;
    String wheelType;
    int tankSize;
}

class Audi extends Car{
    String modelType;
    void displayInfo() {
        System.out.println("Audi Car:");
        System.out.println("Model Type:       " + modelType);
        System.out.println("Ownership Cost:   " + cost);
        System.out.println("Warranty:         " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type:        " + fuel);
        System.out.println("Mileage:          " + mileage);
        System.out.println("Price:            " + price);
        System.out.println();
    }
}

class Ford extends Car{
    String modelType;
    void displayInfo() {
        System.out.println("Audi Car:");
        System.out.println("Model Type:       " + modelType);
        System.out.println("Ownership Cost:   " + cost);
        System.out.println("Warranty:         " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type:        " + fuel);
        System.out.println("Mileage:          " + mileage);
        System.out.println("Price:            " + price);
        System.out.println();
    }
}

class Bajaj extends Bike{
    String makeType;
    void displayInfo() {
        System.out.println("Bajaj Bike:");
        System.out.println("Make Type:      " + makeType);
        System.out.println("Cylinders:      " + numCylinder);
        System.out.println("Gears:          " + gears);
        System.out.println("Cooling Type:   " + coolingType);
        System.out.println("Wheel Type:     " + wheelType);
        System.out.println("Fuel Tank Size: " + tankSize + " inches");
        System.out.println("Mileage:        " + mileage);
        System.out.println("Price:          " + price);
        System.out.println();
    }
}

class TVS extends Bike{
    String makeType;
    void displayInfo() {
        System.out.println("Bajaj Bike:");
        System.out.println("Make Type:      " + makeType);
        System.out.println("Cylinders:      " + numCylinder);
        System.out.println("Gears:          " + gears);
        System.out.println("Cooling Type:   " + coolingType);
        System.out.println("Wheel Type:     " + wheelType);
        System.out.println("Fuel Tank Size: " + tankSize + " inches");
        System.out.println("Mileage:        " + mileage);
        System.out.println("Price:          " + price);
        System.out.println();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.modelType = "A6";
        audi.cost = 1500000;
        audi.warranty = 4;
        audi.seatingCapacity = 5;
        audi.fuel = "Petrol";
        audi.mileage = 15;
        audi.price = 6000000;
        audi.displayInfo();

        Ford ford = new Ford();
        ford.modelType = "Mustang";
        ford.cost = 1200000;
        ford.warranty = 3;
        ford.seatingCapacity = 4;
        ford.fuel = "Diesel";
        ford.mileage = 12;
        ford.price = 4500000;
        ford.displayInfo();

        Bajaj bajaj = new Bajaj();
        bajaj.makeType = "Pulsar";
        bajaj.numCylinder = 1;
        bajaj.gears = 5;
        bajaj.coolingType = "Air";
        bajaj.wheelType = "Alloys";
        bajaj.tankSize = 13;
        bajaj.mileage = 50;
        bajaj.price = 90000;
        bajaj.displayInfo();

        TVS tvs = new TVS();
        tvs.makeType = "Apache";
        tvs.numCylinder = 1;
        tvs.gears = 5;
        tvs.coolingType = "Oil";
        tvs.wheelType = "Spokes";
        tvs.tankSize = 12;
        tvs.mileage = 48;
        tvs.price = 85000;
        tvs.displayInfo();
    }
}
