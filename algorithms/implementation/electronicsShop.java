// Monica wants to buy exactly one keyboard and one USB drive from her favorite electronics
// store. The store sells n different brands of keyboards and m different brands of USB
// drives. Monica has exactly s dollars to spend, and she wants to spend as much of it
// as possible (i.e., the total cost of her purchase must be maximal).
//
// Given the price lists for the store's keyboards and USB drives, find and print the
// amount of money Monica will spend. If she doesn't have enough money to buy one keyboard
// and one USB drive, print -1 instead.
//
// Note: She will never buy more than one keyboard and one USB drive even if she has the leftover money to do so.
//
// Input Format
// The first line contains three space-separated integers describing the respective values of s (the amount of money Monica has), n (the number of keyboard brands) and m (the number of USB drive brands).
// The second line contains n space-separated integers denoting the prices of each keyboard brand.
// The third line contains m space-separated integers denoting the prices of each USB drive brand.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
        int max = 0;
        for(int i=0; i<keyboards.length; i++){
            for(int j=0; j<drives.length; j++){
                if(keyboards[i] + drives[j]>max && keyboards[i] + drives[j]<=s){
                    max = keyboards[i] + drives[j];
                }
            }
        }
        if(max==0){
            return -1;
        } else {
            return max;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
