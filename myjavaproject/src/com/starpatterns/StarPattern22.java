package com.starpatterns;

public class StarPattern22 {

	public static void main(String[] args) {
		char[] name = {'N', 'A', 'N', 'D', 'H', 'U'};
		 
        
 
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name[j] + " ");
            }
            System.out.println();
		}

	}

}
