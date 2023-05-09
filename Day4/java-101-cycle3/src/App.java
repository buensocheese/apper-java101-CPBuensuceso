package flight;

public class App {
    public static void main(String[] args) {
        Flight manilaToBoracay = new Flight();

        // Outputs initial values
        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        // Adds 10 passengers
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        // Full
        manilaToBoracay.addPassenger();

        // Updates total number of seats
        manilaToBoracay.setNumberOfSeats(20);

        // Adds 3 more passengers
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        // Outputs final count
        System.out.println(
                "Current # of available seats: " + (manilaToBoracay.seats - manilaToBoracay.passengers));// 7
        System.out.println(
                "Current # of passengers: " + manilaToBoracay.passengers);// 13
    }
}