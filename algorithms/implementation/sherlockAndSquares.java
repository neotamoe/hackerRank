// Watson likes to challenge Sherlock's math ability. He will provide a starting and ending
// value describing a range of integers. Sherlock must determine the number of square
// integers within that range, inclusive of the endpoints.
//
// Note: A square integer is an integer which is the square of an integer, e.g. 1,4,9,16,25.
// Input Format
//
// The first line contains T, the number of test cases.
// Each of the next T lines contains two space-separated integers denoting A and B, the
// starting and ending integers in the ranges.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the squares function below.
    static int squares(int a, int b) {
        // this solution was provided in discussion as a math solution.
        int count = (int)(Math.floor(Math.sqrt(b))- Math.ceil(Math.sqrt(a)))+1;
        // this was my solution; it works, but it times out on some things as it is brute force solution.
        // int count = 0;
        // for(int i=a; i<=b; i++){
        //     if(i%Math.sqrt(i)==0){
        //         count++;
        //     }
        // }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
