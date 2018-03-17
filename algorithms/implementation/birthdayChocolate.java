// Lily has a chocolate bar consisting of a row of n squares where each square has an
// integer written on it. She wants to share it with Ron for his birthday, which falls on
// month m and day d. Lily wants to give Ron a piece of chocolate only if it contains m
// consecutive squares whose integers sum to d.
//
// Given m, d, and the sequence of integers written on each square of Lily's chocolate
// bar, how many different ways can Lily break off a piece of chocolate to give to Ron?
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int count = 0;

        for(int i=0; i<s.length; i++){
            int j=0;
            int icopy = i;
            int tempSum = 0;
            while(j<m && icopy<s.length){
                tempSum+=s[icopy];
                icopy++;
                j++;
            }
            if(tempSum==d){
                count++;
            }
            tempSum = 0;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // numberOfSquares
        int[] s = new int[n];  // integerOnSquares
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();  // sumDesired
        int m = in.nextInt();  // howManySquares
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
