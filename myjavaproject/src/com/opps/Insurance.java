package com.opps;

import java.util.Scanner;

public class Insurance {

	
		static Scanner sc = new Scanner(System.in);
		String getCustomerAddressDetails() {
	        String address = null;
	        
	        System.out.println("Enter Flat Number:");
	        String fno = sc.nextLine();
	        
	        System.out.println("Enter Street Name:");
	        String street = sc.nextLine();
	        
	        System.out.println("Enter City:");
	        String city = sc.nextLine();
	        
	        System.out.println("Enter PINCODE:");
	        long pin = sc.nextLong();

	        address =  "Flat No : " + fno +
	               " , Street : " + street +
	               " , City : " + city +
	               " , PIN : " + pin;
	        return address;
	    }
		String getVehicleDetails() {
	        String details = null;
	        
	        System.out.println("Enter Vehicle Brand (e.g. Toyota):");
	        String brand = sc.nextLine();
	        
	        System.out.println("Enter Vehicle Model (e.g. Fortuner):");
	        String model = sc.nextLine();
	        
	        System.out.println("Enter Manufacturing Year:");
	        int year = sc.nextInt();
	        
	        System.out.println("Enter Vehicle Value (in Rs):");
	        double value = sc.nextDouble();
	        

	        details =  "Brand   : " + brand +
	               "\nModel   : " + model +
	               "\nYear    : " + year +
	               "\nValue   : Rs " + value;
	        return details;
	    }

	  double getPremium() {
	        return 0.0;
	    }
	

		
		
		    
		public  boolean isValidPAN() {
		       System.out.println("Enter PAN Number");
		       String pan = sc.next();
		        return pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		    }
		public  boolean isValidPhone() {
		       System.out.println("Enter Phone Number");
		       String phone = sc.next();
		        return phone.matches("[6-9]\\d{9}" );
		    }
		
			 
		public  boolean isValidAadhaar() {
	       System.out.println("Enter 12 digit Aadhaar Number");
	       String aadhaar = sc.next();
	        return aadhaar.matches("\\d{12}");
	    }
		int getCustomerAge() {
			System.out.println("Enter your age:");
			int age = sc.nextInt();
			return age;
		}
		 

		    public boolean isValidDrivingLicense() {
		        System.out.println("Enter Driving License Number (e.g. TS0920200012345):");
		        String dl = sc.next().toUpperCase();
		        // Format: 2 letters (state) + 2 digits (RTO) + 4 digits (year) + 7 digits
		        if (dl.matches("^[A-Z]{2}[0-9]{2}[0-9]{4}[0-9]{7}$")) {
		            System.out.println("  >> Driving License Verified Successfully!");
		            return true;
		        } else {
		            System.out.println("  >> Invalid Driving License!");
		            return false;
		        }
		    }

		    
		    public boolean isValidVehicleRC() {
		        System.out.println("Enter Vehicle Registration Number (e.g. TS09AB1234):");
		        String rc = sc.next().toUpperCase();
		        // Format: 2 letters + 2 digits + 2 letters + 4 digits
		        if (rc.matches("^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$")) {
		            System.out.println("  >> Vehicle RC Verified Successfully!");
		            return true;
		        } else {
		            System.out.println("  >> Invalid RC Number!");
		            return false;
		        }
		    }

		    
		    

	}


