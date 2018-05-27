// You have a string of lowercase English alphabetic letters. You can perform two
// types of operations on the string:
//
// Append a lowercase English alphabetic letter to the end of the string.
// Delete the last character in the string. Performing this operation on an empty 
// string results in an empty string.
// Given an integer, k, and two strings, s and t, determine whether or not you can
// convert s to by performing exactly k of the above operations on s. If it's possible,
// print Yes. Otherwise, print No.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String appendAndDelete(String s, String t, int k) {
        // Complete this function
        int shorterLength = s.length() < t.length() ? s.length() : t.length();
        int firstDifferentIndex = shorterLength;
        for(int i=0; i<shorterLength; i++){
            if(s.charAt(i)!=(t.charAt(i))){
                firstDifferentIndex = i;
                break;
            }
        }

        String result = "No";
        if(s.length()>=t.length() ){
            if(s.equals(t) && (k%2==0 || k>=s.length()*2)){
                return result = "Yes";
            }

            if(s.substring(0,t.length()).equals(t)){
                if (k>=s.length()*2){
                    return result = "Yes";
                } else if(k%2==0 && k>s.length()-t.length()){
                    return result = "Yes";
                }
            }
            if(k>=(t.length()*2)){
                return result = "Yes";
            }
        }
        String sdifferent = s.substring(firstDifferentIndex);
        String tdifferent = t.substring(firstDifferentIndex);
        System.err.println(firstDifferentIndex);
        if(k==sdifferent.length()+tdifferent.length() ||
           (k >= sdifferent.length()+tdifferent.length() &&
           Math.abs( ((sdifferent.length()+tdifferent.length())-k) )%2==0)){
            return result = "Yes";
        }


        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        in.close();
    }
}
