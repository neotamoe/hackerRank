// Dan is playing a video game in which his character competes in a hurdle race by jumping
// over n hurdles with varying heights. He can initially jump a maximum height of k units,
// but he has an unlimited supply of magic beverages that help him jump higher! Dan can
// drink any number magic beverages and the maximum height he can jump during the entire
// race increases by the number of magic beverages he drink.
//
// Given n, k, and the heights of all the hurdles, find and print the minimum number
// of magic beverages Dan must drink to complete the race.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int hurdleRace(int k, int[] height) {
        // Complete this function
        int max = Arrays.stream(height).max().getAsInt();
        return max>k ? max-k : 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //# of hurdles
        int k = in.nextInt();  // hurdle height
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
