package VariablesOperatorsIO;

/*
 Problem : Given two numbers a and b, swap their values and return the result as a two-element array [b, a].
 Example :
           Input: a  = 5, b = 7
           Output: [7,5]

 Constraints:
    Both a and b fit in the 32-bit signed integer range: -2^31 <= a, b <= 2^31 - 1.
    The values may be negative, zero, or equal to each other.
 */

import java.util.Arrays;

public class SwapTwoNumbers1 {

    public static int[] swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int[] result = swap(a, b);
        System.out.println(Arrays.toString(result));

    }

}
