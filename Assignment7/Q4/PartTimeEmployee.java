package Assignment7.Q4;

public class PartTimeEmployee implements Employee {
    private String employeeName;
    private String department;

    private double hourlyRate = 150;
    private double totalSalary;

    PartTimeEmployee(String employeeName, String department){
        this.employeeName = employeeName;
        this.department = department;
    }

    @Override
    public void calculateSalary(int workedDays, float dailyWorkingHours) {
        totalSalary = workedDays * dailyWorkingHours * hourlyRate;
        System.out.println("---------------------------------\n");
        System.out.println("Part-Time Employee: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Total Salary: Rs : " + totalSalary+"\n");
        System.out.println("---------------------------------");
    }
}
