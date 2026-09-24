package com.assignments;

import java.util.Scanner;

public class AreaOfRhombus {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter digonal1: ");
        double digonal1 = in.nextDouble();
        System.out.print("Enter digonal2: ");
        double digonal2 = in.nextDouble();

        double area = 0.5 * digonal1 * digonal2;

        System.out.println("Area of Rhombus " + area);
    }
}

