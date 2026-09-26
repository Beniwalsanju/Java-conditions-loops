package com.assignments;

import java.util.Scanner;

public class PerimeterOfCircle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = in.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter of circle " + perimeter );
    }
}
