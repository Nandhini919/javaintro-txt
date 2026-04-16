package com.arrays;

public class Arrays16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int even = 0, odd = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        
        System.out.println("Even count: " + even); // 4
        System.out.println("Odd count: " + odd);   // 4
    }
}