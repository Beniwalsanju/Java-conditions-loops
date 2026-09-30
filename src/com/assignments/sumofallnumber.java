/*
Take integer inputs till the user enters 0 and print the sum
of all numbers (HINT: while loop)
 */
package com.assignments;

import java.util.Scanner;

public class sumofallnumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int sum = 0;
        int n = in.nextInt();

        while(n != 0){
            sum = sum + n;

            n = in.nextInt();

        }
        System.out.println("sum " + sum);
    }
}
