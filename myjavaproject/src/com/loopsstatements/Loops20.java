package com.loopsstatements;

import java.util.Scanner;

public class Loops20 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int n = sc.nextInt();

	        int fact = 1, i = 1;

	        while (i <= n) {
	            fact = fact * i;
	            i++;
	        }
	        System.out.println("Factorial: " + fact);
	        sc.close();
		
	}

}
