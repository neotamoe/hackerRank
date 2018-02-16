// Given an array of integers, calculate which fraction of its elements are positive,
// which fraction of its elements are negative, and which fraction of its elements are
// zeroes, respectively. Print the decimal value of each fraction on a new line.
//
// Note: This challenge introduces precision problems. The test cases are scaled to
// six decimal places, though answers with absolute error of up to 10^-4 are acceptable.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        // Complete this function
        int plus = 0;
        int minus = 0;
        int zero = 0;
        double total = arr.length;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>0){
                plus++;
            } else if (arr[i]<0){
                minus++;
            } else {
                zero++;
            }
        }
        System.out.println(plus/total);
        System.out.println(minus/total);
        System.out.println(zero/total);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
