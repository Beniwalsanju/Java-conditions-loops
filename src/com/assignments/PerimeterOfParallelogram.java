package com.assignments;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = in.nextDouble();
        System.out.print("Enter breath: ");
        double breath = in.nextDouble();

        double perimeter = 2 * (side + breath);

        System.out.println("perimeter of parallelogram " + perimeter);


    }
}
