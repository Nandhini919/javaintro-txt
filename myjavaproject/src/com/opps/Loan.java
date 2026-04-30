package com.opps;

import java.util.Scanner;

public class Loan {


	static Scanner sc = new Scanner(System.in);
	
	String getCustomerAddressDetails() {
	String address = null;
	
	System.out.println("Enter your Flat number:");
	String fno = sc.next();
	

	System.out.println("Enter your plot number:");
	String plot = sc.next();
	

	System.out.println("Enter your Street name:");
	String street = sc.next();
	
	System.out.println("Enter your City name:");
	String city = sc.next();
	
	System.out.println("ENter Your PINCODE  ");
	long pin = sc.nextLong();

	address = "Flat NO : " + fno + " , Plot  :" + plot + " , Street : " + street + " , City : " + city + " , PIN : "
			+ pin;
	
	return address;
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
	 
	
	
	double getROI() {
		return 10.5;
	}
	

	int getCibilScore() {
		System.out.println("Enter your cibil score:");
		int cibil = sc.nextInt();
		return cibil;
	}
	
	
	int getCustomerAge() {
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		return age;
	}
	
	double getCustomerSalary(){
		System.out.println("Enter your salary:");
		double salary = sc.nextDouble();
		return salary;
	}
	
}
