// You will be provided with a block of text, spanning not more than hundred lines. Your
// task is to find the unique e-mail addresses present in the text. You could use Regular
// Expressions to simplify your task. And remember that the "@" sign can be used for a variety of purposes!
//
// Input Format
// The first line contains an integer N (N<=100), which is the number of lines present 
// in the text fragment which follows.
// From the second line, begins the text fragment (of N lines) in which you need to
// search for e-mail addresses.
//
// Output Format
// All the unique e-mail addresses detected by you, in one line, in lexicographical order,
// with a semi-colon as the delimiter.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Set<String> results = new HashSet<String>();
        Pattern p = Pattern.compile("\\b[a-zA-Z0-9_\\.]{2,}@[a-zA-Z0-9_]{2,}[\\.][a-zA-Z0-9_\\.]{2,}\\b");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String result = "";
        String testString = "";
        for(int i=0; i<n; i++){
            testString += scanner.nextLine() + " ";
        }
        Matcher m = p.matcher(testString);
        while(m.find()){
            results.add(m.group(0));
        }
        Set<String> sortedResults = new TreeSet<String>(results);
        String finalResults = "";
        for(String email: sortedResults){
            finalResults += email + ";";
        }
        System.out.println(finalResults.substring(0,finalResults.length()-1));
    }
}
