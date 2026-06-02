package com.exceptionhandlings;

public class TsetDemoEx08 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		try {
			System.out.println("In Try");
			System.out.println(10/0);//AE
			System.out.println(10.5/0);//Infinity
			System.out.println(10.5/0.0);//Infinity
			System.out.println(0.0/0.0);//NAN
     		System.out.println(0/0.0);//NAN
			
		}catch(Exception e) {
			System.err.println("In Catch");
			System.err.println(e.getMessage());
			System.err.println(e.toString());
			System.out.println(e);
		}

	}

}
