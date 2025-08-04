package Assignment5;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Ticket{
    String passengerName;
    String fromLocation;
    String toLocation;
    String dateOfTravel;

    Ticket(){
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
    void bookTicket(){
        System.out.println("Welcom to J-Booking.com !");
    }
    void printTicket(){
        System.out.println("Printing your Bookings !");
    }
}

class BusTicket extends Ticket{
    String seatType;

    void bookTicket(){
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

    void printTicket() {
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

class TrainTicket extends Ticket{
    String berthPreference;

    void bookTicket(){
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
    void printTicket() {
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

class FlightTicket extends Ticket{
    String travelClass;

    void bookTicket(){
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
    void printTicket() {
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


public class Q4 {
    public static void main(String[] args) {
        List<Ticket> bookings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to J-Booking.com. Here, you book Bus, Train, Flight Tickets.");
        int menu = 1;
        while(menu !=0){
            System.out.println("Please Book a 1.Bus (or) 2.Train (or) 3.Flight (or) 4.View Previous Bookings (or) 0.Exit");
            System.out.print("Enter your selection : ");
            menu = sc.nextInt();
            switch(menu){
                case 1 :
                    Ticket busticket = new BusTicket();
                    busticket.bookTicket();
                    bookings.add(busticket);
                    break;
                case 2 :
                    Ticket trainticket = new TrainTicket();
                    trainticket.bookTicket();
                    bookings.add(trainticket);
                    break;
                case 3 :
                    Ticket flightticket = new FlightTicket();
                    flightticket.bookTicket();
                    bookings.add(flightticket);
                    break;
                case 4 :
                    for(int i=0; i<bookings.size(); i++){
                        System.out.println("--------Your Previous Bookings-------");
                        System.out.println("Ticket : "+ (i+1));
                        System.out.println("--------------------------------------------------");
                        bookings.get(i).printTicket();
                    }
                case 0 :
                    System.out.println("Thank you for choosing us!");
                    break;
                default :
                    break;
            }
        }
    }
}
