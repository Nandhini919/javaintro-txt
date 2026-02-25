package com.javaintroduction;
//we need to create object
public class Team {
	static Team t=new Team();
	
	 void method5() {
			System.out.println("method5 called!!");
		 }
	 void method3() {
			System.out.println("method3 called!!");
			t.method5();
		 }
	 void method4() {
		System.out.println("method4 called!!");
		
		
	}
	 static void method1() {
		System.out.println("method 1 called!!");
		t.method2();
	}
	 void method2() {
		System.out.println("method2 called!!");
		method3();
		method4();
	}

	public static void main(String [] args) {
		System.out.println("main method started");
		method1();
	}

}
