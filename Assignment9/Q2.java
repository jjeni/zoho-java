package Assignment9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            String input1 = sc.next();

            System.out.print("Enter second number: ");
            String input2 = sc.next();

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers (not letters or symbols).");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
