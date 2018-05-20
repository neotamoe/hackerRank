// Marie invented a Time Machine and wants to test it by time-traveling to visit Russia
// on the Day of the Programmer (the 256th day of the year) during a year in the inclusive
// range from 1700 to 2700.
//
// From 1700 to 1917, Russia's official calendar was the Julian calendar; since 1919
// they used the Gregorian calendar system. The transition from the Julian to Gregorian 
// calendar system occurred in 1918, when the next day after January 31 was February 14.
// This means that in 1918, February 14th was the 32nd day of the year in Russia.
//
// In both calendar systems, February is the only month with a variable amount of days;
// it has 29 days during a leap year, and 28 days during all other years. In the Julian
// calendar, leap years are divisible by 4; in the Gregorian calendar, leap years are
// either of the following:
//
// Divisible by 400.
// Divisible by 4 and not divisible by 100.
// Given a year, y, find the date of the 256th day of that year according to the official
// Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd
// is the two-digit day, mm is the two-digit month, and yyyy is y.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static String solve(int year) {
        String date = "";
        if(year>1918){
            if((year%4==0 && year%100!=0) || year%400==0){
                // leap year
                date="12.09.";
            } else{
                //not leap year
                date="13.09.";
            }
        } else if (year==1918) {
            //not leap year
            date="26.09.";
        } else {
            if(year%4==0){
                // leap year
                date="12.09.";
            } else {
                // not leap year
                date="13.09.";
            }

        }
        return date + Integer.toString(year);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
