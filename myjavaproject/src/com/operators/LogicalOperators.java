package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		System.out.println("Main Started!!!!!!");
		
		int a=10;
		int b=20;
		int c=100;
		
		System.out.println(a == b && a == c);
		System.out.println(a > b && a == c);
		System.out.println(a == c && a < c);
		System.out.println(a < b && a != c);
		
		System.out.println(a == b || a == c);
		System.out.println(a != b || a != c);
		System.out.println(!(a == c));
		
		
		System.out.println("************************");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		System.out.println(!true);
		System.out.println(!false);
		
		
		

	}

}
