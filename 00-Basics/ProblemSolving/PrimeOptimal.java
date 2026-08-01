package ProblemSolving;
/*
You need to find whether a given input number is prime or not.

Input Format:
Each of the test cases have one line containing the number N for which primality needs to be checked.

Output Format:
Output a line containing a string "Prime Number" or "Not a Prime" for Yes and No respectively.

Constraints:
1 ≤ N ≤ 10^12
 */

import java.util.Scanner;

public class PrimeOptimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime");
        }

    }

}
