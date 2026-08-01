package ProblemSolving;
/*
You need to find the number of factors of the given required input.

Input Format:
Each of the test cases have one line containing the number N for which number of factors needs to be counted.

Output Format:
Output a line containing the number of factors.

Constraints:
1 ≤ N ≤ 10^12


 */

import java.util.Scanner;

public class FactorialOptimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int count = 1;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n == n / i) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }
        }
        System.out.println(count);

    }
}
