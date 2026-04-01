package com.loopsstatements;
//check number is prime or not ?
import java.util.Scanner;

public class Loops08 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!!!");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		boolean status=true;
		
		if(n ==0 || n == 1) {
			status=false;
		}
		
		for(int i = 2;i < n;i++) {
			
			if(n % i == 0) {
				status=false;
				break;
			}
		}
		
		if(status) {
			System.out.println("The Given Number is Prime!");
		}	else {
			System.out.println("The Given Number is  Not Prime!");
		}
		sc.close();
		
	}

}
