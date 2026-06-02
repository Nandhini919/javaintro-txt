package com.exceptionhandlings;

import java.util.Scanner;

public class TestDemoEx05 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter a Number:");
		int a  = sc.nextInt();
		System.out.println(a * 10);
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
		System.out.println("Main ended");
		
		
	}

}
