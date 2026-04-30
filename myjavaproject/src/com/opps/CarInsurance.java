package com.opps;


public class CarInsurance extends Insurance {

    // Car-specific document check
    void getCarInsuranceDocInfo() {
        System.out.println("Car Insurance Documents Submitted Successfully !!");
        System.out.println("Policy will be activated within 24 hours.");
    }

    // Car premium: 2% of vehicle value per year
    @Override
    double getPremium() {
        return 2.0;
    }

    public static void main(String[] args) {
       
        System.out.println("  Welcome to Nandhu's Car Insurance !!    ");
        

        CarInsurance ci = new CarInsurance();

        int age = ci.getCustomerAge();

        boolean aadhaar  = ci.isValidAadhaar();
        boolean pan      = ci.isValidPAN();
        boolean phone    = ci.isValidPhone();
        boolean dl       = ci.isValidDrivingLicense();
        boolean rc       = ci.isValidVehicleRC();

        // Car Insurance: age >= 18, all docs valid
        if (age >= 18 && aadhaar && pan && phone && dl && rc) {

           
            System.out.println("Congratulations!! Car Insurance Approved");
            System.out.println("Annual Premium Rate : " + ci.getPremium() + "%");
            System.out.println("\n--- Vehicle Details ---");
            System.out.println(ci.getVehicleDetails());
            System.out.println("\n--- Address Details ---");
            System.out.println(ci.getCustomerAddressDetails());
            ci.getCarInsuranceDocInfo();

        } else {
           
            System.out.println("Sorry!! Car Insurance Application Rejected");
            System.out.println("Reason: Age must be 18+ and all documents must be valid.");
            
        }
    }
}