package PatternPrinting;
/*

Take as input a number n, the number of rows
Print the following pattern

    1
  2 3 2
3 4 5 4 3
  2 3 2
    1

 */


import java.util.Scanner;

public class DiamondNumberPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        int n = input.nextInt();

        int nsp = n / 2;
        int nst = 1;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print(" ");
            }

            if (i <= n / 2) {
                count = i;
            } else {
                count = n - i + 1;
            }
            for (int k = 0; k < nst; k++) {
                System.out.print(count);

                if (k < nst / 2) {
                    count++;
                } else {
                    count--;
                }
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
