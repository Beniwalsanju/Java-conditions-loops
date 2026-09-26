package com.assignments;

import java.util.Scanner;

public class FibonacciSeriesInJavaPrograms {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int next = b;
            b = b + a;
            a = next;
            count ++;
        }
        System.out.println(b);



    }
}
