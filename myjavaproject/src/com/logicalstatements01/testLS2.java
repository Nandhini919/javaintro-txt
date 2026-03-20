package com.logicalstatements01;
import java.util.Scanner;

public class testLS2 {
	  public static void main(String[] args) {
			System.out.println("Main Started!!!!!!!!!");
			Scanner sc =new Scanner(System.in);
			System.out.println("Are you attending classes regularaly");
			boolean areYouAttendingClassesRegularly=sc.next().equalsIgnoreCase("yes");
			 System.out.println("Are you attending weekly tests? (yes/no)");
			boolean areYouAttendingWeeklyTest=sc.next().equalsIgnoreCase("yes");
			 System.out.println("Are you attending mock interviews? (yes/no)");
			boolean areYouAttendingMockInterview=sc.next().equalsIgnoreCase("yes");
			
			
			if(areYouAttendingClassesRegularly && areYouAttendingWeeklyTest && areYouAttendingMockInterview) {
			System.out.println("You will understand the classes properly");
			}
			else {
				System.out.println("nuvu Unodivi bhaai!");
			}
			sc.close();
			
	
	  }

}

