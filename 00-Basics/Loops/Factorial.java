package Loops;

import java.util.Scanner;

/*
    problem :
    Find  the factorial of 'N'
 */
public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        System.out.println(ans);
    }
}
