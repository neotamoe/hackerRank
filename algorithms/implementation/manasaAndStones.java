// Manasa is out on a hike with friends. She finds a trail of stones with numbers on them.
// She starts following the trail and notices that any two consecutive stones' numbers
// differ by one of two values. Legend has it that there is a treasure trove at the end of
// the trail. If Manasa can guess the value of the last stone, the treasure will be hers.
//
// For example, assume she finds 2 stones and their differences are a = 2 or b = 3. We
// know she starts with a 0 stone not included in her count. The permutations of differences
// for the two stones would be [2,2], [2,3], [3,2] or [3,3]. Looking at each scenario,
// stones might have [2,4], [2,5], [3,5] or [3,6] on them. The last stone might have
// any of 4, 5, or 6 on its face.
//
// Compute all possible numbers that might occur on the last stone given a starting
// stone with a 0 on it, a number of additional stones found, and the possible differences
// between consecutive stones. Order the list ascending.
//
// Input Format:
// The first line contains an integer T, the number of test cases.
//
// Each test case contains 3 lines:
// - The first line contains n, the number of non-zero stones found.
// - The second line contains a, one possible difference
// - The third line contains b, the other possible difference.
//
// Output Format:
// Space-separated list of numbers which are the possible values of the last stone in increasing order.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stones function below.
    static int[] stones(int n, int a, int b) {  //n=#stones; a=difference; b=difference
        Set<Integer> stonesums = new HashSet();
        for(int i=0; i<n; i++){
            int sum1 = a*i + b*(n-1-i);
            int sum2 = a*(n-1-i) + b*i;
            stonesums.add(sum1);
            stonesums.add(sum2);
        }

        int[] array = stonesums.stream().mapToInt(x -> x).toArray();
        Arrays.sort(array);
        return array;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int a = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int b = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = stones(n, a, b);

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
