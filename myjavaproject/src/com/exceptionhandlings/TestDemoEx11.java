package com.exceptionhandlings;

public class TestDemoEx11 {


	public static void main(String[] args) {
System.out.println("Main started");
		
		try {
			System.out.println("In try1");
			
		try {
			System.out.println("In try2");
			System.out.println(10/0);
			}catch(Exception e) {
			System.err.println("In catch 2");
			}
		System.out.println(10/0);
		System.out.println("Hellooooo");
	}catch(Exception e) {
		
		}try {
			System.out.println("In try3");
			System.out.println(10/0);
		}catch(Exception e1) {
				System.err.println("In catch 3");
				}
			System.err.println("In catch 1");
			}

}

