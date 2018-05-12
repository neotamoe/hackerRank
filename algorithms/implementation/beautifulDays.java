// Lily likes to play games with integers. She has created a new game where she determines
// the difference between a number and its reverse. For instance, given the number 12, its reverse is 21.
// Their difference is 9. The number 120 reversed is 21, and their difference is 99.
// 
// She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.
//
// Given a range of numbered days, [i...j] and a number k, determine the number of days
// in the range that are beautiful. Beautiful numbers are defined as numbers where |i-j| is
// evenly divisible by k. If a day's value is a beautiful number, it is a beautiful day.
// Print the number of beautiful days in the range.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulDays(int i, int j, int k) {
        // Complete this function

        int beautifulCount = 0;
        int originalM;
        int reverseM;
        String mString;
        int start = i;
        for(int m = start; m<=j; m++){
            originalM = m;
            mString = Integer.toString(originalM);
            StringBuilder sb = new StringBuilder(mString);
            mString = sb.reverse().toString();
            reverseM = Integer.parseInt(mString);

            if(Math.abs(originalM - reverseM) % k == 0){
                beautifulCount++;
            }
        }
        return beautifulCount;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
