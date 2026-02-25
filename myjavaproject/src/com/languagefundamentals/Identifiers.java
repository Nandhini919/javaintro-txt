package com.languagefundamentals;

public class Identifiers {
	static String college_name = "DVR";
	static int college_id = 060;

	int student_id=1;
	String student_name="nandhu";

	public static void main(String[] args) {
		System.out.println("main method started!");
		Identifiers s1 = new Identifiers();
		
		System.out.println("s1.student_id");//0
		System.out.println("s1.student_name");//null
		s1.show$();

	}

	void show$() {
		System.out.println("show method started!");
	}

}
                                  