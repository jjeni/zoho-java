package Assignment3;

public class Q6 {
    public static void main(String[] args) {
        
        Employees emp1 = new Employees("Robert", 1994, 50000.0, "64C- WallsStreat");
        Employees emp2 = new Employees("Sam", 2000, 60000.0, "68D- WallsStreat");
        Employees emp3 = new Employees("John", 1999, 55000.0, "26B- WallsStreat");

        // Print header
        System.out.format("%-10s %-15s %-20s%n", "Name", "Year of joining", "Address");

        // Print employee details
        emp1.display();
        emp2.display();
        emp3.display();
    }
}

class Employees{
    String name;
    int year; 
    double salary; 
    String address;

    Employees(String name, int year,  double salary,String address){
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = address;
    }

    void display(){
        System.out.printf("%-10s %-15d %-20s%n", name, year, address);
    }
}