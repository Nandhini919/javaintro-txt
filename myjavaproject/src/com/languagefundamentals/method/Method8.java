package com.languagefundamentals.method;

import java.util.Scanner;

public class Method8 {
	static String  showName(String name) {
		return name;
	}

	public static void main(String[] args) {
		System.out.println("Main!!!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		System.out.println("Enter name:");
		String nm=sc.nextLine();
		
		System.out.println(showName(nm));
		System.out.println(getAge(age));
		
	}

}
