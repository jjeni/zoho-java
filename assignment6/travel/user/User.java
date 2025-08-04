package assignment6.travel.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment6.travel.booking.Ticket;

public class User {
    private String userName;
    private List<Ticket> bookings = new ArrayList<>(); 

    public void bookTicket(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name : ");
        userName = sc.nextLine();
        System.out.print("Enter your Destination : ");
        String location = sc.nextLine();
        System.out.print("Enter Date of Travel (DD/MM/YYYY) : ");
        String date = sc.nextLine();
        Ticket ticket = new Ticket(location);
        
        bookings.add(ticket);
        System.out.println("\nTicket Booked Successfully!");
    }

    public void viewTickets() {
        if (bookings.isEmpty()) {
            System.out.println("No tickets booked yet.");
            return;
        }

        System.out.println("\n--- Booked Tickets for " + userName + " ---");
        for (Ticket ticket : bookings) {
            System.out.println("Ticket ID: " + ticket.getTicketId());
            System.out.println("Destination: " + ticket.getDestination());
            System.out.println("Fare: Rs : " + ticket.getFare());
            System.out.println("--------------------------");
        }
    }
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        while (true) {
            System.out.println("\n=== Ticket Booking System ===");
            System.out.println("1. Book a Ticket");
            System.out.println("2. View Booked Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    user.bookTicket();
                    break;
                case 2:
                    user.viewTickets();
                    break;
                case 3:
                    System.out.println("Thank you! Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
