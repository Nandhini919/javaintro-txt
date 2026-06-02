package com.exceptionhandlings;

public class TestDemoEx13 {
	public static void main(String[] args) {
	System.out.println("main started");
	try {
		System.out.println("In try");
	}catch(Exception e) {
		System.out.println("In Catch");
	}finally {
		System.out.println("In Finallyy");
	}
	
	System.out.println("main Ended");

}
}
