// I started doing code exercises on hackerRank.  Since code exercises at the beginning
// are much like I have done other places, I am putting multiple problems in one file.

// Monday, February 5, 2018
// intro test problem
public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

// Java Stdin and Stdout I
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

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

// Java Stdin and Stdout II
// In this challenge, you must read an integer, a double, and a String from stdin,
// then print the values according to the instructions in the Output Format section below.
// Note: If you use the nextLine() method immediately following the nextInt() method,
// recall that nextInt() reads integer tokens; because of this, the last newline
// character for that line of integer input is still queued in the input buffer and
// the next nextLine() will be reading the remainder of the integer line (which is empty).
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        String s = scan.nextLine() + scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
