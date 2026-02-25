package com.javaintroduction;
class A{
	B b;
	//@override
	protected void finalize() throws Throwable{
		System.out.println("main method started!!");
	}

	
}
class B{
	A a;
	//@override
	protected void finalize() throws Throwable{
		System.out.println("main method started!!");
	}
}

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		A obj1=new A();
		B obj2=new B();
		obj1.b=obj2;
		obj2.a=obj1;
		
		System.gc();
		System.out.println("!!");
		

	}

}
