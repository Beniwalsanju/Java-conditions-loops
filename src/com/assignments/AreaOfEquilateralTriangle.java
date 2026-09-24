package com.assignments;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter side: ");
        double side = in.nextDouble();

        double area = Math.sqrt(3)/4 * side * side;

        System.out.println("Area of equilateral triangle " + area);
    }
}
