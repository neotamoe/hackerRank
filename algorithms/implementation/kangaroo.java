// There are two kangaroos on a number line ready to jump in the positive direction (i.e, toward
// positive infinity). Each kangaroo takes the same amount of time to make a jump,
// regardless of distance. That is, if kangaroo one jumps 3 meters and kangaroo two jumps
// 5 meters, they each do it in one second, for example.
//
// Given the starting locations and jump distances for each kangaroo, determine if
// and when they will land at the same location at the same time.
// Print YES if they can land on the same location at the same time; otherwise, print NO.
// 
// Note: The two kangaroos must land at the same location after making the same number of jumps.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        String result = "";
        if((x1<x2 && v1<v2) || (x1>x2 && v1>v2)){
            result = "NO";
        } else if(x1<x2) {
            while(x1<x2){
                x1 += v1;
                x2 += v2;
                if(x1==x2){
                    result = "YES";
                }
            }
            if(!result.equals("YES")){
                result = "NO";
            }
        } else {  // x1>x2 && v1<v2
            while(x1>x2){
                x1 += v1;
                x2 += v2;
                if(x1==x2){
                    result = "YES";
                }
            }
            if(!result.equals("YES")){
                result = "NO";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();  // kangaroo1 start
        int v1 = in.nextInt();  // kangaroo1 jump
        int x2 = in.nextInt();  // kangaroo2 start
        int v2 = in.nextInt();  // kangaroo2 jump
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
