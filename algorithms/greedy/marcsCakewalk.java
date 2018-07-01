// Marc loves cupcakes, but he also likes to stay fit. Each cupcake has a calorie count,
// and Marc can walk a distance to expend those calories. If Marc has eaten j cupcakes
// so far, after eating a cupcake with c calories he must walk at least 2^j * c miles
// to maintain his weight.
//
// For example, if he eats 3 cupcakes with calorie counts in the following order: [5,10,7],
// the miles he will need to walk are 5+(2^1 * 10) + (2^2 * 7) = 5 + 20 + 28 = 53. This
// is not the minimum, though, so we need to test other orders of consumption. In this
// case, our minimum miles is calculated as 10 + (2^1 * 7) + (2^2 * 5) = 10 + 14 + 20 = 44.
//
// Given the individual calorie counts for each of the cupcakes, find and print a long integer denoting the minimum number of miles Marc must walk to maintain his weight. Note that he can eat the cupcakes in any order.
//
// Input Format:
// The first line contains an integer n, the number of cupcakes in calorie.
// The second line contains n space-separated integers calorie[i].
//
//
// Output Format:
// Print a long integer denoting the minimum number of miles Marc must walk to maintain his weight.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the marcsCakewalk function below.
    static long marcsCakewalk(int[] calorie) {
        long sum = 0;
        int power = 0;
        Arrays.sort(calorie);
        for(int i=calorie.length-1; i>-1; i--){
            sum+=(Math.pow(2,power)*calorie[i]);
            power++;
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
