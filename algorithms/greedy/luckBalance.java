Lena is preparing for an important coding competition that is preceded by a number of
sequential preliminary contests. She believes in "saving luck", and wants to check her
theory. Each contest is described by two integers, L[i] and T[i]:

L[i] is the amount of luck associated with a contest. If Lena wins the contest, her luck
balance will decrease by L[i]; if she loses it, her luck balance will increase by L[i].
T[i] denotes the contest's importance rating. It's equal to 1 if the contest is important, and
it's equal to 0 if it's unimportant.

If Lena loses no more than k important contests, what is the maximum amount of luck she
can have after competing in all the preliminary contests? This value may be negative.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int luck = 0;
        Arrays.sort(contests, (a, b) -> Integer.compare(a[0], b[0]));
        // shoutout to stackoverflow for showing me how to sort a 2D array!
        // https://stackoverflow.com/questions/15452429/java-arrays-sort-2d-array
        for(int i=contests.length-1; i>=0; i--){
            if(contests[i][1]==1 && k>0){
                luck+=contests[i][0];
                k--;
            } else if(contests[i][1]==0){
                luck+=contests[i][0];
            } else {
                luck-=contests[i][0];
            }
        }
        return luck;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
