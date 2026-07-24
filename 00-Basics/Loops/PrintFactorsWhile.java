package Loops;

/*
Problem :
Take as input a number n. Print factors of n

 */

import java.util.Scanner;

public class PrintFactorsWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }


    }
}
