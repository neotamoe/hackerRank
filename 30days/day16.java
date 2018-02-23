// Day 16: Exceptions - String to Integer
// Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.
// Note: You must use the String-to-Integer and exception handling constructs built into
// your submission language. If you attempt to use loops/conditional statements,
// you will get a 0 score.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int sAsInt = Integer.parseInt(S);
            System.out.println(sAsInt);

        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
