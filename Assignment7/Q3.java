package Assignment7;

abstract class Employee {
    protected String employeeName;
    protected String department;

    public void setName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract void calculateSalary(int workedDays, float dailyWorkingHours);
}


class FullTimeEmployee extends Employee {
    private double monthlySalary;

    @Override
    public void calculateSalary(int workedDays, float dailyWorkingHours) {
        double dailyRate = 2000;
        monthlySalary = workedDays * dailyRate;
        System.out.println("Full-Time Employee: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: Rs : " + monthlySalary);
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {

    private double hourlyRate = 150;
    private double totalSalary;

    @Override
    public void calculateSalary(int workedDays, float dailyWorkingHours) {
        totalSalary = workedDays * dailyWorkingHours * hourlyRate;
        System.out.println("Part-Time Employee: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Total Salary: Rs : " + totalSalary);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee emp1 =new FullTimeEmployee();
        emp1.setName("Jeevi");
        emp1.setDepartment("Human Resource");
        emp1.calculateSalary(25, 0);
        Employee emp2 = new PartTimeEmployee();
        emp2.setName("Jeni");
        emp2.setDepartment("UI/UX");
        emp2.calculateSalary(15, 8);
    }
}
