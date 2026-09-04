package VariablesOperatorsIO;

/*
Given three numbers principal, rate, and time, return a two-element array [simpleInterest, compoundInterest].
The simple interest is the interest earned on the original principal only:\

simpleInterest = principal * rate * time / 100

The compound interest is the interest earned when each year's interest is added back to the balance,
so the next year earns interest on a larger amount. With interest compounded annually:

compoundInterest = principal * (1 + rate/100)^time - principal
Round each value to two decimal places.

Example 1:
Input: principal = 1000, rate = 5, time = 2

Output: [100,102.5]

Example 2:
Input: principal = 10000, rate = 12, time = 2

Output: [2400,2544]


Constraints:
principal > 0
rate >= 0
time >= 0 (integer number of years)

 */

import java.util.Arrays;

public class InterestCalculator1 {

    public static double[] interest(double principal, double rate, int time) {

        int years = time;

        // Simple Interest grows on the principal only
        double simpleInterest = principal * rate * years / 100.0;

        // Compound factor : multiply (1 + rate/100) once per year
        double growthFactor = 1.0;
        for (int year = 0; year < years; year++) {
            growthFactor = growthFactor * (1.0 + rate / 100.0);
        }
        double compoundInterest = principal * growthFactor - principal;

        return new double[]{round2(simpleInterest), round2(compoundInterest)};
    }

    private static double round2(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        double[] result = interest(1000, 5, 2);
        System.out.println(Arrays.toString(result));
    }

}
