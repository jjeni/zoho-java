package Assignment7.Q2;

import java.util.Scanner;

public class CreditCardPayment implements PaymentMethod {
    private double limit = 500000;
    private final int correctPin = 1234; 
    private String recipient;

    CreditCardPayment(String recipient){
        this.recipient = recipient;
    }

    @Override
    public void pay(double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Credit Card PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == correctPin) {
            if (amount <= limit) {
                System.out.println("Payment of Rs : " + amount + " to " + recipient + " successful using Credit Card.");
    
                limit -= amount;
                System.out.println("Remaining Limit : Rs : " + limit);
            } else {
                System.out.println("Payment failed: Credit limit exceeded.");
            }
        } else {
            System.out.println("Incorrect PIN. Payment failed.");
        }
    }
}
