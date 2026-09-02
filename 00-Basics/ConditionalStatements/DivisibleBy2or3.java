package ConditionalStatements;

/*
    Problem :
    Read a number. If number is divisible by 2 or 3 print "divisible",
    otherwise print "not divisible"
 */

import java.util.Scanner;

public class DivisibleBy2or3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.print("divisible");
        }
        else {
            System.out.print("not divisible");
        }

    }
}
