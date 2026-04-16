package com.logicalstatements01;

import java.util.Scanner;

public class TestLS34 {
	
	static String getDayInfo(String day) {
		switch(day) {
		case "Monday" :
			return "Lazy Day" ;
		case "Tuesday","Wednesday","Thursday":
			return "Normal Days";
		case "Friday":	
			return "Weekend Mode Started";
		case "Saturday","Sunday":
			return "Weekend with Holidays";
	   default : 
			return "Entered day is invalid";
		}
	}

	public static void main(String[] args) {
		System.out.println("Main!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Day:");
		String day=sc.next();
		getDayInfo(day);

	}

}

