package com.loopsstatements;

import java.util.Scanner;

//convert decimal to binary
public class Loops32 {

	public static void main(String[] args) {
		System.out.println("Main Started!!!!!!!!");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int r=0;
		String rev="";
		
		while(n!=0) {
			r=n%2;
			n=n/2;
			rev=r+rev;
			
			}
		
		
		System.out.println("Binary number for given number is:"+rev);
		System.out.println("Main Ended!!!!!!!!");
		sc.close();

	}

}
