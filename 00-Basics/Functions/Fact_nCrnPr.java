package Functions;

/*
Take as input

first number: n
second number: r
Print n!, npr & ncr separated by lines.

Input Format:
Integer representing n
Integer representing r

Output Format:
"Integer representing n!"
"Integer representing npr"
"Integer representing ncr"

 */

import java.util.Scanner;

public class Fact_nCrnPr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();

        int nFact = fact(n);
        int rFact = fact(r);
        int nMinusrFact = fact(n - r);

        int nPr = nFact / (nMinusrFact);
        int nCr = nFact / (rFact * nMinusrFact);

        System.out.println(nFact);
        System.out.println(nPr);
        System.out.println(nCr);
    }

    public static int fact(int x) {
        int ans = 1;

        for (int i = 1; i <= x; i++) {
            ans = ans * i;
        }

        return ans;
    }
}
