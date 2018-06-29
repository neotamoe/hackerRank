// Given an array of integers, find and print the maximum number of integers you can
// select from the array such that the absolute difference between any two of the
// chosen integers is less than or equal to 1. For example, if your array is
// a=[1,1,2,2,4,4,5,5,5], you can create two subarrays meeting the criterion: [1,1,2,2]
// and [4,4,5,5,5]. The maximum length subarray has 5 elements.

// Output Format
// A single integer denoting the maximum number of integers you can choose from the
// array such that the absolute difference between any two of the chosen integers is <=1.

// Constraints
// * 2<=n<=100
// *0<a[i]<100
// *The answer will be >=2.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {
        int count = 0;
        int upCount = 0;
        int downCount = 0;
        int max = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                if(a[i]-a[j]==0){
                    count++;
                }
                if(a[i]-a[j]==-1){
                    upCount++;
                }
                if(a[i]-a[j]==1){
                    downCount++;
                }
            }
            System.err.println("max: " + max + " upCount: " + upCount + " downCount: " + downCount + " count: " + count);
            if(count+upCount>max){
                max = count + upCount;
            }
            if(count+downCount>max){
                max = count + downCount;
            }
            count = 0;
            downCount = 0;
            upCount = 0;
        }
        return max;

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

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
