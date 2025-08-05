package Assignment7.Q2;

import java.util.Scanner;

public class UPIPayment implements PaymentMethod {
    private double balance = 75000;
    private final int upiPin = 1234;
    private String recipient;

    UPIPayment(String recipient){
        this.recipient = recipient;
    }

    @Override
    public void pay(double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UPI PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == upiPin) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Payment of Rs : " + amount + " to " + recipient +  " successful using UPI.");
                System.out.println("Remaining Balance: Rs : " + balance);
            } else {
                System.out.println("Payment failed: Insufficient UPI balance.");
            }
        } else {
            System.out.println("Incorrect UPI PIN. Payment failed.");
        }
    }
}
