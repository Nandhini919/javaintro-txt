package com.exceptionhandlings;

import java.util.Scanner;

public class TestDemoEx01 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			int a = sc.nextInt();
			
			System.out.println("Enter b number:");
			int b = sc.nextInt();
			
			try {
				System.out.println("In try");
				System.out.println(a / b);
			}catch(Exception ex) {
				System.out.println("In Catch");
				System.err.println("we should not enter 0's ");
			}
			
		
		System.out.println("Main Method Ended!!!");
	}

}
