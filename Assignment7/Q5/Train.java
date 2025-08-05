package Assignment7.Q5;

import java.util.Scanner;

public class Train implements Ticket {
    String seatType;
    private String passengerName;
    private String fromLocation;
    private String toLocation;
    private String dateOfTravel;
    String berthPreference;

    Train(){
        System.out.println("--------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, Enter Your full name : ");
        this.passengerName = sc.nextLine();
        System.out.print("Enter Your Pick-Up Location : ");
        this.fromLocation = sc.nextLine();
        System.out.print("Enter Your Destination : ");
        this.toLocation = sc.nextLine();
        System.out.print("Enter the date of travel (DD/MM/YYYY) : ");
        this.dateOfTravel = sc.nextLine();
        System.out.println("--------------------------------------------------");
    }
    public void bookTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("You are Going to Book  Train, Thank you for Choosing J- Express !");
        System.out.println("Please, select the Berth Preference : ");
        System.out.println("1. Lower (or) 2.Middle (or) 3.Upper");
        int selection = sc.nextInt();
        if(selection == 1){
            this.berthPreference = "Lower";
        }
        else if (selection == 2){
            this.berthPreference = "Sleeper";
        }
        else {
            this.berthPreference = "Upper";
        }
        System.out.println("--------------------------------------------------");
    }
    public void printTicket() {
        System.out.println("Dear " + this.passengerName + ", thank you for choosing J-Express to book your ticket!");
        System.out.println("--------------------------------------------------");
        System.out.println("Here are your trip details:");
        System.out.println("From              : " + this.fromLocation);
        System.out.println("To                : " + this.toLocation);
        System.out.println("Date of Travel    : " + this.dateOfTravel);
        System.out.println("Berth Preference  : " + this.berthPreference);
        System.out.println("--------------------------------------------------");
        System.out.println("Wishing you a comfortable journey with J-Express!");
        System.out.println("--------------------------------------------------");
    }
}
