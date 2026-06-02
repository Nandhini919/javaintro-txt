package com.exceptionhandlings;

import java.util.Scanner;

public class ArrayExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Main Started!!!");
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  index (0 to 4) : ");
        int index = sc.nextInt();

        System.out.print("Enter  a number to divide : ");
        int num = sc.nextInt();

        
        try {
        	
        	int result = arr[index] / num;
            System.out.println("Result : " + result);

        }catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid index! Use 0 to 4 only."+e);
        }catch (ArithmeticException e) {
            System.err.println(" Divide by zero!"+e);
        }finally {
            
            sc.close();
        }
        System.out.println("Main Ended");
    }
}