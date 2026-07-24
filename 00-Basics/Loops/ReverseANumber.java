package Loops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }

        System.out.println(rev);

    }
}
