// Animesh has N empty candy jars, numbered from 1 to N, with infinite capacity. He
// performs M operations. Each operation is described by 3 integers, a, b, and k. Here,
// a and b are indices of the jars, and k is the number of candies to be added inside
// each jar whose index lies between a and b (both inclusive). Can you tell the average
// number of candies after M operations?
//
// Input Format
// The first line contains two integers, N and M, separated by a single space.
// M lines follow; each of them contains three integers, a, b, and k, separated by spaces.
//
// Output Format
// A single line containing the average number of candies across N jars, rounded down to the nearest integer.
//
// Note: Rounded down means finding the greatest integer which is less than or equal to the
// given number. E.g. 13.65 and 13.23 are rounded down to 13, while 12.98 is rounded down to 12.


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.math.BigInteger.*;

public class Solution {

    // Complete the solve function below.
    static long solve(int n, int[][] operations) {
        long sum = 0;
        for(int i=0; i<operations.length; i++){
            sum = sum + ((operations[i][1]-(operations[i][0]))+1) * (long)operations[i][2];
            System.err.println(sum);
        }
        return (long)Math.floor(sum/n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] operations = new int[m][3];

        for (int operationsRowItr = 0; operationsRowItr < m; operationsRowItr++) {
            String[] operationsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int operationsColumnItr = 0; operationsColumnItr < 3; operationsColumnItr++) {
                int operationsItem = Integer.parseInt(operationsRowItems[operationsColumnItr]);
                operations[operationsRowItr][operationsColumnItr] = operationsItem;
            }
        }

        long result = solve(n, operations);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
