// Increasing popularity of hackerrank can be seen in tweets like:
// * I love #hackerrank
// * I just scored 27 points in the Picking Cards challenge on #HackerRank
// * I just signed up for summer cup @hackerrank
//
// Given a set of most popular tweets, your task is to find out how many of those
// tweets has the string hackerrank in it.
//
// Input Format
// First line is an integer N. N lines follow. Each line is a valid tweet.
//
// Constraints
// 1 <= N <= 10
// Each character of the tweet is a valid ASCII character.
//
// Output format
// Print the total number of tweets that has hackerrank (case insensitive) in it

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        Pattern p = Pattern.compile("hackerrank", Pattern.CASE_INSENSITIVE);
        for(int j=0; j<n; j++){
            String Test_String = scanner.nextLine();
            Matcher m = p.matcher(Test_String);
            if(m.find()){
                count++;
            }
        }
        System.out.println(count);

    }
}
