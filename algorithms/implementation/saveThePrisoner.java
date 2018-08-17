// A jail has a number of prisoners and a number of treats to pass out to them. Their jailer
// decides the fairest way to divide the treats is to seat the prisoners around a circular table
// in sequentially numbered chairs. A chair number will be drawn from a hat. Beginning with the
// prisoner in that chair, one candy will be handed to each prisoner sequentially around the
// table until all have been distributed.
//
// The jailer is playing a little joke, though. The last piece of candy looks like all the others,
// but it tastes awful. Determine the chair number occupied by the prisoner who will receive that candy.
//
// For example, there are 4 prisoners and 6 pieces of candy. The prisoners arrange themselves
// in seats numbered 1 to 4. Let's suppose two is drawn from the hat. Prisoners receive candy at positions
// 2,3,4,1,2,3. The prisoner to be warned sits in chair number 3.
//
// Function Description
// Complete the saveThePrisoner function in the editor below. It should return an integer
// representing the chair number of the prisoner to warn.
//
// saveThePrisoner has the following parameter(s):
// n: an integer, the number of prisoners
// m: an integer, the number of sweets
// s: an integer, the chair number to begin passing out sweets from
//
// Input Format
// The first line contains an integer, t, denoting the number of test cases.
// The next t lines each contain 3 space-separated integers:
// - n : the number of prisoners
// - m : the number of sweets
// - s : the chair number to start passing out treats at

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int saveThePrisoner(int n, int m, int s){
        // n=# of prisoners; m=# of treats; s=start
        if(m>n){
            if(s+(m%n)-1 > n){
                return s + (m%n) - 1 - n;
            } else if(s+(m%n)-1==0) {
                return n;
            } else {
                return s + (m%n) - 1;
            }
        } else if (m<n) {
            if((s+m-1)%n > n){
                return ((s+m-1) % n) - n;
            } else if ((s+m-1)%n==0){
                return n;
            }else{
                return (s+m-1) % n;
            }
        } else if (m==n && s>1){
            return s-1;
        } else if (m==n && s==1){
            return n;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
