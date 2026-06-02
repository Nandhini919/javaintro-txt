package com.exceptionhandlings;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class TestDemoEx16 {

    public static void main(String[] args) throws InterruptedException, IOException, IOException {
        System.out.println("Main Started");

        File f = new File("C:\\Nandhuu\\hello.txt");

        

        try (FileReader fr = new FileReader(f)) {
            int i = fr.read();
            while (i != -1) {
                System.out.println((char) i);
                i = fr.read();
                Thread.sleep(500);
            }
        } 
        System.out.println("Main Ended");
    }
}