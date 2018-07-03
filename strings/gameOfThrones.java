// Dothraki are planning an attack to usurp King Robert’s throne. King Robert
// learns of this conspiracy from Raven and plans to lock the single door through
// which the enemy can enter his kingdom.
//
// But, to lock the door he needs a key that is an anagram of a palindrome. He starts
// to go through his box of strings, checking to see if they can be rearranged into a palindrome.
//
// Complete the GameOfThrones function below to determine whether a given string
// can be rearranged into a palindrome.
//
// Input Format: A single line which contains s, the input string.
//
// Constraints: s contains only lowercase letters in the range
//
// Output Format: A single line which contains YES or NO in uppercase.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        char[] schar = s.toCharArray();
        Arrays.sort(schar);
        String result = "YES";
        if(s.length()%2==0){  // if even string length
            for(int i=0; i<s.length()-1; i++){
                if(schar[i]==schar[i+1]){
                    i+=1;
                } else {
                    result = "NO";
                    break;
                }
            }
            return result;
        } else {  // odd string length
            boolean foundSolo = false;
            for(int i=0; i<s.length()-1; i++){
                if(schar[i]==schar[i+1]){
                    i+=1;
                } else if (schar[i]!=schar[i+1] && !foundSolo) {
                    foundSolo = true;
                } else {
                    result = "NO";
                    break;
                }
            }
            return result;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
