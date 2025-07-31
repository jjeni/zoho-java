package Assignment4;

import java.util.Scanner;

class BasicCalculator{
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        if(b==0) throw new ArithmeticException("Cannot divide by Zero.");
        return a / b;
    }
}

class AdvancedCalcultor extends BasicCalculator{
    public double power(int base, int exponent){
        return Math.pow(base, exponent);
    }
    public int modulus(int a, int b){
        return a % b;
    }
    public double squareRoot(double number){
        if (number < 0) {
            throw new ArithmeticException("Square root of negative number not allowed.");
        }
        return Math.sqrt(number);
    }
}

class ScientificCalculator extends AdvancedCalcultor {
    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public double log(double value) {
        if (value <= 0) throw new ArithmeticException("Log undefined for <= 0");
        return Math.log(value);
    }

    public double exp(double value) {
        return Math.exp(value);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScientificCalculator calc = new ScientificCalculator();

        while (true) {
            System.out.println("\n------ Calculator Menu ------");
            System.out.print("1.Add 2.Subtract  3.Multiply  4.Divide  5.Power  6.Modulus  7.Square Root  8.Sin  9.Cos  10.Log  11.Exp  0.Exit  -\n");
            System.out.println("Choose an operation by number: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter two integers: ");
                        int a = sc.nextInt(), b = sc.nextInt();
                        System.out.println("Result: " + calc.add(a, b));
                    }
                    case 2 -> {
                        System.out.print("Enter two integers: ");
                        int a = sc.nextInt(), b = sc.nextInt();
                        System.out.println("Result: " + calc.subtract(a, b));
                    }
                    case 3 -> {
                        System.out.print("Enter two integers: ");
                        int a = sc.nextInt(), b = sc.nextInt();
                        System.out.println("Result: " + calc.multiply(a, b));
                    }
                    case 4 -> {
                        System.out.print("Enter two integers: ");
                        int a = sc.nextInt(), b = sc.nextInt();
                        System.out.println("Result: " + calc.divide(a, b));
                    }
                    case 5 -> {
                        System.out.print("Enter base and exponent: ");
                        int base = sc.nextInt(), exp = sc.nextInt();
                        System.out.println("Result: " + calc.power(base, exp));
                    }
                    case 6 -> {
                        System.out.print("Enter two integers: ");
                        int a = sc.nextInt(), b = sc.nextInt();
                        System.out.println("Result: " + calc.modulus(a, b));
                    }
                    case 7 -> {
                        System.out.print("Enter a number: ");
                        double num = sc.nextDouble();
                        System.out.println("Result: " + calc.squareRoot(num));
                    }
                    case 8 -> {
                        System.out.print("Enter angle in degrees: ");
                        double angle = sc.nextDouble();
                        System.out.println("Result: " + calc.sin(angle));
                    }
                    case 9 -> {
                        System.out.print("Enter angle in degrees: ");
                        double angle = sc.nextDouble();
                        System.out.println("Result: " + calc.cos(angle));
                    }
                    case 10 -> {
                        System.out.print("Enter a positive number: ");
                        double value = sc.nextDouble();
                        System.out.println("Result: " + calc.log(value));
                    }
                    case 11 -> {
                        System.out.print("Enter a number: ");
                        double value = sc.nextDouble();
                        System.out.println("Result: " + calc.exp(value));
                    }
                    case 0 -> {
                        System.out.println("Exiting Calculator App");
                        sc.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // clear scanner buffer
            }
        }
    }
}
