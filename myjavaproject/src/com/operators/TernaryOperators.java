package com.operators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		System.out.println("*****************");
		
		int x=10;
		int y=20;
		int z=5;
		int max1=(x > y) ? (x > z ? x : z)	:(y > z ? y : z);
		System.out.println("Max1 value is:"+max1);
		
		
		
		int a=10;
		int b=20;
		int max =(a > b) ? a : b;
		System.out.println("Max value:"+max);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age ?");
		
		int age =sc.nextInt();		
	}

}
