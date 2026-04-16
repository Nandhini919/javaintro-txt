package com.arrays;

import java.util.Scanner;

public class ArrayRotation {
	public static void arrayReverse(int[] arr ,int start,int end) {
	
		int temp = 0;
		
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}

	public static void arrayRotation(int[] arr , int r) {
		int start = 0;
		int end = arr.length-1;
		arrayReverse(arr, start, end);
		arrayReverse(arr, start, r-1);
		arrayReverse(arr, r, end);
		
	}
	public static void main(String[] args) {	
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times you want to Rotate?");
		int r = sc.nextInt();
		
		System.out.println("Before Rotation:");
		for(int a:arr) {
			
			 System.out.print(a + " ");
        }
        System.out.println();

        arrayRotation(arr, r); 

        System.out.println("After Rotation:");
        for (int a : arr) { 
            System.out.print(a + " ");
        }
        System.out.println();

        sc.close();
}
	}

