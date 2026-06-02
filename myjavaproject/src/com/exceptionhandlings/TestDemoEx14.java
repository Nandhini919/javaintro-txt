package com.exceptionhandlings;

public class TestDemoEx14 {

	public static void main(String[] args) {
		System.out.println("Main started");
		System.out.println(add());
		System.out.println("Main ended");
	}
	static int add(){
		try {
			System.out.println(10/0);
			return 100;
		}catch(Exception e) {
			return 200;
			
		}
	}

}
