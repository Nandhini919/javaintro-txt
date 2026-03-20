package com.logicalstatements01;

import java.util.Scanner;

public class TestLS18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double temp = sc.nextDouble();

        double fahrenheit = (temp * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);

        if (temp <= 0) {
            System.out.println("Advice: Freezing! Stay indoors!");
        } else if (temp <= 15) {
            System.out.println("Advice: Very Cold - Wear heavy jacket!");
        } else if (temp <= 25) {
            System.out.println("Advice: Pleasant weather - Enjoy outside!");
        } else if (temp <= 35) {
            System.out.println("Advice: Hot - Stay Hydrated!");
        } else {
            System.out.println("Advice: Extreme Heat - Avoid going out!");
        }
        sc.close();

	}

}
