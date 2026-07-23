package ConditionalStatements;
/*
Take a number n as input. Print "even" if the number is even else Print "odd".

Input Format:
The only line contains an integer n

Output Format:
Output according to problem statement.

Constraints:
1<= n <=10000

 */
import java.util.Scanner;

public class OddOrEvenIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
