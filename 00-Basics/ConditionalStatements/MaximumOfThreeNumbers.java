package ConditionalStatements;
/*

Problem :
Take three numbers a,b and c as input. Print the max out of 3 Integers.

Input Format:
The first line contains integer a.
The second line contains integer b.
The third line contains integer c.

Output Format:
Output according to problem statement.

Constraints:
1<= a,b and c <=10000
 */

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
