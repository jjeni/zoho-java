package assignment6.travel.booking;
import java.util.Random;

public class Ticket {
    private int ticketId;
    private String destination;
    private double fare;

    public Ticket(String destination) {
        Random rand = new Random();
        this.ticketId = 10000 + rand.nextInt(90000);
        int km = 150 + rand.nextInt(500);
        double ratePerKm = 5.5 + rand.nextDouble(4.5);
        this.fare = (km * ratePerKm)+ 50;
        this.destination = destination;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }

}
