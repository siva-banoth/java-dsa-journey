package ProblemSolving;
/*
You need to find the sum of first N natural numbers.

Input Format:
Each of the test cases have one line containing the number N.

Output Format:
Output a line containing the required sum.

Constraints:
1 ≤ N ≤ 10^18
 */

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int sum = (n * (n + 1)) / 2;

        System.out.println(sum);

    }


}
