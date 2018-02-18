// Given two strings of lowercase English letters, A and B, perform the following operations:
//
// Sum the lengths of A and B.
// Determine if A is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
// Capitalize the first letter in A and B and print them on a single line, separated by a space.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)<0){
            System.out.println("No");
        } else if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
