package assignment6;

import java.util.Scanner;
import java.util.Random;

class Gateway {
  
    private long transactionID;
    private String payerName;
    private String payeeName;
    private int amount;
    private String paymentMethod;
    private String status;

    public void setId(long id) {
        if (id > 0) this.transactionID = id;
    }

    public long getId() {
        return this.transactionID;
    }

    public void setPayer(String payer) {
        if (payer != null && !payer.trim().isEmpty()) {
            this.payerName = payer;
        }
    }

    public String getPayer() {
        return this.payerName;
    }

    public void setPayee(String payee) {
        if (payee != null && !payee.trim().isEmpty()) {
            this.payeeName = payee;
        }
    }

    public String getPayee() {
        return this.payeeName;
    }

    public void setAmount(int amount) {
        if (amount > 0) this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setPaymentMethod(String method) {
        if (method != null) {
            method = method.toUpperCase();
            if (method.equals("UPI") || method.equals("NEFT") || method.equals("IMPS")) {
                this.paymentMethod = method;
            } else {
                System.out.println("Invalid payment method. Choose only UPI, NEFT, or IMPS.");
            }
        }
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        }
    }

    public String getStatus() {
        return this.status;
    }

    public void displayTransactionSummary() {
        System.out.println("\n----- Transaction Summary -----");
        System.out.println("Transaction ID : " + transactionID);
        System.out.println("Payer Name     : " + payerName);
        System.out.println("Payee Name     : " + payeeName);
        System.out.println("Amount         : Rs : " + amount);
        System.out.println("Payment Method : " + paymentMethod);
        System.out.println("Status         : " + status);
        System.out.println("--------------------------------");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gateway g = new Gateway();
        Random r = new Random();


        long id = 1000000000L + (long)(r.nextDouble()*8999999999L);
        g.setId(id);

        System.out.print("Enter Payer Name: ");
        String payer = sc.nextLine();
        g.setPayer(payer);

        System.out.print("Enter Payee Name: ");
        String payee = sc.nextLine();
        g.setPayee(payee);

        System.out.print("Enter Amount: ");
        int amt = sc.nextInt();
        g.setAmount(amt);
        sc.nextLine(); 

        System.out.print("Enter Payment Method (UPI / NEFT / IMPS): ");
        String method = sc.nextLine();
        g.setPaymentMethod(method);

        if (g.getPaymentMethod() != null) {
            g.setStatus("Success");
        } else {
            g.setStatus("Failed");
        }

        g.displayTransactionSummary();

        sc.close();
    }
}
