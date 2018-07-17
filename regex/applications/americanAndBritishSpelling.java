// American English and British English differ in several aspects which are reflected in their spelling.
// One difference frequently observed, is that words written in American English, which have a suffix ze
// often end in se in British English. Given the American-English spelling of a word which ends in ze
// your task is to find the total count of all its British and American variants in all the given
// sequences of words. i.e. you need to account for the cases where the word occurs as it is given to 
// you (i.e. the version ending in -ze) and you also need to find the occurances of its British-English
// counterparts (i.e, the version ending in -se).
//
// Input Format
// First line contains N, N lines follow each line contains a sequence of words (W) separated by a
// single space. Next line contains T. T testcases follow in a new line. Each line contains the
// American English spelling of a word (W’)
//
// Constraints
// W’ ends with ze ( US version of the word)
//
// Output Format
// Output T lines and in each line output the total number of American and British versions of
// (W’) in all of N lines that contains a sequence of words.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String Test_String = "";
        for(int i=0; i<n; i++){
            Test_String += scanner.nextLine() + " ";
        }
        System.err.println(Test_String);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);

        for(int j=0; j<t; j++){
            int count = 0;
            String USWord = scanner.nextLine();
            String USWordStart = USWord.substring(0,USWord.length()-2);
            System.err.println(USWord);
            System.err.println(USWordStart);
            Pattern p = Pattern.compile("(" + USWordStart + "se|"+USWord+")");
            System.err.println("p: "+p);
            Matcher m = p.matcher(Test_String);
            while(m.find()){
                count++;
            }
            System.out.println(count);

        }

    }
}
