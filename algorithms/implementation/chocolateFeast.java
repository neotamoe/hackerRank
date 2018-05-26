// Little Bobby loves chocolate. He frequently goes to his favorite 5 & 10 store,
// Penny Auntie, to buy them. They are having a promotion at Penny Auntie. If Bobby
// saves enough wrappers, he can turn them in for a free chocolate.
//
// Complete the chocolateFeast function in the code stub below to return the number
// of chocolates Bobby can eat with a given amount of money after taking full 
// advantage of the promotion.
//
// Note: Little Bobby will always turn in his wrappers if he has enough to get a
// free chocolate.
//
// Input Format
// The first line contains an integer, t, denoting the number of scenarios to analyze.
// Each of the next t lines contains three space-separated integers: n, c, and m. They
// represent money to spend, cost of a chocolate, and the number of wrappers he can
// turn in for a free chocolate.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
        int wrappers = n/c;
        int eatenChocos = n/c;
        while ( wrappers >= m) {
            int newlyPurchased = wrappers / m;
            wrappers = wrappers - (m * newlyPurchased) + newlyPurchased;
            eatenChocos = eatenChocos + newlyPurchased;
        }
        return eatenChocos;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
