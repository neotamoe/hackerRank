// You are given a number of sticks of varying lengths. You will iteratively cut the
// sticks into smaller sticks, discarding the shortest pieces until there are none left.
// At each iteration you will determine the length of the shortest stick remaining,
// cut that length from each of the longer sticks and then discard all the pieces
// of that shortest length. When all the remaining sticks are the same length, they 
// cannot be shortened so discard them.
//
// Given the lengths of  sticks, print the number of sticks that are left before each
// iteration until there are none left.
//
// Note: Before each iteration you must determine the current shortest stick.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        String cutSticks = "";
        int cutSticksCount = 0;

        do{
            cutSticksCount = 0;
            int shortest = Integer.MAX_VALUE;
            for(int stick : arr){
                shortest = (stick == 0) ? shortest : Math.min(shortest, stick);
            }
            if(shortest == Integer.MAX_VALUE){
                break;
            }
            for(int i=0; i<arr.length; i++){
                System.err.println("shortest: " + shortest + " arr[i]: " + arr[i]);
                if(arr[i]!=0) {
                    arr[i] = arr[i]-shortest;
                    cutSticksCount++;
                }
            }
            cutSticks += cutSticksCount + " ";
            System.err.println(cutSticksCount);
        } while(cutSticksCount!=0);

        String[] cutSticksString = cutSticks.split(" ");
        int[] cutSticksInt = new int[cutSticksString.length];
        for(int j = 0; j<cutSticksString.length; j++){
            cutSticksInt[j] = Integer.parseInt(cutSticksString[j]);
        }
        return cutSticksInt;

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

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
