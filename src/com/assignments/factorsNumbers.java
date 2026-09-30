/*
Input a number and print all the factors of that number (use loops).

 */
package com.assignments;

import java.util.Scanner;

public class factorsNumbers {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
