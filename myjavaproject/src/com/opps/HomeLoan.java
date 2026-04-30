package com.opps;

public class HomeLoan  extends Loan {
	
	void getHomeLoanDocInfo() {
		System.out.println("All docs submitted Successfully !!");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Nandhu's Loan banking!!");
		
		HomeLoan hl = new HomeLoan();

		int cibil = hl.getCibilScore();
		double salary = hl.getCustomerSalary();
		int age = hl.getCustomerAge();

		if (cibil > 700 && salary > 600000.00 && age > 22 && hl.isValidAadhaar() && hl.isValidPAN()
				&& hl.isValidPhone()) {
			System.out.println("Congrtulations !! Your Home Loan got approved ");
			System.out.println("Your Home Loan ROI is : " + hl.getROI());
			System.out.println("As entered Confirming Your Detials are : ");
			System.out.println(hl.getCustomerAddressDetails());
			hl.getHomeLoanDocInfo();

		} else {
			System.out.println("Sorry !! Your Home Loan got Rejected ");
		}

		

	}

}
