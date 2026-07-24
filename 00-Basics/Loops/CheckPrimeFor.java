package Loops;

import java.util.Scanner;

/*
Take as input a number n. Determine whether it is prime or not. If it is prime,
print "Prime" otherwise print "Not Prime".

Input Format:
Integer

Output Format:
String

Constraints:
n <= 10 ^ 9
 */
public class CheckPrimeFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
