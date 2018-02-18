// Given five positive integers, find the minimum and maximum values that can be
// calculated by summing exactly four of the five integers. Then print the respective
// minimum and maximum values as a single line of two space-separated long integers.
// (The output can be greater than 32 bit integer.)
// Hints: Beware of integer overflow! Use 64-bit Integer.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        Integer max = Arrays.stream(arr).max().getAsInt();
        Integer min = Arrays.stream(arr).min().getAsInt();
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        long maxSum = sum - min;
        long minSum = sum - max;
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
