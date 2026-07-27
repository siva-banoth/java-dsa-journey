package PatternPrinting;

import java.util.Scanner;

/*

Take as input a number n, the number of rows
Print the following pattern

  *
 ***
*****
 ***
  *

for n = 5.

Input Format: Integer
Constraints : 1<=n<=25 and is and odd number

 */

public class DiamondPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int nst = 1;
        int nsp = n / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }

            if (i <= n / 2) {
                nst = nst + 2;
                nsp = nsp - 1;
            } else {
                nst = nst - 2;
                nsp = nsp + 1;
            }

            System.out.println();
        }

    }
}
