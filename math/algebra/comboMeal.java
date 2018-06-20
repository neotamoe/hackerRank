// A fast-food chain menu is selling a burger, a can of soda, and a combo meal containing
// a burger and a can of soda, at prices known to you.
//
// They have chosen the selling price for each item by first determining the total cost
// of making the individual items and then adding a fixed value to it, representing their 
// profit. Assume that the cost of making a regular burger is fixed and the cost of making
// a regular soda is fixed.
//
// Given the price of a burger, a can of soda and a combo meal on the menu, your task
// is to compute the fixed profit.
//
// Complete the function named profit which takes in three integers denoting selling
// price of a burger, a can of soda and a combo meal respectively, and returns an
// integer denoting the fixed profit.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the profit function below.
    static int profit(int b, int s, int c) {
        // Return the fixed profit.
        return b + s - c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] bsc = scanner.nextLine().split(" ");

            int b = Integer.parseInt(bsc[0]);

            int s = Integer.parseInt(bsc[1]);

            int c = Integer.parseInt(bsc[2]);

            int result = profit(b, s, c);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
