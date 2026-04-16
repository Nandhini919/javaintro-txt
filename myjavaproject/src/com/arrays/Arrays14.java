package com.arrays;

public class Arrays14 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int found = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;
                break;
            }
        }
        
        if (found != -1)
            System.out.println("Found at index: " + found); // 2
        else
            System.out.println("Not found");
    }
}