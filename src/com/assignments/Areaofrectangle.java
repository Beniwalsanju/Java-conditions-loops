package com.assignments;

import java.util.Scanner;

public class Areaofrectangle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = in.nextDouble();

        System.out.print("Enter width: ");
        double width = in.nextDouble();

        double area = length * width;

        System.out.println("Area of rectangle" + area);
    }
}
