package Functions;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class SumTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int result = sum(a, b);
        System.out.println(result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
