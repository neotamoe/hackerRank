// Day 6: Let's Review
// Given a string, s, of length n that is indexed from 0 to n-1, print its even-indexed
// and odd-indexed characters as 2 space-separated strings on a single line.
// Sample Input:
// 2
// Hacker
// Rank
// Sample Output:
// Hce akr
// Rn ak
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int j=0; j<t; j++){
            String odd = "";
            String even = "";
            String string = scanner.next();
            for(int i = 0; i<string.length(); i++){
                if(i%2==0){
                    even += string.charAt(i);
                } else {
                    odd += string.charAt(i);
                }

            }
            System.out.println(even + " " + odd);
        }
    }
}
