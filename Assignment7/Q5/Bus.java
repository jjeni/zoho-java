package Assignment7.Q5;

import java.util.Scanner;

public class Bus implements Ticket{

    String seatType;
    private String passengerName;
    private String fromLocation;
    private String toLocation;
    private String dateOfTravel;

    Bus(){
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
        System.out.println("You are Going to Book  Bus, Thank you for Choosing J- Bus !");
        System.out.println("Please, select the seat type : ");
        System.out.println("1. Seater (or) 2.Sleeper");
        int selection = sc.nextInt();
        if(selection == 1){
            this.seatType = "Semi-Sleeper";
        }
        else {
            this.seatType = "Sleeper";
        }
        System.out.println("--------------------------------------------------");
    }

    public void printTicket() {
        System.out.println("Dear " + this.passengerName + ", thank you for choosing J-Bus to book your ticket!");
        System.out.println("--------------------------------------------------");
        System.out.println("Here are your trip details:");
        System.out.println("From           : " + this.fromLocation);
        System.out.println("To             : " + this.toLocation);
        System.out.println("Date of Travel : " + this.dateOfTravel);
        System.out.println("Seat Type      : " + this.seatType);
        System.out.println("--------------------------------------------------");
        System.out.println("Have a safe and pleasant journey with J-Bus!");
        System.out.println("--------------------------------------------------");
    }
}
