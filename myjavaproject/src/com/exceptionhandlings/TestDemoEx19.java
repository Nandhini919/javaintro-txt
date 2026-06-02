package com.exceptionhandlings;

import java.io.File;
import java.io.IOException;

public class TestDemoEx19 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main Method started");
		hello();
		
		System.out.println("Main Method ended");
	      	
	}

	 static void hello() throws IOException {
		 
				File f = new File("C:\\users\\Nandhuu\\hi.txt");
				
				f.createNewFile();
				System.out.println("hi method ended");

				
			}
		
	}


