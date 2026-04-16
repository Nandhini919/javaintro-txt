package com.starpatterns;

public class StarPattern18 {

	public static void main(String[] args) {
		int star=1;
		int space=5;
		for(int i = 1;i <= 5;i++) {
			for(int j = 1;j <= space;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= star;k++) {
				System.out.print("*");
				}
			star = star + 2;
			space  = space - 1;
			System.out.println();
		}
	}

}
