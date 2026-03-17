package com.languagefundamentals.method;

public class ZoomCarRental {

    // 1. Return the name of the company
    public String getCompanyName() {
        return "ZoomCar Rentals";
    }

    // 2. Return the fixed daily rental rate
    public double getDailyRate() {
        return 1500.0;
    }

    // 3. Calculate base rental cost based on number of days
    public double calculateBaseRentalCost(int days) {
        return getDailyRate() * days;
    }

    // 4. Return fixed insurance fee
    public double getInsuranceFee() {
        return 500.0;
    }

    // 5. Calculate total cost (base rental + insurance)
    public double calculateTotalCost(int days) {
        return calculateBaseRentalCost(days) + getInsuranceFee();
    }

    // 6. Return a welcome message for customers
    public String getWelcomeMessage() {
        return "Welcome to " + getCompanyName() + "! We are happy to serve you.";
    }

    // Main method to test all functionality
    public static void main(String[] args) {
    	System.out.println("Main Method Started");
        ZoomCarRental car = new ZoomCarRental();

        int days = 3; // Example: renting for 3 days

        System.out.println(car.getWelcomeMessage());
        System.out.println("Company Name     : " + car.getCompanyName());
        System.out.println("Daily Rate       : ₹" + car.getDailyRate());
        System.out.println("Days Rented      : " + days);
        System.out.println("Base Rental Cost : ₹" + car.calculateBaseRentalCost(days));
        System.out.println("Insurance Fee    : ₹" + car.getInsuranceFee());
        System.out.println("Total Cost       : ₹" + car.calculateTotalCost(days));
    }
}
