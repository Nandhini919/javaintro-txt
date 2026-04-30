package com.opps;



import java.util.Scanner;

//Child or SUb or Derived class 
public class PersonalLoan extends Loan {

	static Scanner sc = new Scanner(System.in);

	void getPersonalLoanDocInfo() {
		System.out.println("Submitted all the documents Successfully !!");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Nandhu's Personal Loan Banking !!");

//		Scenario 1: By using Child Object & Child Reference, we can call both 
//		Parent class functionalities as well as child class functionalities.
		PersonalLoan pl = new PersonalLoan();
		
//		Scenario 2: By using PArent Object & Parent Reference, what we call ..? 
//		Loan l1 = new Loan();
		
//		Scenario3 : Can we store Child Object into parent reference ..? 
//		If yes ..? Which methods we can call, Only Parent or Only Child or Both ..? 
//		Loan l2 = new PersonalLoan();
		
		
//		Scenario4: Can we store Parent Object into child Reference ..? 
//		If yes ..? Which methods we can call, Only Parent or Only Child or Both ..?
//		PersonalLoan p2 = new Loan();

		int cibil = pl.getCibilScore();
		double salary = pl.getCustomerSalary();
		int age = pl.getCustomerAge();

		if (cibil > 760 && salary > 1000000.00 && age > 25 && pl.isValidAadhaar() && pl.isValidPAN()
				&& pl.isValidPhone()) {
			System.out.println("Congrtulations !! Your  Personal Loan got approved ");
			System.out.println("Your Personal Loan ROI is : " + pl.getROI());
			System.out.println("As entered Confirming Your Detials are : ");
			System.out.println(pl.getCustomerAddressDetails());
			pl.getPersonalLoanDocInfo();

		} else {
			System.out.println("Sorry !! Your  Personal Loan got Rejected ");
		}

	}

}


		