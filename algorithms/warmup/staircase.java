// Consider a staircase of size n=4:
//
//    #
//   ##
//  ###
// ####
//
// Observe that its base and height are both equal to n, and the image is drawn
// using # symbols and spaces. The last line is not preceded by any spaces.
//
// Write a program that prints a staircase of size n.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        // Complete this function
        String numberSymbol = "#";
        for(int i=0; i<n; i++){
            String formatted = String.format("%" + n + "s", numberSymbol);
            System.out.println(formatted);
            numberSymbol+="#";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
