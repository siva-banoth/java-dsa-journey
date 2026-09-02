package VariablesOperatorsIO;

/*
Given a temperature temp and a scale scale, convert the temperature to the other scale.
If scale is "C", then temp is in Celsius and you return the equivalent Fahrenheit value using F = temp * 9 / 5 + 32.
If scale is "F", then temp is in Fahrenheit and you return the equivalent Celsius value using C = (temp - 32) * 5 / 9.
Round the result to 2 decimal places.

Example 1:
Input: temp = 100, scale = "C"
Output: 212.00

Example 2:
Input: temp = 32, scale = "F"
Output: 0.00

Constraints:
temp is a real number within a reasonable range.
scale is either "C" or "F".

 */

public class TemperatureConverter {

    public static double convert(double temp, String scale) {

        double result;

        if (scale.equals("C")) {
            result = temp * 9.0 / 5.0 + 32;
        } else {
            result = (temp - 32) * 5.0 / 9.0;
        }

        return Math.round(result * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        double result = convert(100, "C");
        System.out.println(result);
    }

}
