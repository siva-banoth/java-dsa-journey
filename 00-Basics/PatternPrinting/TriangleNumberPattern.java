package PatternPrinting;
/*
Take as input a number n, the number of rows
Print the following pattern

1
2	3
4	5	6
7	8	9	10
for n = 4.

Input Format:
Integer

Constraints:
1 <= n <= 25
 */
import java.util.Scanner;

public class TriangleNumberPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int nst = 1;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(count + " ");
                count++;
            }
            nst++;
            System.out.println();
        }

    }
}
