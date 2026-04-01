package com.loopsstatements;

import java.util.Scanner;

//WAP to print sum of given number using while loop.
public class Loops14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int r=0;
		int sum = 0;
		
		while(n!=0) {
			r=n % 10;
			n= n / 10;
			sum = sum + r;
		}
		System.out.println("Sum of Givne number is:"+sum);
		sc.close();

	}

}
