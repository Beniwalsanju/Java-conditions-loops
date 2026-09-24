package com.assignments;

import java.util.Scanner;

public class AreaofIsoscelestriangle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = in.nextDouble();
        System.out.print("Enter height: ");
        double height = in.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of Isosceles triangle " + area);
    }
}
