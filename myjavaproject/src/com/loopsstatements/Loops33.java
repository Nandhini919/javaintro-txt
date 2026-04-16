package com.loopsstatements;

import java.util.Scanner;

//WAP to restrict login only for 3 attempts.
public class Loops33 {

	public static void main(String[] args) {
		
		String username="admin";
		String password="admin@123";
		int attempts=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(attempts<3) {
			System.out.println("Enter your Username:");
			String user=sc.next();
			
			System.out.println("Enter your Password:");
			String pass=sc.next();
		
		if(user.equalsIgnoreCase(username) && pass.equals(password)) {
			System.out.println("login Successfull!!");
		}else {
			System.err.println("Invalid User Credentials!!");
			attempts++;
		}	
		}
		if(attempts==3) {
			System.err.println("Your Account locked for 24hrs!!");	
		}
		sc.close();

	}

}
