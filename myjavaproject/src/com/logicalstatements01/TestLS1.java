package com.logicalstatements01;

import java.util.Scanner;

public class TestLS1 {

	public static void main(String[] args) {
		System.out.println("Main Started!!!!!!!!!");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your age:");
		int age=sc.nextInt();
		if(age > 18) {
			System.out.println("You Are Eligible For voting and driving!!");
			System.out.println("Congrats");
		}
		else {
			System.out.println("Mundhu chaduvukora!");
		}
		
		
		System.out.println("Main Ended!!!!!!!!!");
	}

}