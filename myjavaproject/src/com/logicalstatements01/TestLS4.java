package com.logicalstatements01;

import java.util.Scanner;

public class TestLS4 {

	public static void main(String[] args) {
		System.out.println("Main Started!!");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		
		 if (age >= 0 && age <= 5) {
	            System.out.println("You are a Kid.");
	        } else if (age >= 6 && age <= 12) {
	            System.out.println("You are a Child.");
	        } else if (age >= 13 && age <= 19) {
	            System.out.println("You are a Teen.");
	        } else if (age >= 20 && age <= 35) {
	            System.out.println("You are Young.");
	        } else if (age >= 36 && age <= 60) {
	            System.out.println("You are Middle Age.");
	        } else if (age > 60) {
	            System.out.println("You are a Senior Citizen.");
	        } else {
	            System.out.println("Invalid Age!");
	        }

	        sc.close();
		
		
	}

}
