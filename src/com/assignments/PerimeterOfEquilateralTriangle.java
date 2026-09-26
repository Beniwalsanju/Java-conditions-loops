package com.assignments;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = in.nextDouble();
        double perimeter = 3 * side;

        System.out.println("perimeter of equilateral triangle " + perimeter);

    }
}
