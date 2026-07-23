package ConditionalStatements;

import java.util.Scanner;

/*
Problem:
Read a person's age. If the age is 18 or above, print "You are Eligible".
Otherwise, do nothing.
*/

public class DrivingLicenceEligibility {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();

        if (age>=18) {
            System.out.println("You are Eligible");
        }

    }

}
