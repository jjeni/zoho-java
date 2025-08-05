package Assignment7.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Our Payment System!");

        PaymentMethod pm;

        while (true) {
            System.out.println("\nChoose Payment Method:");
            System.out.println("1. Credit Card");
            System.out.println("2. Debit Card");
            System.out.println("3. UPI");
            System.out.println("4. Exit");

            int menu = -1;

            while (menu < 1 || menu > 4) {
                System.out.print("Enter your choice (1-4): ");
                if (sc.hasNextInt()) {
                    menu = sc.nextInt();
                    sc.nextLine();
                    if (menu < 1 || menu > 4) {
                        System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.nextLine(); 
                }
            }

            if (menu == 4) {
                System.out.println("Thank you for using our payment system!");
                break;
            }

            System.out.print("Enter the Recipient " + (menu == 3 ? "UPI ID" : "Name") + ": ");
            String recipient = sc.nextLine();

            System.out.print("Enter the Amount to Pay: ");
            double amount = -1;
            while (amount <= 0) {
                if (sc.hasNextDouble()) {
                    amount = sc.nextDouble();
                    if (amount <= 0) {
                        System.out.print("Amount must be greater than zero. Enter again: ");
                    }
                } else {
                    System.out.print("Invalid amount! Enter a number: ");
                    sc.nextLine(); 
                }
                sc.nextLine();
            }

            
            switch (menu) {
                case 1 -> pm = new CreditCardPayment(recipient);
                case 2 -> pm = new DebitCardPayment(recipient);
                case 3 -> pm = new UPIPayment(recipient);
                default -> {
                    System.out.println("Unexpected error.");
                    continue;
                }
            }

            pm.pay(amount);
        }

        sc.close();
    }
}
