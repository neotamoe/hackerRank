// Manipulating numbers is at the core of a programmer’s job. To test how well you
// know their properties, you are asked to solve the following problem.
//
// You are given n non-negative integers a1,a2,…,an. You want to know whether it’s
// possible to construct a new integer using all the digits of these numbers such 
// that it would be divisible by 3. You can reorder the digits as you want. The resulting
// number can contain leading zeros.
//
// Complete the function canConstruct which takes an integer array as input and
// return “Yes” or “No” based on whether or not the required integer can be formed.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the canConstruct function below.
    static String canConstruct(int[] a) {
        // Return "Yes" or "No" denoting whether you can construct the required number.
        long sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        if(sum%3==0){
            return "Yes";
        } else {
            return "No";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            String result = canConstruct(a);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
