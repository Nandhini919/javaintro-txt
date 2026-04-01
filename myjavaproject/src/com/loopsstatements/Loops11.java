package com.loopsstatements;

import java.util.Scanner;

public class Loops11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many values to print: ");
        int n = sc.nextInt();

        int n1 = 0, n2 = 1, n3=0;

        System.out.print(n1 +" " +n2);
        for (int i = 1; i < n-2; i++) {
            n3=n1+n2;
            System.out.print(" "+n3);
           n1=n2;
           n2=n3;
        }
        System.out.println("Main ended");
        sc.close();
    
	}
	


	}


