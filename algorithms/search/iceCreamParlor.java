// Sunny and Johnny like to pool their money and go to the ice cream parlor. Johnny
// never buys the same flavor that Sunny does. The only other rule they have is that
// they spend all of their money.
//
// Given a list of prices for the flavors of ice cream, select the two that will
// cost all of the money they have.
//
// Complete the function icecreamParlor below to return an array containing the
// indexes of the prices of the two flavors they buy. The returned array must be sorted ascending.
//
// Input Format
// The first line contains an integer, t, denoting the number of trips to the ice
// cream parlor. The next t sets of lines each describe a visit. Each trip is described as follows:
//
// The integer m, the amount of money they have pooled.
// The integer n, the number of flavors offered at the time.
// n space-separated integers denoting the cost of each flavor: cost[c1,c2,…,cn].
//
// Note: The index within the cost array represents the flavor of the ice cream purchased.
//
//
// Output Format
// For each test case, print two space-separated integers denoting the indexes of the
// two flavors purchased, in ascending order.
//
// My Note: I did not include the constraints, but the constraints indicate there will
// always be a unique solution and that the cost array index to be returned is 1-based, not 0-based.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, int[] arr) {
        int[] result = new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j]==m){
                    System.err.println(arr[i] + " + " + arr[j] +" = " + m);
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }
        Arrays.sort(result);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int m = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int[] result = icecreamParlor(m, arr);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
