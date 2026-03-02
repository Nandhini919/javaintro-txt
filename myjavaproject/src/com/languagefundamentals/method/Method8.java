package com.languagefundamentals.method;

import java.util.Scanner;

public class Method8 {
	static String  showName(String name) {
		return name + "-INDIA";
	}
	static int getAge(int age) {
		return age;
	}
	static char getGender(char c) {
		return c;
	}

	public static void main(String[] args) {
		System.out.println("Main!!!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		System.out.println("Enter name:");
		sc.nextLine();
		String nm=sc.nextLine();
		
		System.out.println("Enter gender:");
		char gender=sc.next().charAt(0);//method chaining
		
		
		System.out.println(getGender(gender));
		System.out.println(showName(nm));
		System.out.println(getAge(age));
		
	}

}
