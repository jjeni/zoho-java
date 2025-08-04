package Assignment5;

class  Employee {
    String name;
    int hours;
    double basePay;

    void setDetails(String name, int hours){
        this.name = name;
        this.hours = hours;
    }

    void calculateSalary(){
        double salary = this.hours * this.basePay;
        System.out.println("Salary of " + this.name + " is : " + salary);

    }
}

class FullTimeEmployee extends Employee {  
    
    @Override
    void calculateSalary(){
        double salary = this.hours * 800.00;
        System.out.println("Full-Time Salary of "+this.name + " is : "+salary);
    }
}

class PartTimeEmployee extends Employee {

    @Override
    void calculateSalary(){
        double salary = this.hours * 400.00;
        System.out.println("Part-Time Salary of "+this.name + " is : "+salary);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new FullTimeEmployee();
        employees[1] = new PartTimeEmployee();
        employees[2] = new FullTimeEmployee();
        employees[3] = new FullTimeEmployee();
        employees[4] = new PartTimeEmployee();

        employees[0].setDetails("Jeni", 2546);
        employees[1].setDetails("Jeevi", 1236);
        employees[2].setDetails("Goku", 1546);
        employees[3].setDetails("Ben", 1911);
        employees[4].setDetails("Naruto", 857);

        for(int i=0; i<employees.length; i++){
            employees[i].calculateSalary();  
        }

        
    }
}
