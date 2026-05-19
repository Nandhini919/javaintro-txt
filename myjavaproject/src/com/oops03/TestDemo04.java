package com.oops03;

public class TestDemo04 {

	public static void main(String[] args) {
		System.out.println("main method");
		TestDemo04 td = new TestDemo04();
		td.addition();
//		td.addition(10);
//		td.addition(10.5F);
		td.addition(10,20);
		

	}
	void addition(char c) {
		System.out.println("char -arg method called:");
	}
	void addition() {
		System.out.println("no -arg method called:");
	}
//	void addition(int a) {
//		System.out.println("one int -arg method called:"+a);
//	}
//	void addition(float a) {
//		System.out.println("float -arg method called:"+a);
//	}
//	void addition(double a) {
//		System.out.println("double -arg method called:"+a);
//	}
//	void addition(int a,int b) {
//		System.out.println("two -arg method called:"+(a + b));
//	}
//	void addition(int a,float b) {
//		System.out.println("int -float -arg method called:"+(a + b));
//	}
//	void addition(float a,float b) {
//		System.out.println("float-float -arg method called:"+(a + b));
//	}
	void addition(float a,int b) {
		System.out.println("float-int -arg method called:"+(a + b));
	}

}
