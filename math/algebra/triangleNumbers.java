// Given a triangle of numbers where each number is equal to the sum of the three
// numbers on top of it, find the first even number in a row.
//
// Explanatory Note: The vertex of the triangle (at the top) is 1. The structure of
// the triangle is shown below. Each number is equal to the sum of the numbers at the
// following positions: Position X: immediately above it. Position Y: to the immediate 
// left of X. Position Z: to the immediate right of X. If there are no numbers at
// positions X, Y, or Z, then assume those positions are occupied by a zero (0). This
// can occur for positions at the edge.
//
// Input Format
// First line contains a number T (number of test cases).
// Each of the next T lines contain a number N (the row number, assuming that the
// top vertex of the triangle is Row 1).
//
// Output Format
// For each test case, display an integer that denotes the position of the first even number.
// Note: Assume that the left most number in a row is Position 1.
// If there is no even number in a row, print -1.

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int solve(int n) {
        if(n==1 || n==2){
            return -1;
        } else if(n==6 || (n-6)%4==0){
            return 4;
        } else if(n%2!=0) {
            return 2;
        } else {
            return 3;
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

            int result = solve(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
