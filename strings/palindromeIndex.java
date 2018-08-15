// Given a string of lowercase letters in the range ascii[a-z], determine a character
// that can be removed to make the string a palindrome. There may be more than one solution,
// but any will do. For example, if your string is "bcbc", you can either remove 'b' at
// index 0 or 'c' at index 3. If the word is already a palindrome or there is no solution,
// return -1. Otherwise, return the index of a character to remove.
//
// Function Description
// Complete the palindromeIndex function in the editor below. It must return the index
// of the character to remove or -1.
//
// The function palindromeIndex has the following parameter(s):
// s: a string to analyze
//
// Input Format
// The first line contains an integer q, the number of queries.
// Each of the next q lines contains a query string s.
//
// Constraints
// All characters are in the range ascii[a-z].

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
        int indexToRemove = 0;
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
                indexToRemove = -1;
            } else {
                if(s.charAt(start+1)==s.charAt(end) && s.charAt(start+2)==s.charAt(end-1)){
                    indexToRemove = start;
                    start++;
                    end--;
                    break;
                } else if (s.charAt(start)==s.charAt(end-1) && s.charAt(start+1)==s.charAt(end-2)){
                    indexToRemove = end;
                    start++;
                    end--;
                    break;
                } else {
                    start++;
                    end--;
                    indexToRemove = -1;
                }
            }
        }
        return indexToRemove;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
