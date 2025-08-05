package Assignment7.Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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
                    Ticket busticket = new Bus();
                    busticket.bookTicket();
                    bookings.add(busticket);
                    break;
                case 2 :
                    Ticket trainticket = new Train();
                    trainticket.bookTicket();
                    bookings.add(trainticket);
                    break;
                case 3 :
                    Ticket flightticket = new Flight();
                    flightticket.bookTicket();
                    bookings.add(flightticket);
                    break;
                case 4 :
                    for(int i=0; i<bookings.size(); i++){
                        System.out.println("--------Your Previous Bookings-------");
                        System.out.println("Ticket : "+ (i+1));
                        System.out.println("--------------------------------------------------");
                        ((Bus) bookings.get(i)).printTicket();
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
