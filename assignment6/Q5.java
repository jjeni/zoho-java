package assignment6;

import java.util.*;

class BankAccount {
    private static String bankName = "Digital Bank of Republic Surandai (DBRS)";
    private long accountNumber;
    private String accountHolder;
    private  double balance = 50000;

    public void setAccountNumber(long num){
        this.accountNumber = num;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountHolder(String name){
        this.accountHolder = name;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }
    public void viewAccount() {
    System.out.println("===== Account Details =====");
    System.out.println("Bank Name       : " + bankName);
    System.out.println("Account Number  : " + accountNumber);
    System.out.println("Account Holder  : " + accountHolder +"\n");
}
    public void deposit(Scanner sc) {
    System.out.println("Enter the Deposit Amount (Denomination of 100): ");
    int amount = sc.nextInt();
    sc.nextLine();

    if (amount > 0 && amount % 100 == 0) {
        balance += amount;
        System.out.println("Deposit Successful, Thank you for Choosing " + bankName);
        System.out.println("Latest Balance: Rs : " + balance);
    } else {
        System.out.println("Invalid deposit amount! Please enter a positive amount in the denomination of 100.");
    }
}


    public void withdraw(double amt){
       if (amt > 0 && amt <= this.balance){
            System.out.println("Please, Collect the cash of : "+amt);
            this.balance = this.balance -amt;
            System.out.println("Thank you for Choosing "+bankName);
        }
        else {
            System.out.println("Withraw Failed! Please Enter the Amount Low from your Balance.");
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Jeni J");
        acc.setAccountNumber(124578784741L);
        int menu =1;
        while (menu != 0){
            System.out.println("=====================================");
            System.out.println("Welcome to Digital Bank of Republic Surandai (DBRS)");
            System.out.println("\n1. View Your Savings Account\n2.Deposit Cash\n3.Withdraw Cash\n4.Check Balance\n0.Exit");
            System.out.print("\nPlease Select Your Operation : ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    acc.viewAccount();
                    break;
                case 2:
                    acc.deposit(sc);
                    break;
                case 3:
                    System.out.print("Please, Enter the amount to withdraw : ");
                    int money = sc.nextInt();
                    sc.nextLine();
                    acc.withdraw(money);
                    break;
                case 4:
                    System.out.println("\nBalance fetched Sucessful !");
                    System.out.println("Account Balance : "+acc.getBalance());
                    break;
                case 0:
                    System.out.println("Thank you for banking with DBRS. Have a great day!");
                    break;
                default:
                    System.out.println("Invalid Operation !");
                    break;
            }
            
        }

        sc.close();
    }
}
