package PatternPrinting;
/*
Take as input a number n, the number of rows
Print the following pattern

*** ***
**   **
*     *
**   **
*** ***

1 <= n <= 25 and is odd


 */


import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int nsp = 1;
        int nst = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");

            }
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= nst; l++) {
                System.out.print("*");
            }

            if (i <= n / 2) {
                nst = nst - 1;
                nsp = nsp + 2;
            } else {
                nst = nst + 1;
                nsp = nsp - 2;
            }

            System.out.println();
        }

    }
}
