package com.languagefundamentals.method;
import java.util.Scanner;
public class Method6 {
//scanner
	public static void main(String[] args) {
		System.out.println("Main!!!!!");
		//In Scanner class,no arguments constructor we are unable to create object from scanner class
		//so we must need to pass arguments
		//Scanner sc=new Scanner();
		
		
		//to read the elements from console
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		System.out.println("Enter your First name:");
		String fname=sc.next();
		System.out.println("Enter your Last name:");
		String lname=sc.next();
		System.out.println("Enter your Email:");
		String email=sc.next();
		
		Method6 m6=new Method6();

		m6.getEmployeeAge(age);
		m6.getEmployeeFirstName(fname,lname);
		m6.getEmployeeEmail(email);
		sc.close();
	}
	
	void getEmployeeAge(int age) {
		System.out.println("Employee age is:"+age);
	}
	void getEmployeeFirstName(String fn,String ln) {
		System.out.println(" The First name Employee  is:"+fn + ""+ln);
	}
	void getEmployeeEmail(String email) {
		System.out.println("Enter the mail is:"+email);
		}
	

}
