/*
2.   Given an integer number n, return the difference between the product
   of its digits and the sum of its digits.
Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21

 */
package com.assignments;

public class ProductandSumofDigits_2 {
    static void main(String[] args) {

        int n = 4421;
        int sum = 0;
        int product = 1;

        while (n > 0){
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;

            n = n/10;
        }

        int result = product - sum;
        System.out.println(result);

        int a = 4421;



    }
}
