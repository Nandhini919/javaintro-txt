package com.exceptionhandlings;

import java.io.File;
import java.io.IOException;

public class TestDemoEx15 {

	public static void main(String[] args)throws IOException {
		System.out.println("Main Started");
		File f =  new File("C:\\Nandhuu\\text.txt\\cutie.txt");
		f.createNewFile();
		
		
		System.out.println("Main Ended");
	}

}
  