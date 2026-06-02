package com.exceptionhandlings;

public class TestDemoEx07 {

	public static void main(String[] args) {
		System.out.println("main Started");
		
		try {
			System.out.println("In try");
			System.out.println(10/2);
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException | ArithmeticException e) {
			System.err.println("in Catch"+e.getMessage());
			System.err.println("in Catch"+e.toString());
			System.out.println(e);
		}
		
		System.out.println("main Ended");
	}

}
