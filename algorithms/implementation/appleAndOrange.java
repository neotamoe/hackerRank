// For simplicity, we’ll assume all of the landmarks are on a number line. Larry climbs
// the apple tree at point a, and Rob climbs the orange tree at point b. Sam’s house
// stands between points s and t. Values increase from left to right.
//
// You will be given a list of distances the fruits are thrown. Negative distances
// indicate travel left and positive distances, travel right. Your task will be to
// calculate the scores for Larry and Rob and report them each on a separate line.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int appleCount = 0;
        int orangeCount = 0;
        for(int i=0; i<apples.length; i++){
            if(((apples[i] + a) >= s) && ((apples[i] + a) <=t)){
                appleCount++;
            }
        }
        for(int j=0; j<oranges.length; j++){
            if(((oranges[j] + b) >= s) && ((oranges[j] + b) <=t)){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();  // left house mark
        int t = in.nextInt();  // right house mark
        int a = in.nextInt();  // apple tree
        int b = in.nextInt();  // orange tree
        int m = in.nextInt();  // # of apples
        int n = in.nextInt();  // # of oranges
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
