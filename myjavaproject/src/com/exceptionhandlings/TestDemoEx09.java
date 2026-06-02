package com.exceptionhandlings;

import java.util.Scanner;

public class TestDemoEx09 {
//in java,finally block will executes always,whether there is a problem or not.
//mainly ,we use finally block for clashing the connections or resources.
//ex.Scanner,connections	
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Main Started");
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		try {
			System.out.println("In Try");
			System.out.println(10/0);
			
			
		}catch(Exception e) {
			System.err.println("In Catch");
			
		}finally {
			System.out.println("In Finally");
			sc.close();
		}

}
}