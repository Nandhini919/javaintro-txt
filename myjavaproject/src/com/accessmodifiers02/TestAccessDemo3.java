package com.accessmodifiers02;

import com.accessmodifiers01.TestAccessDemo1;

//TestAccessDemo1 --> Super class 
//TestAccessDemo3 --> sub class 
public class TestAccessDemo3 extends TestAccessDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessDemo3 class");

		// Even though TestAccessDemo1 is public, Whatever the data we are accessing is
		// default,
		// so default data we cannot access outside of the packages.
		TestAccessDemo1 t1 = new TestAccessDemo1();

		// Accessing the public data members outside of the packages
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

//		 Accessing the protected data members outside of the packages not possible directly.
//		System.out.println(t1.id4);
//		System.out.println(t1.name4);
//		t1.method4();

//		the protected data we can access within the class, 
//		package and outside of the packages of sub classes +
//		with sub class object reference only but not with the super class object reference.
		TestAccessDemo3 t3 = new TestAccessDemo3();
		System.out.println(t3.id4);
		System.out.println(t3.name4);
		t3.method4();

//		 System.out.println(t1.id2);
//		 System.out.println(t1.name2);
//		 t1.method2();

	}

}