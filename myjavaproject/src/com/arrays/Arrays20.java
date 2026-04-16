package com.arrays;

public class Arrays20 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum : " + sum);
        }
    }
}