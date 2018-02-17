// Task: Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
// Given a 6x6 2D Array, A:
// We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:
// a b c
//   d
// e f g
// ** Learning point: primitives (like int) can't be null.  Object classes (like Integer) can be null.
// I'm not sure if this is the best solution, but I needed to be able to account for potential negative numbers as a max sum.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int hourglassSum = 0;
        Integer hourglassSumMax = null;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                hourglassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]+ arr[i+2][j+2];
                if(hourglassSumMax == null){
                    hourglassSumMax = hourglassSum;
                    hourglassSum = 0;
                } else if(hourglassSum >= hourglassSumMax){
                    hourglassSumMax = hourglassSum;
                    hourglassSum = 0;
                } else {
                    hourglassSum = 0;
                }
            }
        }

        System.out.println(hourglassSumMax);
    }
}
