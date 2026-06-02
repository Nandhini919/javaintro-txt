package com.exceptionhandlings;

public class TestDemoEx03 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String s = "Nandhu";
		System.out.println(s.length());
		
		String s1 = "";
		System.out.println(s1.length());
		
		String s2 = "null";
		System.out.println(s2.length());
		try {
			System.out.println("in try");
			String s3 = "null";
			System.out.println(s3.length());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
