//Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary)

public class Employee {
    int empId;
    String name;
    String department;
    double salary;

    public Employee(int empId, String name, String department, double salary){
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("--- ABOUT THE EMPLOYEE ---");
        System.out.println("EMPLOYEE ID : " + empId);
        System.out.println("NAME        : " + name);
        System.out.println("DEPARTMENT  : " + department);
        System.out.println("SALARY      : ₹" + salary);
    }

    public static void main(String[] args) {
        Employee a1 = new Employee(1001, "Jeni J", "Backend", 100000);
        a1.display();
    }
}
