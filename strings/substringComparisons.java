// Output Format: Return the respective lexicographically smallest and largest substrings as a
// single newline-separated string.
// Input Format:
// The first line contains a string denoting .
// The second line contains an integer denoting .
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; i<s.length()-k+1; i++){
            String current = s.substring(i,i+k);
            if(i==0){
                smallest = current;
            }
            if(current.compareTo(smallest)<=0){
                smallest = current;
            }
            if(current.compareTo(largest)>=0){
                largest = current;
            }

        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
