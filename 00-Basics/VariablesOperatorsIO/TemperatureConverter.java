package VariablesOperatorsIO;

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
