package Assignment3;

public class Q4 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("V001", "Mahindra", 1500000);
        Vehicle v2 = new Vehicle("V002", "Honda", 1200000);
        Vehicle v3 = new Vehicle("V003", "Hyundai", 1000000);

        v1.display();
        v2.display();
        v3.display();

        System.out.println("Total vehicles created: " + Vehicle.getVehicleCount());
    }
}


class Vehicle {

    private String vehicleID;
    private String brandName;
    private double price;
    private static int vehicleCount = 0;

    public Vehicle(String vehicleID, String brandName, double price) {
        this.vehicleID = vehicleID;
        this.brandName = brandName;
        this.price = price;
        vehicleCount++; 
    }

    public void display() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Price: " + price);
        System.out.println("------------------------");
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }
}
