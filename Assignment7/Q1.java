package Assignment7;
import java.util.Random;
import java.util.Scanner;


class Customer{
    private String  customerName;
    private int age;

    public void setDetails(String name, int age) {
    this.customerName = name;
    this.age = age;
    }

    public void viewDetails() {
    System.out.println("===== Account Details =====\n");
    System.out.println("Account Holder Name  : " + customerName);
    System.out.println("Account Holder Age    : " + age +"\n");
    }  
}

class Account {
    
    private long accountNumber;
    private  double balance = 50000;

    public void setAccountNumber(long num){
        this.accountNumber = num;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(Scanner sc) {
    System.out.println("Enter the Deposit Amount (Denomination of 100): ");
    int amount = sc.nextInt();
    sc.nextLine();

    if (amount > 0 && amount % 100 == 0) {
        balance += amount;
        System.out.println("Deposit Successful, Thank you");
        System.out.println("Latest Balance: Rs : " + balance);
    } else {
        System.out.println("Invalid deposit amount! Please enter a positive amount in the denomination of 100.");
    }
}


    public void withdraw(double amt, RBI bank) {
        if (amt > 0 && amt <= this.balance && amt <= bank.getWithdrawalLimit()) {
            System.out.println("Please, Collect the cash of : " + amt);
            this.balance -= amt;
            System.out.println("Thank you");
        } else {
            System.out.println("Withdrawal Failed!");
        if (amt > bank.getWithdrawalLimit()) {
            System.out.println("Reason: Amount exceeds withdrawal limit of Rs " + bank.getWithdrawalLimit());
        }
        if (amt > this.balance) {
            System.out.println("Reason: Insufficient balance. Available: Rs " + this.balance);
        }
    }
}


}

abstract class RBI {
    Customer c;
    Account a;
    protected static final double MIN_INTEREST_RATE = 4.0;
    protected static final double MIN_WITHDRAW_LIMIT = 200000.0;
    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();
}

class SBI extends RBI {
    public double getInterestRate(){
        double rate = 7.5;
        return Math.max(rate, MIN_INTEREST_RATE);
    }
    public double getWithdrawalLimit(){
        return 300000;
    }
}

class ICICI extends RBI {
    public double getInterestRate(){
        double rate = 8.5;
        return Math.max(rate, MIN_INTEREST_RATE);
    }
    public double getWithdrawalLimit(){
        return 1000000;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name to Create a account : ");
        String cusName = sc.nextLine();
        System.out.print("Enter the customer age : ");
        int cusAge = sc.nextInt();
        sc.nextLine();
        Random rand = new Random();
        System.out.println("PLEASE, WAIT ACCOUNT CREATION IN PROGRESS ......");

        Customer customer = new Customer();
        customer.setDetails(cusName, cusAge);

        Account account = new Account();
        long accNumber = 100000000L + rand.nextInt(900000000); // 9-digit random number
        account.setAccountNumber(accNumber);

       
        RBI bank = null;

        while (true) {
            System.out.print("Choose Your Bank (1. SBI / 2. ICICI): ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                bank = new SBI();
                break;
            } else if (choice == 2) {
                bank = new ICICI();
                break;
            } else {
            System.out.println("Invalid choice. Please enter 1 or 2.\n");
        }
        }

        bank.c = customer;
        bank.a = account;

        System.out.println("\n===== Account Created Successfully! =====");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Bank Name     : " + (bank instanceof SBI ? "SBI" : "ICICI"));
        System.out.println("Interest Rate : " + bank.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: Rs " + bank.getWithdrawalLimit());
        System.out.println("Current Balance : Rs " + account.getBalance());

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. View Customer Details\n4. View Balance\n5. Exit");
            System.out.print("Choose an option: ");
            int op = sc.nextInt();
            sc.nextLine();

        switch (op) {
        case 1:
            bank.a.deposit(sc);
            break;
        case 2:
            System.out.print("Enter Amount to Withdraw: ");
            double amt = sc.nextDouble();
            sc.nextLine();
            if (amt <= bank.getWithdrawalLimit()) {
                bank.a.withdraw(amt, bank);
            } else {
                System.out.println("Amount exceeds your withdrawal limit of Rs " + bank.getWithdrawalLimit());
            }
            break;
        case 3:
            bank.c.viewDetails();
            break;
        case 4:
            System.out.println("Current Balance: Rs " + bank.a.getBalance());
            break;
        case 5:
            System.out.println("Thank you for banking with us!");
            return;
        default:
            System.out.println("Invalid option. Try again.");
        }
        }



    }
}


