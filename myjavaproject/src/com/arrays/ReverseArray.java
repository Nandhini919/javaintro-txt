package com.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16};

        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            String rev = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            System.out.print(Integer.parseInt(rev));
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.print("}");
    }
}