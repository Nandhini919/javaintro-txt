package com.languagefundamentals.constructor;

public class Flight {
    String passengerName;
    String source;
    String destination;
    String airlineName;
    String flightNumber;
    double ticketPrice;
    String seatClass;

    Flight() {
        System.out.println("No-arg constructor called");
    }

    Flight(String passengerName, String source, String destination) {
        System.out.println("Parametrized-1 constructor called");
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
    }

    Flight(Flight f, String airlineName, String flightNumber) {
        System.out.println("Parametrized-2 constructor called");
        this.passengerName = f.passengerName;
        this.source = f.source;
        this.destination = f.destination;
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
    }

    Flight(Flight f, double ticketPrice, String seatClass) {
        System.out.println("Parametrized-3 constructor called");
        this.passengerName = f.passengerName;
        this.source = f.source;
        this.destination = f.destination;
        this.airlineName = f.airlineName;
        this.flightNumber = f.flightNumber;
        this.ticketPrice = ticketPrice;
        this.seatClass = seatClass;
    }

    

    public static void main(String[] args) {
        Flight f1 = new Flight("Vikram", "Hyderabad", "Delhi");
        f1.showDetails();

        Flight f2 = new Flight(f1, "IndiGo", "6E-204");
        f2.showDetails();

        Flight f3 = new Flight(f2, 8500.0, "Business Class");
        f3.showDetails();
    }
    void showDetails() {
        System.out.println("Passenger Name  : " + passengerName);
        System.out.println("Source          : " + source);
        System.out.println("Destination     : " + destination);
        System.out.println("Airline         : " + airlineName);
        System.out.println("Flight Number   : " + flightNumber);
        System.out.println("Ticket Price    : " + ticketPrice);
        System.out.println("Seat Class      : " + seatClass);
        System.out.println("*************************************");
    }
}