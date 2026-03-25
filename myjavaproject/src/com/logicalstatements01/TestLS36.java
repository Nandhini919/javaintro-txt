package com.logicalstatements01;

import java.util.Scanner;

public class TestLS36 {

	public static void main(String[] args) {
		System.out.println("Main!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Signal Light Color:");
		String light =sc.next();
		switch(light) {
		    case "RED"    -> System.out.println("Stop the vehicle!");
		    case "YELLOW" -> System.out.println("Get ready to move!");
		    case "GREEN"  -> System.out.println("Go! Drive safely!");
		    default       -> System.out.println("Invalid signal!");
		}

	}

}
