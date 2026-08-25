package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        while (n != 0) {

            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
