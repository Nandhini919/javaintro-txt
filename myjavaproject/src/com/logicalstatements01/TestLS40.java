package com.logicalstatements01;

import java.util.Scanner;

public class TestLS40 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!");	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter marks Percentage:");
		int marks=sc.nextInt();
		
		
		 String result = switch (marks / 10) {
         case 10, 9 -> {
        	 
             yield "Excellent";
         }
         case 8 -> {
             yield "Very Good";
         }
         case 7 -> {
             yield "Good";
         }
         case 6 -> {
             yield "Average";
         }
         case 5 -> {
             yield "Pass";
         }
         default -> {
             System.out.println("Invalid Marks You Entered");
             yield "Invalid"; 
         }
     }; 
     System.out.println("Result: " + result);

 }
}