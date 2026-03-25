package com.logicalstatements01;

import java.util.Scanner;

public class TestLS39 {

	public static void main(String[] args) {
		System.out.println("Main!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the grade:");
		char grade = sc.next().charAt(0);
		switch(grade) {
		    case 'A' -> System.out.println("Excellent!   - 90 to 100");
		    case 'B' -> System.out.println("Good!        - 80 to 89");
		    case 'C' -> System.out.println("Average!     - 70 to 79");
		    case 'D' -> System.out.println("Below Avg!   - 60 to 69");
		    case 'F' -> System.out.println("Fail!        - Below 60");
		    default  -> System.out.println("Invalid grade entered!");
		}

	}

}
