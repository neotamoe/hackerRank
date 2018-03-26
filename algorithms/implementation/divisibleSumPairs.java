// You are given an array of n integers and a positive integer, k. Find and print the
// number of (i,j) pairs where i<j and i + j is divisible by k.
//
// Input Format
// The first line contains 2 space-separated integers, n and k.
// The second line contains n space-separated integers describing the values of array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int pairs = 0;
        for(int i=0; i<ar.length; i++){

            for(int j=ar.length-1; j>i; j--){
                if((ar[i]+ar[j])%k==0 && i!=j){
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
