package com.oops03;

import java.util.Scanner;

// WAP to find area of Triangle, Square, Rectangle, Circle

public class TestDemo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // ---- Triangle ----
        System.out.println("Enter Base:");
        float base = sc.nextFloat();          

        System.out.println("Enter Height:");
        double height = sc.nextDouble();

        TestDemo03 td = new TestDemo03();
        System.out.println("Area of Triangle = " + td.findArea(base, height));

        // ---- Square ----
        System.out.println("Enter Side:");
        double side = sc.nextDouble();
        System.out.println("Area of Square   = " + td.findArea(side));

        // ---- Rectangle ----             
        System.out.println("Enter Length:");
        double length = sc.nextDouble();
        System.out.println("Enter Breadth:");
        double breadth = sc.nextDouble();
        System.out.println("Area of Rectangle = " + td.findArea(length, height, breadth));

        // ---- Circle ----
        System.out.println("Enter Radius:");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle   = " + td.findArea(radius));

        sc.close();
    }

    // Rectangle
    double findArea(double l, double h, double b) {
        return l * b;                       
    }

    // Triangle
    double findArea(float b, double h) {
        return 0.5 * b * h;
    }

    // Square
    double findArea(double side) {
        return side * side;
    }

    // Circle
    double findArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }
}
