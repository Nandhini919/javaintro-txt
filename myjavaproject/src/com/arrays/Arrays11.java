package com.arrays;

import java.util.*;

public class Arrays11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1, 4};
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        System.out.print(set + " ");
        
}
 


}
