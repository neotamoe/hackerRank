// Sorting is useful as the first step in many different tasks. The most common task
// is to make finding things easier, but there are other uses as well. In this case,
// it will make it easier to determine which pair or pairs of elements have the smallest
// absolute difference between them.
//
// For example, if you've got the list [5,2,3,4,1], sort it as [1,2,3,4,5] to see that
// several pairs have the minimum difference of 1: (1,2), (2,3), (3,4), (4,5).
//
// Challenge
// Given a list of unsorted integers, arr, find the pair of elements that have the smallest absolute difference between them. If there are multiple pairs, find them all.
// 
// Input Format
//
// The first line contains a single integer n, the length of arr.
// The second line contains n space-separated integers, arr[i].
//
// Constraints
// All a[i] are unique in arr.
//
// Output Format:
// Output the pairs of elements with the smallest difference. If there are multiple pairs,
// output all of them in ascending order, all on the same line with just a single space between
// each pair of numbers. A number may be part of two pairs when paired with its predecessor and its successor.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        int tempMin = Integer.MAX_VALUE;
        int pairsFound = 0;
        for(int i=0; i<arr.length-1; i++){
            if (Math.abs(arr[i]-arr[i+1])<=tempMin){
                tempMin = Math.abs(arr[i] - arr[i+1]);
                pairsFound++;
            }
        }
        int[] pairs = new int[pairsFound*2];
        int counter = 0;
        for(int j=0; j<arr.length-1; j++){
            if(Math.abs(arr[j]-arr[j+1])==tempMin){
                pairs[counter] = arr[j];
                counter++;
                pairs[counter] = arr[j+1];
                counter++;
            }
        }
        return Arrays.copyOfRange(pairs, 0,counter);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
