package ConditionalStatements;

/*
    Take marks as a input

    marks > 90 -> Excellent
    marks > 80 and marks <= 90  -> Very Good
    marks > 70 and marks <= 80  -> Good
    marks > 60 and marks <= 50  -> Average
    marks > 50 and marks <= 40 -> Below Average
    marks < 40 -> Fail

 */

import java.util.Scanner;

public class MarksGradingIfElseLadder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();

        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Very Good");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Good");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("Average");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("Below Average");
        } else {
            System.out.println("Fail");
        }

    }
}
