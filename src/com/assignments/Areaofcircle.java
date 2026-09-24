package com.assignments;

import java.util.Scanner;

public class Areaofcircle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Radius:");
        double radius = in.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area of circle = " + area);


    }
}
