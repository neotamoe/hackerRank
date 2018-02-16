// Day 9: Recursion
// Write a factorial function that takes a positive integer, N as a parameter and
//  prints the result of N!(N factorial).


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n) {
        // Complete this function
        if (n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}
