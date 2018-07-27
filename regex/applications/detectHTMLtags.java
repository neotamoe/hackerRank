// In this challenge, we’re using regular expressions to detect the various tags used in an HTML document.
//
// Tags come in pairs. Some tag name, t, will have an opening tag, <t>, followed by some intermediate
// text, followed by a closing tag, </t>. The forward slash in a closing tag will always come before
// the tag name.  The exception to this is self-closing tags, which consist of a single tag
// (not a pair) with a forward slash after the tag name: <br/>
//
// Task
// Given N lines of HTML, find the tag names (ignore any attributes) and print them as a
// single line of lexicographically ordered semicolon-separated values (e.g.: tag1;tag2;tag3).
//
// Input Format
//   * The first line contains an integer, N, the number of HTML fragments.
//   * Each of the N subsequent lines contains a fragment of an HTML document.
//
// Output Format
//   * Print a single line containing all of the unique tag names found in the input.
//   * Your output tags should be semicolon-separated and ordered lexicographically (i.e.: alphabetically).
//   * Do not print the same tag name more than once.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Set<String> tags = new HashSet<String>();
        Pattern p = Pattern.compile("<([a-z0-9]+)(\\s)?.*?(?=>)>");
        for(int i=0; i<lines; i++){
            Matcher m = p.matcher(scanner.nextLine());
            while(m.find()){
                System.err.println(m.group(0));
                System.err.println(m.group(1));
                tags.add(m.group(1));
            }
        }

        Set<String> sortedResults = new TreeSet<String>(tags);
        String finalResults = "";
        for(String tag: sortedResults){
            finalResults += tag + ";";
        }
        System.out.println(finalResults.substring(0,finalResults.length()-1));
    }
}
