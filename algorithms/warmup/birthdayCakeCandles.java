// Colleen is having a birthday! She will have a cake with one candle for each year of her age.
// When she blows out the candles, she’ll only be able to blow out the tallest ones.
// Find and print the number of candles she can successfully blow out.
// The first line contains a single integer, n, denoting the number of candles on the cake.
// The second line contains n space-separated integers, where each integer i describes the height of candle i.
// Print the number of candles the can be blown out on a new line.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function

        int count = 0;
        int max = Arrays.stream(ar).max().getAsInt();
        for(int i=0; i<ar.length; i++){
            if(ar[i]==max){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
