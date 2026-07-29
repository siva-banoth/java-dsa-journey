package Functions;

import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int result = fact(n);
        System.out.println(result);


    }

    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;

    }

}
