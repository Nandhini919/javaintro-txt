package com.accessmodifiers01;

//Note : In Java, the default package is java.lang & the Current package, 
//So we no need to import within the same package classes.

public class TestAccessDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessDemo2 class");

		TestAccessDemo1 t1 = new TestAccessDemo1();

//		 Accessing the default data members within the class & also outside of the classes.
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

		// Accessing the public data members within package
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

		// Accessing the protected data members within package
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

//		Whenever the data members are private, we cannot access outside of the classes.
//		We can access only within the class.
//		The field TestAccessDemo1.id1 is not visible
//		System.out.println(t1.id1);
//		The field TestAccessDemo1.name1 is not visible
//		System.out.println(t1.name1);
//		The method method1() from the type TestAccessDemo1 is not visible
//		t1.method1();

	}

}