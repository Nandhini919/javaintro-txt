package com.arrays;

public class Arrays15 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        
        System.out.println("Second Largest: " + second); // 15
    }
}