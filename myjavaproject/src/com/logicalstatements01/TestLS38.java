package com.logicalstatements01;

import java.util.Scanner;

public class TestLS38 {

	public static void main(String[] args) {
		System.out.println("Main!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice:");
		int choice =sc.nextInt();
		switch(choice) {
		    case 1 -> System.out.println("Withdraw Cash");
		    case 2 -> System.out.println("Deposit Cash");
		    case 3 -> System.out.println("Check Balance");
		    case 4 -> System.out.println("Change PIN");
		    case 5 -> System.out.println("Exit. Thank you!");
		    default -> System.out.println("Invalid option! Try again.");
		}

	}

}
