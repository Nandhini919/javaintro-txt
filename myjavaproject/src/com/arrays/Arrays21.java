package com.arrays;

public class Arrays21 {

	public static void main(String[] args) {
		int[][] arr = {{ 1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int n = 3, primarySum = 0, secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];             // Primary: row == column
            secondarySum += arr[i][n - 1 - i];   // Secondary: row + column == n-1
        }

        System.out.println("Primary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
		
	}

}
