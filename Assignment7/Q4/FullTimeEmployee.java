package Assignment7.Q4;

public class FullTimeEmployee implements Employee {
    private String employeeName;
    private String department;
    private double monthlySalary;

    FullTimeEmployee(String employeeName, String department){
        this.employeeName = employeeName;
        this.department = department;
    }

    public void calculateSalary(int workedDays, float dailyWorkingHours){
        double dailyRate = 2000;
        monthlySalary = workedDays * dailyRate;
        System.out.println("---------------------------------\n");
        System.out.println("Full-Time Employee: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: Rs : " + monthlySalary+"\n");
        System.out.println("---------------------------------");
    }
}
