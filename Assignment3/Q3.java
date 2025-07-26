package Assignment3;

public class Q3 {
    public static void main(String[] args) {
        
        Employee emp2 = new Employee("Jeni", 666, "Software Developer", 75000);
        Employee emp3 = new Employee(emp2);
        System.out.println("Employee 1 Details:");
        Employee emp1 = new Employee();
        System.out.println("Employee 2 Details:");
        emp2.display();
        System.out.println("Employee 3 Details:");
        emp3.display();
    }

}

class Employee {
    String employee_name;
    int employee_ID;
    String designation;
    double salary;

    Employee(){
        System.out.println("OBJECT CREATED SUCESSFULLY");

    }

    Employee(String employee_name, int employee_ID, String designation, int salary){
        this.employee_name = employee_name;
        this.employee_ID = employee_ID;
        this.designation = designation;
        this.salary = salary;
    }
    Employee(Employee data){
        this.employee_name = data.employee_name;
        this.employee_ID = data.employee_ID;
        this.designation = data.designation;
        this.salary = data.salary;
    }

    public void display() {
        System.out.println("Name: " + employee_name);
        System.out.println("Employee ID: " + employee_ID);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }

}