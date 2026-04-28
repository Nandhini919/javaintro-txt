package com.starpatterns;

public class StarPatterns26 {

    public static void main(String[] args) {

        int[] row = new int[5];

        // Outer loop: one iteration per each row
        for (int i = 0; i < 5; i++) {

           
            for (int j = i; j >= 1; j--) {
                row[j] = row[j] + row[j - 1];
            }
            row[0] = 1;   // First element is always 1

            
            for (int n = 0; n < 5 - i - 1; n++) {
                System.out.print(" ");
            }
            
            
         // Print the values of this row
            for (int j = 0; j <= i; j++) {
                System.out.print(row[j]);
                if (j < i) System.out.print(" ");
            }

            System.out.println();
        }
    }
}
