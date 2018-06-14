// We define the distance between two array values as the number of indices between
// the two values. Given a, find the minimum distance between any pair of equal elements
// in the array. If no such value exists, print -1.
//
// For example, if a=[3,2,1,2,3], there are two matching pairs of values: 3 and 2 .
// The indices of the 3’s are i=0 and j=4, so their distance is d[i,j] = |j-i|=4.
// The indices of the 2’s are i=1 and j=3, so their distance is d[i,j] = |j-i| = 2.
//
// Input Format
// The first line contains an integer n, the size of array a.
// The second line contains n space-separated integers a[i].

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        int distance = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j] && j-i<distance){
                    distance = j-i;
                }
            }
        }
        if(distance ==Integer.MAX_VALUE){
            return distance = -1;
        }
        return distance;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
