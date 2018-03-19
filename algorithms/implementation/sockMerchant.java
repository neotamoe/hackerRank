// You will be given an array of integers representing the color of each sock. Determine
// how many pairs of socks with matching colors there are.
//
// John works at a clothing store and he's going through a pile of socks to find the
// number of matching pairs. More specifically, he has a pile of n loose socks where each
// sock is labeled with an integer denoting its color. He wants to sell as many socks
// as possible, but his customers will only buy them in matching pairs. Two socks are
// a single matching pair if they have the same color (integer).
//
// Given n and the color of each sock, how many pairs of socks can John sell?
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int count = 0;
        Arrays.sort(ar);
        for(int i=0; i<ar.length-1; i++){
            if(ar[i]==ar[i+1]){
                count++;
                if(i+1<=ar.length-2){
                    i+=1;
                }
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
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
