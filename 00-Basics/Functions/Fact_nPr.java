package Functions;

import java.util.Scanner;

public class Fact_nPr {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();

        int nFact = fact(n);
        int rFact = fact(r);
        int nmrFact = fact(n-r);

        int nPr  =  nFact/nmrFact;
        System.out.println(nPr);
    }

    public static int fact(int x){
        int ans = 1;

        for(int i=1; i<=x; i++){
            ans = ans * i;
        }

        return ans;
    }

}
