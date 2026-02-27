package com.languagefundamentals.method;

public class Method5 {

	public static void main() {
		System.out.println("Main Method Started");
		greet("Good Morning",10);
		addition(100,500);
		subtraction(908,590);

	}
	static void greet(String wish,int time) {
		System.out.println("Greeting :" + wish);
		System.out.println("Time :" +time);
	}
	static void addition(int a,int b) {
		System.out.println("In addition");
		System.out.println(a + b);
	}
	static void subtraction(float f,double d) {
		System.out.println("In subtraction");
		System.out.println(f - d);
	}

}
