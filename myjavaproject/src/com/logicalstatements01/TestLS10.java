package com.logicalstatements01;

import java.util.Scanner;

public class TestLS10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your age:");
	        int age = sc.nextInt();
	        System.out.println("Do you have Voter ID? (yes/no):");
	        String voterId = sc.next();

	        if (age >= 18 && voterId.equalsIgnoreCase("yes")) {
	            System.out.println("You CAN vote!");
	        } else if (age >= 18 && voterId.equalsIgnoreCase("no")) {
	            System.out.println("Get Voter ID first!");
	        } else {
	            System.out.println("You are too young to vote!");
	        }
	        sc.close();

	}

}
