// Given two strings, determine if they share a common substring. A substring may be as small as one character.
//
// For example, the words "a", "and", "art" share the common substring a. The words "be" and
// "cat" do not share a substring.
//
// Function Description
//
// Complete the function twoStrings in the editor below. It should return a string, either
// YES or NO based on whether the strings share a common substring.
//
// Function twoStrings has the following parameter(s):
// s1, s2: two strings to analyze.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        // NOTE: this was my first attempt which works, but times out in test cases with really long strings
        // String smaller = s1.length() <= s2.length() ? s1 : s2;
        // String larger = s2.length() >= s1.length() ? s2 : s1;
        // for(int i=0; i<smaller.length(); i++){
        //     if(larger.contains(Character.toString(smaller.charAt(i)))){
        //         return "YES";
        //     }
        // }
        // return "NO";

        // I referenced the discussions and was reminded of retainAll method with sets.
        // I also utilized stack overflow for converting character array to list
        // https://stackoverflow.com/questions/15590675/converting-char-array-to-list-in-java
        // this results in a much simpler solution that passes all tests even with super long strings
        List<Character> list1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> list2 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        Set<Character> set1 = new TreeSet<Character>(list1);
        Set<Character> set2 = new TreeSet<Character>(list2);
        set1.retainAll(set2);
        if(set1.size()>0){
            return "YES";
        } else {
            return "NO";
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
