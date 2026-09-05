package VariablesOperatorsIO;

/*
Given a non-negative integer totalSeconds, convert it into hours, minutes, and seconds.

Return the result as an array [hours, minutes, seconds], where hours is the number of whole hours,
minutes is the number of whole minutes left over after the hours, and seconds is the number of seconds left over after the minutes.

Example 1:
Input: totalSeconds = 3661

Output: [1,1,1]

Example 2:
Input: totalSeconds = 86399

Output: [23,59,59]

Constraints:
totalSeconds is a non-negative integer.

 */

import java.util.Arrays;

public class TimeConverter {

    public static int[] secondsToHMS(int totalSeconds) {

        // Whole hours, then carry the leftover forward
        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;

        // Split the leftover into minutes and seconds
        int minutes = remaining / 60;
        int seconds = remaining % 60;

        return new int[]{hours, minutes, seconds};
    }

    public static void main(String[] args) {
        int[] result = secondsToHMS(3661);
        System.out.println(Arrays.toString(result));
    }

}
