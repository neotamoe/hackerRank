Alex is attending a Halloween party with his girlfriend, Silvia. At the party,
Silvia spots the corner of an infinite chocolate bar (two dimensional, infinitely
long in width and length).

If the chocolate can be served only as 1 x 1 sized pieces and Alex can cut the chocolate
bar exactly K times, what is the maximum number of chocolate pieces Alex can cut and give Silvia?

Note: Chocolate must be served in 1 x 1 sized pieces. Alex can’t relocate any of
the pieces, nor can he place any piece on top of another.

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the halloweenParty function below.
     */
    static long halloweenParty(int k) {
        return k%2==0 ? (k/2L)*(k/2) : ((k-1)/2L) * ((k+1)/2);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int tItr = 0; tItr < t; tItr++) {
            int k = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            long result = halloweenParty(k);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
