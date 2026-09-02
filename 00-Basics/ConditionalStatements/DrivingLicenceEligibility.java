package ConditionalStatements;
/*
Take a number n as input representing age of a person. Print "eligible" if the person is Eligible
for driving license else Print "not eligible".

Input Format:
The only line contains an integer n

Constraints:
1<= n <=100
 */

import java.util.Scanner;

public class DrivingLicenceEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n>=18) {
            System.out.println("eligible");
        }
        else {
            System.out.println("not eligible");
        }

    }
}
