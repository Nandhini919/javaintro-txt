package com.exceptionhandlings;

import java.util.Scanner;

public class TestDemoEx20 {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int a = sc.nextInt();
		
		System.out.println("Enter b Number:");
		int b = sc.nextInt();
		
		if(b != 0) {
			System.out.println(a/b);
			
		}else {
			throw new ArithmeticException("Don't send Zeros");
		}
		

	}

}
