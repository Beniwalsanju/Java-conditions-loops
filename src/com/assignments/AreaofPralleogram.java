package com.assignments;

import java.util.Scanner;

public class AreaofPralleogram {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = in.nextDouble();
        System.out.print("Enter Height: ");
        double height = in.nextDouble();

        double area = base * height;

        System.out.println("Area of pralleogram " + area);
    }
}
