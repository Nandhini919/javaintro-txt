package com.exceptionhandlings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestDemoEx17 {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Main Started");

        File f = new File("C:\\Nandhuu\\cutie.txt");

        
        try (FileWriter fw = new FileWriter(f)) {
            fw.write("ID: 101  Name: Nandhu  Age: 20  Grade: A\n");
            fw.write("ID: 102  Name: Alice   Age: 21  Grade: B\n");
            fw.write("ID: 103  Name: Bob     Age: 19  Grade: A-\n");
            System.out.println("Data written to file!");
        } catch (IOException e) {
            System.err.println("In catch IOE (write)");
            System.err.println(e.getMessage());
        }

        
        try (FileReader fr = new FileReader(f)) {
            int i = fr.read();
            System.out.println("\n--- File Content ---");
            while (i != -1) {
                System.out.print((char) i);
                i = fr.read();
            }
        } catch (FileNotFoundException e) {
            System.err.println("In catch FNFE");
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("In catch IOE (read)");
            System.err.println(e.getMessage());
        }

        System.out.println("\nMain Ended");
    }
}