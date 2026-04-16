package com.arrays;

public class Arrays12 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {5, 10}
        };
        
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }
        
        System.out.print(total + " ");
        
    }
}