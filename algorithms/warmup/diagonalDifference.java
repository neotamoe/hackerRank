// Given a square matrix, calculate the absolute difference between the sums of
// its diagonals.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int negSlope = 0;
        int posSlope = 0;
        int negIndex = 0;
        int posIndex = a[0].length-1;
        int line = 0;
        for(int j=0; j<a[0].length; j++){
            for(int i=0; i<a[0].length; i++){
                if(i==negIndex){
                    negSlope += a[line][i];
                }
                if (i==posIndex){
                    posSlope += a[line][i];
                }
            }
            negIndex++;
            posIndex--;
            line++;
        }
        return Math.abs(negSlope-posSlope);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
