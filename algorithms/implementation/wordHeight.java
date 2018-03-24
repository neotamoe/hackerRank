// In this challenge, you will be given a list of letter heights in the alphabet and
// a string. Using the letter heights given, determine the area of the rectangle
// highlight in mm^2 assuming all letters are 1mm wide.
//
// Input Format
// The first line contains 26 space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z].
// The second line contains a single word, consisting of lowercase English alphabetic letters.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int designerPdfViewer(int[] h, String word) {
        // Complete this function
        int maxHeight = 0;
        char[] wordCharArr = word.toCharArray();
        for(int i=0; i<word.length(); i++){
            if(h[wordCharArr[i]-'a']>maxHeight){
                maxHeight = h[wordCharArr[i]-'a'];
            }
        }
        return maxHeight*word.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
