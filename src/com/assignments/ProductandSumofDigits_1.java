/*
1.   Given an integer number n, return the difference between the product
   of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
        */

package com.assignments;

public class ProductandSumofDigits_1 {
    static void main(String[] args) {

        int input = 234;
        int sum = 0;
        int product = 1;

        while (input > 0){
            int digit = input % 10;
            sum = sum + digit;
            product = product * digit;

            input = input / 10;
        }

        int result = product - sum;

        System.out.println(result);



    }
}
