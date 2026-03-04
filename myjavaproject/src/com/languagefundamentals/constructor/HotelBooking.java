package com.languagefundamentals.constructor;

public class HotelBooking {
    String guestName;
    String roomType;
    String checkIn;
    String checkOut;
    double pricePerNight;

    HotelBooking(String guestName, String roomType, String checkIn, String checkOut, double pricePerNight) {
        System.out.println("HotelBooking Constructor called!");
        this.guestName = guestName;
        this.roomType = roomType;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.pricePerNight = pricePerNight;
    }

    

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("Vikram", "Deluxe", "2025-01-10", "2025-01-15", 3500.0);
        h1.bookingInfo();
    }
    void bookingInfo() {
        System.out.println("Guest Name      : " + guestName);
        System.out.println("Room Type       : " + roomType);
        System.out.println("Check-In        : " + checkIn);
        System.out.println("Check-Out       : " + checkOut);
        System.out.println("Price Per Night : " + pricePerNight);
    }
}
