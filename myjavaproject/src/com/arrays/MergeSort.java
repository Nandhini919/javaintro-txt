package com.arrays;

import java.util.Arrays;

//Merge Sort
//time complexity:o(n log n)
//space complexity:o(n)
//working based on divide and conquer and merge 



//6   5   4   3

//6   5      4   3  divide into half

//6     5      4        3     compare and merge

//5   6       3     4	     comparing 2 arrays least and highest

//3    4    5    6	
public class MergeSort {
	

	static void divide(int[] arr) {
		if (arr.length == 1) {
			return;
		}
		int[] left = new int[arr.length/2]; //2 -->00-->65
		int[] right = new int[arr.length - left.length];//2 -->00-->43
		
		int i;
		
		for(i = 0; i < left.length; i++) {
			left[i] = arr[i]; 
		}
		for(int j = 0; j < right.length; j++) {
			right[j] = arr[i++]; 
		}
		
		divide(left);
		System.out.println("Left side :"+ Arrays.toString(arr));
		
		divide(right);
		System.out.println("Right side :"+ Arrays.toString(arr));
		
		mergeSort(left, right,arr);
		}
		static void mergeSort(int[] l, int[] r,int[] arr) {
			int i = 0;
			int j = 0;
			int k = 0;
			//comparing and merge array
			while(i < l.length && j < r.length) {
				if(l[i] < r[j]) {
					arr[k++] = l[i++];
					}
				else {
					arr[k++] = r[j++];
				}
			}
			while (i < l.length) {
			arr[k++] = l[i++];	
			}
			while (j < r.length) {
				arr[k++] = r[j++];	
			}
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started!");
		
		int[] arr= {6, 5, 4, 3};
		divide(arr);
		
		System.out.println("After Sorting :"+ Arrays.toString(arr));
		System.out.println("Main Method Ended!");

	}

}
