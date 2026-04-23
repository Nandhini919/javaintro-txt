package com.accessmodifiers01;

//Illegal modifier for the class TestAccessDemo1; 
//only public,<default>,strictfp, abstract & final are permitted for class

//The blocks scope is : class scope
//if your class is default, blocks scope is also default.
//if your class is public, blocks scope is also public.

public class TestAccessDemo1 {

	public TestAccessDemo1() {
		System.out.println("Constructor called ");
	}

	static {
		System.out.println("static block called from Test1");
	}

	{
		System.out.println("instance block called from Test1");
	}

	// protected data members
	protected int id4 = 1;
	protected String name4 = "Rahul";

	protected void method4() {
		System.out.println("method4 called ");
	}

//	 public data members
	public int id3 = 45;
	public String name3 = "Rohit";

	public void method3() {
		System.out.println("method3 called ");
	}

//	 default data members
	int id2 = 18;
	String name2 = "Kohli";

	void method2() {
		System.out.println("method2 called ");
	}

//	private data members 
	private int id1 = 7;
	private String name1 = "MSD";

	private void method1() {
		System.out.println("method1 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessDemo1 class");

		// Accessing the private data members within the class
		TestAccessDemo1 t1 = new TestAccessDemo1();
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method1();

		// Accessing the default data members within the class
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

		// Accessing the public data members within the class
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

		// Accessing the protected data members within the class
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

	}

	// A class inside a class is Inner class to work with Temporary requirements.
	private class TestIn1 {

	}
}
