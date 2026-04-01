package com.loopsstatements;

import java.util.Scanner;

public class Loops15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int r=0;
		int rev=0;
		int temp = n;
		
		while(n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		
		if(temp == rev) {
			System.out.println("The given number is Palindrome: ");	
		}else {
			System.out.println("The given number is not a Palindrome: ");	
		}
		System.out.println("Reverse of a Number: "+rev);
		sc.close();
		
	

	}

}
