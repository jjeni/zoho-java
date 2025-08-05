package Assignment7.Q5;

import java.util.Scanner;

public class Flight implements Ticket {
    String travelClass;
    String seatType;
    private String passengerName;
    private String fromLocation;
    private String toLocation;
    private String dateOfTravel;

    Flight(){
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
        System.out.println("You are Going to Book  Flight, Thank you for Choosing J- Airlines !");
        System.out.println("Please, select the travel Class : ");
        System.out.println("1. Economy (or) 2.Business");
        int selection = sc.nextInt();
        if(selection == 1){
            this.travelClass = "Economy";
        }
        else {
            this.travelClass = "Business";
        }
        System.out.println("--------------------------------------------------");
    }
    public void printTicket() {
        System.out.println("Dear " + this.passengerName + ", thank you for choosing J-Airlines to book your ticket!");
        System.out.println("--------------------------------------------------");
        System.out.println("Here are your flight details:");
        System.out.println("From           : " + this.fromLocation);
        System.out.println("To             : " + this.toLocation);
        System.out.println("Date of Travel : " + this.dateOfTravel);
        System.out.println("Travel Class   : " + this.travelClass);
        System.out.println("--------------------------------------------------");
        System.out.println("Wishing you a safe and pleasant flight with J-Airlines!");
        System.out.println("--------------------------------------------------");
    }
}
