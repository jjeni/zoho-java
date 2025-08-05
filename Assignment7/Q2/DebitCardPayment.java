package Assignment7.Q2;

import java.util.Scanner;

public class DebitCardPayment implements PaymentMethod {
    private double balance = 100000; 
    private final int correctPin = 1234; 
    private String recipient;

    DebitCardPayment(String recipient){
        this.recipient = recipient;
    }
    @Override
    public void pay(double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Debit Card PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == correctPin) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Payment of Rs : " + amount + " to " + recipient + " successful using Debit Card.");
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Payment failed: Insufficient balance.");
            }
        } else {
            System.out.println("Incorrect PIN. Payment failed.");
        }
    }
    
}
