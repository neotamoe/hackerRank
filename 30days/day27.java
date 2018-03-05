// This is a complex setup; see details at website:
// https://www.hackerrank.com/challenges/30-testing/problem

import java.io.*;
import java.util.*;

public class Solution {
    Solution (int n, int k, int[] A){
        String arrivals = "";
        System.out.println(n + " " + k);
        for(int i=0; i<A.length; i++){
            arrivals += A[i] + " ";
        }
        System.out.println(arrivals);
    }
    public static void main(String[] args) {
        int testCases = 5;
        System.out.println(testCases);

        new Solution(15, 5, new int[]{-1, -2, -3, -4, -3, -4, -3, -2, -1, 0, 0, 3, 1, 1, 4});
        new Solution(5, 2, new int[]{-1, 1, 2, 1, 0});
        new Solution(25, 20, new int[]{-4, -3, -2, -1, 0, 0, 3, 1, 1, 4, -1, -2, -3, -4, -3, -4, -3, -2, -1, 0, 0, 3, 1, 1, 4});
        new Solution(7, 6, new int[]{0, 0, 0, 0, -1, 1, -1});
        new Solution(9, 3, new int[]{0, 0, 0, 3, 3, -1, -1, -2, -1});

        // My first and very simple pass
        // // # of lectures
        // System.out.println("5");
        // // first test case
        // System.out.println("15 5");
        // System.out.println("-1 -2 -3 -4 -3 -4 -3 -2 -1 0 0 3 1 1 4");
        // // second
        // System.out.println("5 2");
        // System.out.println("-1 1 2 1 0");
        // // third
        // System.out.println("25 20");
        // System.out.println("-4 -3 -2 -1 0 0 3 1 1 4 -1 -2 -3 -4 -3 -4 -3 -2 -1 0 0 3 1 1 4");
        // // fourth
        // System.out.println("7 6");
        // System.out.println("0 0 0 0 -1 1 -1");
        // // fifth
        // System.out.println("9 3");
        // System.out.println("0 0 0 3 3 -1 -1 -2 -1");
    }
}
