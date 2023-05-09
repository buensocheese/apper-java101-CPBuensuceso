package flight;

public class Flight {
    int seats;
    int passengers;

    Flight() {
        seats = 10;
        passengers = 0;
    }

    // Updates available seats, checks if already full
    public void addPassenger() {
        if (passengers < seats) {
            passengers++;
            System.out.println("Passenger added. Available seats: " + (seats - passengers));
        } else {
            System.out.println("Full");
        }
    }

    // Outputs updated total number of seats
    public void setNumberOfSeats(int seats) {
        this.seats = seats;
        System.out.println("Number of seats updated to " + seats);
    }
}