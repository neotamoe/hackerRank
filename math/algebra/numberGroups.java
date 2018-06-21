// The positive odd numbers are sorted in ascending order as 1,3,5,7,9,11,13,15,17,19…,
// and grouped as (1),(3,5),(7,9,11),(13,15,17,19),… and so on.
//
// Thus, the first group is (1), the second group is (3,5), the third group is
// (7,9,11), etc. In general, the kth group contains the next k elements of the sequence.
//
// Given k, find the sum of the elements of the  group.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sumOfGroup function below.
    static long sumOfGroup(int k) {
        // Return the sum of the elements of the k'th group.
        BigInteger median = (BigInteger.valueOf(k)).multiply(BigInteger.valueOf(k));
        System.err.println("median: " + median);
        BigInteger sum = BigInteger.ZERO;
        if(k%2!=0){
            // if k is odd
            sum = median;
            long row = (k-1)/2;
            while(row > 0){
                sum = sum.add(median.subtract(BigInteger.valueOf(2)));
                median = median.subtract(BigInteger.valueOf(2));
                row--;
            }
            median = (BigInteger.valueOf(k)).multiply(BigInteger.valueOf(k));
            row = (k-1)/2;
            while(row > 0){
                sum = sum.add(median.add(BigInteger.valueOf(2)));
                median = median.add(BigInteger.valueOf(2));
                row--;
            }
        } else {
            // if k is even
            long row = (k/2);
            BigInteger upper = ((BigInteger.valueOf(k)).multiply(BigInteger.valueOf(k))).add(BigInteger.ONE);
            BigInteger lower = ((BigInteger.valueOf(k)).multiply(BigInteger.valueOf(k))).subtract(BigInteger.ONE);

            while(row>0){
                sum = sum.add(lower);
                lower = lower.subtract(BigInteger.valueOf(2));
                sum = sum.add(upper);
                upper = upper.add(BigInteger.valueOf(2));
                row--;
            }
        }
        return sum.longValue();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long answer = sumOfGroup(k);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
