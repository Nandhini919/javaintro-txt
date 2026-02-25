package com.javaintroduction;

public class Test1 {

	public static void show() {
		System.out.println("Thread.currentThread()");
		System.out.println("show");
		System.out.println("show");
		System.out.println("show");
		
	}
	 void main() {
		System.out.println("main");
		System.out.println("Thread.currentThread()");
		Test1 t=new Test1();
		t.hello();
		//call static method
		show();
		System.out.println("main");
		
	}
	public void hello() {
		System.out.println("Thread.currentThread()");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
	}

}
