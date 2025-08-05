package Assignment7.Q4;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Jeni", "HR");
        emp1.calculateSalary(26, 0);
        Employee emp2 = new PartTimeEmployee("Ben 10", "Aliens");
        emp2.calculateSalary(15, 12);
    }
}
