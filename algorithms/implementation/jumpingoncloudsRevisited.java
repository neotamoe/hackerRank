// Aerith is playing a cloud hopping game. In this game, there are sequentially numbered
// clouds that can be thunderheads or cumulus clouds. Her character must jump from cloud to
// cloud until it reaches the start again.
//
// To play, Aerith is given an array of clouds, c and an energy level e=100. She starts
// from c[0] and uses 1 unit of energy to make a jump of size k to cloud c[(k+i)%n]. If
// Aerith lands on a thundercloud, c[i]=1, her energy (E) decreases by 2 additional units.
// The game ends when Aerith lands back on cloud 0.
//
// Given the values of n, k, and the configuration of the clouds as an array c, can you
// determine the final value of e after the game ends?

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int total = 100;
        int i=0;
        if(c.length == k){
            if(c[0]==1){
                total-=3;
            } else {
                total -=1;
            }
            return total;
        } else {
            do {
                i+=k;
                if(c[i]==1){
                    total-=3;
                } else {
                    total-=1;
                }
            }
            while((i+k) % c.length != 0);
            if(c[0]==1){
                total-=3;
            } else {
                total -=1;
            }
            return total;

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
