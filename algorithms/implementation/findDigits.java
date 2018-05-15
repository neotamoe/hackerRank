// An integer d is a divisor of an integer n if the remainder of n/d=0.
//
// Given an integer, for each digit that makes up the integer determine whether it
// is a divisor. Count the number of divisors occurring within the integer.
//
// Note: Each digit is considered to be unique, so each occurrence of the same digit
// should be counted (e.g. for n=111, 1 is a divisor of 111 each time it occurs so
// the answer is 3).
//
// Input Format:
// The first line is an integer, t, indicating the number of test cases.
// The t subsequent lines each contain an integer, n.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int temp = n;
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        do{
            myarray.add(temp % 10);
            temp /= 10;
        } while  (temp > 0);

        int divisorCount = 0;
        for(int i=0; i<myarray.size(); i++){
            if(myarray.get(i)==0){
                // do nothing
            } else if(n % myarray.get(i)==0){
                divisorCount++;
            }
        }
        return divisorCount;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
