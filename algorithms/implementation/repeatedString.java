// Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.
//
// Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string.
//
// For example, if the string s='abcac' and n=10, the substring we consider is 'abcacabcac',
// the first 10 characters of her infinite string. There are 4 occurrences of a in the substring.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0;
        if(s.equals("a")){
            count = n;
        } else{
            String newString = s;
            long howManyTimesInOriginal = newString.chars().filter(ch -> ch == 'a').count();
            double howManyTimes = Math.floor(n/s.length());
            long calculatedHowManyTimes = howManyTimesInOriginal * (long)howManyTimes;
            long extra = n - (long)howManyTimes*(long)s.length();
            if(extra<=s.length()){
                String finalChunk = s.substring(0,(int)extra);
                long extraCount = finalChunk.chars().filter(ch -> ch == 'a').count();
                count = calculatedHowManyTimes + extraCount;
            } else {
                String finalChunk = s.substring(0);
                long extraCount = finalChunk.chars().filter(ch -> ch == 'a').count();
                count = calculatedHowManyTimes + extraCount;
            }
        }
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
