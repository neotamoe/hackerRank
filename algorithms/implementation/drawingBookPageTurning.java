// Brie’s Drawing teacher asks her class to open their n-page book to page number p.
// Brie can either start turning pages from the front of the book (i.e., page number 1)
// or from the back of the book (i.e., page number n), and she always turns pages
// one-by-one (as opposed to skipping through multiple pages at once). When she opens
// the book, page 1 is always on the right side:
//
// Each page in the book has two sides, front and back, except for the last page which may only have a front side depending on the total number of pages of the book (see the Explanation sections below for additional diagrams).
//
// Given n and p, find and print the minimum number of pages Brie must turn in order
// to arrive at page p.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function n=numberOfPagesInBook; p=pageToFind
        int front = 0;
        int back = 0;
        if(p%2==0){
            front = p/2;
        } else {
            front = (p-1)/2;
        }
        if(n-p==1 && p%2==0){
            back = 0;
        } else if (n-p==1 && p%2==1){
            back = 1;
        } else if ((n%2==0 && p%2==0) || (p%2==1 && n%2==1)){
            back = (n-p)/2;
        } else {
            back = (n-p-1)/2;
        }
        return front<=back ? front : back;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
