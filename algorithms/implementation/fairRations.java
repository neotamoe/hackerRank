// You are the benevolent ruler of Rankhacker Castle, and today you're distributing bread. Your
// subjects are in a line, and some of them already have some loaves.  Times are hard and your
// castle's food stocks are dwindling, so you must distribute as few loaves as possible
// according to the following rules:
//
// * Every time you give a loaf of bread to some person i, you must also give a loaf of bread
//   to the person immediately in front of or behind them in the line (i.e., persons i+1 or i-1).
// * After all the bread is distributed, each person must have an even number of loaves.
// * Given the number of loaves already held by each citizen, find and print the minimum number of loaves you must distribute to satisfy the two rules above. If this is not possible, print NO.
//
// For example, the people in line have loaves B=[4,5,6,7]. We can first give a loaf to i=3 and
// i=4 so B=[4,5,7,8]. Next we give a loaf to i=2 and i=3 and have B=[4,6,8,8] which satisfies our
// conditions. We had to distribute 4 loaves.
//
// Input Format
// * The first line contains an integer N, the number of subjects in the bread line.
// * The second line contains N space-separated integers B[i].
//
// Output Format
// Print a single integer denoting the minimum number of loaves you must distribute to
// adjacent people in the line so that every person has an even number of loaves. If it's
// not possible to do this, print NO.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the fairRations function below.
    static String fairRations(int[] B) {
        int loaves = 0;
        boolean changed = true;
        int loops = 0;
        String result = "";
        if(B.length==2){
            if(B[0]%2==0 && B[1]%2!=0){
                return "NO";
            } else if (B[0]%2!=0 && B[1]%2==0){
                return "NO";
            } else if (B[0]%2==0 && B[1]%2==0){
                return Integer.toString(0);
            } else {
                return Integer.toString(2);
            }
        }
        while(changed){
            changed = false;
            for(int i=0; i<B.length; i++){
                if(B[i]%2!=0){
                    B[i] = B[i] + 1;
                    loaves++;
                    changed = true;
                    if(i==0){
                        B[i+1] = B[i+1] + 1;
                        loaves++;
                        changed = true;
                    } else if(i==B.length-1){
                        B[i-1] = B[i-1] + 1;
                        loaves++;
                        changed = true;
                    } else if (B[i-1]%2!=0) {
                        B[i-1] = B[i-1] + 1;
                        loaves++;
                        changed = true;
                    } else if (B[i+1]%2!=0){
                        B[i+1] = B[i+1] + 1;
                        loaves++;
                        changed = true;
                    } else {
                        B[i+1] = B[i+1] + 1;
                        loaves++;
                        changed = true;
                    }
                }
            }
            loops++;
            if(changed && loops > 3) {
                return result = "NO";
            }
        }
        result = result=="NO" ? "NO" : Integer.toString(loaves);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] B = new int[N];

        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        String result = fairRations(B);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
