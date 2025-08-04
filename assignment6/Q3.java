package assignment6;

class Employee{
     private int employeeID;
     private String name;
     private String designation;
     private String department;
     private double monthlySalary;

     public void setId(int id){
        this.employeeID = id;
     }

     public void setName(String name){
        this.name = name;
     }

     public void setDesignation(String des){
        this.designation = des;
     }

     public void setDepartment(String dep){
        this.department = dep;
     }

     public void setMonthlySalary(double salary){
        this.monthlySalary = salary;
     }

    public int getId(){
        return employeeID;
     }

     public String getName(){
        return name;
     }

     public String getDesignation(){
        return designation;
     }

     public String getDepartment(){
        return department;
     }

     public double getMonthlySalary(){
        return monthlySalary;
     }

     public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }
 
}
public class Q3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1001);
        emp.setName("Jeni");
        emp.setDesignation("Java Developer");
        emp.setDepartment("IT");
        emp.setMonthlySalary(50000);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Monthly Salary: Rs. " + emp.getMonthlySalary());
        System.out.println("Annual Salary: Rs. " + emp.calculateAnnualSalary());

    }
}
