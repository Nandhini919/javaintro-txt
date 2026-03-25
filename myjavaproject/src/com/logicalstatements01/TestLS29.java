package com.logicalstatements01;

import java.util.Scanner;

public class TestLS29 {

	public static void main(String[] args) {
		System.out.println("Welcome to Nandhu's World!!");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Tell about your name:");
		String name=sc.nextLine();
		System.out.println("Hello Mr." +name);
		
		System.out.println("Can you tell me,How much assets you have..?");
		double assets=sc.nextDouble();
		System.out.println("Enter your Salary info:");
		double salary =sc.nextDouble();
		
		if(assets >= 5000000.00 && salary >= 2000000.00) {
			System.out.println("Yes !! Then we can  start the conversation");
			
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			
			if(age <= 28 && age >= 26) {
				System.out.println("Oh Okay!! shall we proceed further");
				System.out.println("Can we enter your weight..?");
				
				double weight=sc.nextDouble();
				
				if(weight <= 70 && weight >=65) {
					System.out.println("Okay Cool!! let's enter your height");
					float height =sc.nextFloat();
					
					if(height >=5.4 && height <=6.0) {
						System.out.println("Okay good to go!!!");
					}else {
						System.out.println("Your height is too long or too short !! not matching with you info");
						
					}
				}else {
					System.out.println("You must join the GYM");
				}			
				
			}else {
				System.out.println("Your height is not matching the profile");
			}
		}else {
			System.out.println("you can leave for the day!!All the Best");
		}
		
		
		
	}

}
