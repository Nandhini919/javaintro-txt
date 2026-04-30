package com.opps;



public class BikeInsurance extends Insurance {

    // Bike-specific document check
    void getBikeInsuranceDocInfo() {
        System.out.println("Bike Insurance Documents Submitted Successfully !!");
        System.out.println("Third-party liability cover activated immediately.");
    }

    // Bike premium: 1.5% of vehicle value per year
    @Override
    double getPremium() {
        return 1.5;
    }

    public static void main(String[] args) {
        
        System.out.println("  Welcome to nandhu's Bike Insurance !!   ");
        

        BikeInsurance bi = new BikeInsurance();

        int age = bi.getCustomerAge();

        boolean aadhaar  = bi.isValidAadhaar();
        boolean pan      = bi.isValidPAN();
        boolean phone    = bi.isValidPhone();
        boolean dl       = bi.isValidDrivingLicense();
        boolean rc       = bi.isValidVehicleRC();

        // Bike Insurance: age >= 16 (gearless bikes allowed at 16)
        if (age >= 16 && aadhaar && pan && phone && dl && rc) {

            
            System.out.println("Congratulations!! Bike Insurance Approved");
            System.out.println("Annual Premium Rate : " + bi.getPremium() + "%");
            System.out.println("\n--- Vehicle Details ---");
            System.out.println(bi.getVehicleDetails());
            System.out.println("\n--- Address Details ---");
            System.out.println(bi.getCustomerAddressDetails());
            bi.getBikeInsuranceDocInfo();

        } else {
            
            System.out.println("Sorry!! Bike Insurance Application Rejected");
            System.out.println("Reason: Age must be 16+ and all documents must be valid.");
            
        }
    }
}