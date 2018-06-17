// A strange grid has been recovered from an old book. It has 5 columns and infinite number
// of rows. The bottom row is considered as the first row. First few rows of the grid are like this:
//
// ..............
//
// ..............
//
// 20 22 24 26 28
//
// 11 13 15 17 19
//
// 10 12 14 16 18
//
//  1  3  5  7  9
//
//  0  2  4  6  8
//
//
// The grid grows upwards forever!
//
// Your task is to find the integer in cth column in rth row of the grid.


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the strangeGrid function below.
     */
    static long strangeGrid(long r, long c) {
        /*
         * Write your code here.
         */
        long upper = 0;
        long lower = 0;
        if(r%2==0){
            upper = (r*5)-1;
            lower = upper-8;
        } else {
            upper = ((r+1)*5)-2;
            lower = upper - 8;
        }

        if(c==1){
            return lower;
        } else if (c==2){
            return lower + 2;
        } else if (c==3){
            return lower + 4;
        } else if (c==4){
            return lower + 6;
        } else {
            return lower + 8;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] rc = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        long r = Long.parseLong(rc[0]);

        long c = Long.parseLong(rc[1]);

        long result = strangeGrid(r, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
