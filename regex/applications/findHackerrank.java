// At HackerRank, we always want to find out how popular we are getting every day and have
// scraped conversations from popular sites. Each conversation fits in 1 line and there are
// N such conversations. Each conversation has at most 1 word that says hackerrank (all in
// lowercase). We would like you to help us figure out whether a conversation:
//   * Starts with hackerrank
//   * Ends with hackerrank
//   * Start and ends with hackerrank
//
// Input Format
// First line of the input contains an integer, N. Then N lines follow.
// From the second line onwards, each line contains a set of W words separated by a single space
//
// Constraints
// All the characters in W are lowercase alphabet characters.
// If C is the count of the characters in W, then 1 <= C <= 20
//
// Output Format
// For every line,
//   * Print 1 if the conversation starts with hackerrank
//   * Print 2 if the conversation ends with hackerrank
//   * Print 0 if the conversation starts and ends with hackerrank
//   * Print -1 if none of the above.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Pattern p1 = Pattern.compile("^hackerrank");
        System.err.println(p1);
        Pattern p2 = Pattern.compile("hackerrank$");
        for(int i=0; i<lines; i++){
            String test = scanner.nextLine();
            Matcher m1 = p1.matcher(test);
            Matcher m2 = p2.matcher(test);
            if(m1.find()){
                if(m2.find()){
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else if (m2.find()){
                System.out.println(2);
            }  else {
                System.out.println(-1);
            }
        }
    }
}
