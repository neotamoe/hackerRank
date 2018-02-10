// This is the same code that was done in introduction; code copied from that file
// file name: introductionDay1.java
// Java If-Else
// Given an integer (n) perform the following conditional actions:
//
// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 6, print Not Weird
// If n is even and in the inclusive range of 8 to 20, print Weird
// If n is even and greater than 20, print Not Weird
//
// Constraints
// 1 <= n <= 100

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else{
            if(n==2 || n==4){
                ans = "Not Weird";
            } else if (n>=6 && n<=20){
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }

        }
        System.out.println(ans);

    }
}
