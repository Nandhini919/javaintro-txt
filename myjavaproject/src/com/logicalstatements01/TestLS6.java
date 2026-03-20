package com.logicalstatements01;

import java.util.Scanner;

public class TestLS6 {

	public static void main(String[] args) {
		System.out.println("main method started ");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter A value : ");
				int a = sc.nextInt();// 100

				System.out.println("Enter B value : ");
				int b = sc.nextInt();// 50

				if (a > b) {
					System.out.println("A is Big : " + a);
				} else {
					System.out.println("B is Big : " + b);
				}
				sc.close();

			}

	}


