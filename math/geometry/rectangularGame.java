// You are given an infinite 2-d grid with the bottom left cell referenced as (1,1).
// All the cells contain a value of zero initially. Let’s play a game?
//
// The game consists of N steps wherein each step you are given two integers a and b.
// The value of each of the cells in the co-ordinate (u, v) satisfying 1 ≤ u ≤ a and
// 1 ≤ v ≤ b, is increased by 1. After N such steps, if X is the largest number amongst
// all the cells in the rectangular board, can you print the number of X’s in the board?
//
// Input Format
// The first line of input contains a single integer N. N lines follow.
// Each line contains two integers a and b separated by a single space.
//
// Output Format
// Output a single integer - the number of X’s.
//
// NOTE: I knew there was a solution without actually "filling" the jars, but did not see
// the solution so read discussion comments to understand the "math" way to find the solution.

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static long solve(int[][] steps) {
        int minx = Integer.MAX_VALUE;
        int miny = Integer.MAX_VALUE;
        for(int i=0; i<steps.length; i++){
            if(steps[i][0]<minx){
                minx = steps[i][0];
            }
            if(steps[i][1]<miny){
                miny = steps[i][1];
            }
        }
        return (long)minx * miny;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] steps = new int[n][2];

        for (int stepsRowItr = 0; stepsRowItr < n; stepsRowItr++) {
            String[] stepsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int stepsColumnItr = 0; stepsColumnItr < 2; stepsColumnItr++) {
                int stepsItem = Integer.parseInt(stepsRowItems[stepsColumnItr]);
                steps[stepsRowItr][stepsColumnItr] = stepsItem;
            }
        }

        long result = solve(steps);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
