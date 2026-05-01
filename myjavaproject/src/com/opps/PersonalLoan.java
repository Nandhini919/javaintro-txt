package com.opps;



import java.util.Scanner;

//Child or SUb or Derived class 
public class PersonalLoan extends Loan {

	static Scanner sc = new Scanner(System.in);

	void getPersonalLoanDocInfo() {
		System.out.println("Submitted all the documents Successfully !!");
	}
	@Override
	double getROI() {
		return 8.5;
	}
//	Method Overriding rules:
//		 1.method signature must be same.
//		 NOTE:method signature means method names + arguments, but not return type
	
//		 2.method return type must be same until 1.4 ,from 1.5 onwards we can use Co-varient return types.
//		 NOTE:if the parent class method return types is primitive data type,child class must be same primitive data type even after 1.5 version.
	
//		if the parent class method return type is object type,then the child class can be same return type or its sub type is the concept called Co-varient return type.
	
//		Co-varient return type ex:
//		p-->number-->child-->Number,Long,Double,Integer.........
//		p-->object-->child-->Object,string,StringBuffer,Employee..any object
//		p-->String-->child-->String only because String does not have any sub classes.
	
	@Override
	long getphone() {
		long l  = 7981596131L;
		return l;
	}
	

	public static void main(String[] args) {
		System.out.println("Welcome to Nandhu's Personal Loan Banking !!");

//		Scenario 1: By using Child Object & Child Reference, we can call both 
//		Parent class functionalities as well as child class functionalities.
		PersonalLoan pl = new PersonalLoan();
		
//		Scenario 2: By using Parent Object & Parent Reference, what we call ..?
//		we can call only parent class loan class functionalities but not child class functionalities.
		Loan l1 = new Loan();
		
//		Scenario3 : Can we store Child Object into parent reference ..? 
//		which will consider as up-casting
//		If yes ..? Which methods we can call,by using child object with parent reference Only Parent or Only Child or Both ..? 
//      only parent functionalities we can call
		
//		dynamic dispatching :whenever the child objects storing into parent reference
//		we can call only parent class functionalities but if any of the method is overiding from the parent to child 
//		then  it calls the child class overridden method only
		
		Loan l2 = new PersonalLoan();
		System.out.println("***********"+l2.getROI());
		
		
//		Scenario4: Can we store Parent Object into child Reference ..? 
//		If yes ..? Which methods we can call, Only Parent or Only Child or Both ..?
//		no, we cannot store parent object into child reference
//		downcasting is not possible in java directly,but we can typecast the object with child just for namesake.
//		after type casting if we call any method we will get a runtime exception java.lang.Castexception error
		PersonalLoan p2 = (PersonalLoan) new Loan();//Type mismatch: cannot convert from Loan to PersonalLoan

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


		