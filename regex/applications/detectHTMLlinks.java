// Charlie has been given an assignment by his Professor to strip the links and the text name from the html pages.
// A html link is of the form: <a href="http://www.hackerrank.com">HackerRank</a>
// Where a is the tag and href is an attribute which holds the link charlie is interested in.
// The text name is HackerRank.
//
// Charlie notices that the text name can sometimes be hidden within multiple tags:
// <a href="http://www.hackerrank.com"><h1><b>HackerRank</b></h1></a>
// Here, the text name is hidden inside the tags h1 and b.
//
// Help Charlie in listing all the links and the text name of the links.
//
// Input Format
// The first line contains the number of lines in the fragment (N). This is followed by
// N lines from a valid HTML document or fragment.
//
// Constraints
// N < 100
// Number of characters in the test fragments <= 10000 characters.
// Characters will be restricted to ASCII. Fragments for the tests will be picked up
// from Wikipedia. Also, some tests might not have text or names on the links.
//
// Output Format
// If there are M links in the document, display each of them in a new line. The link and
// the text name must be separated by a "," (comma) with no spaces between them.
// Strip out any extra spaces at the start and end position of both the link and the text name before printing.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<nLines; i++){
            String test = scanner.nextLine();
            Pattern p = Pattern.compile("<a\\shref=\"(.*?)(?=\")(.*?)(?=>)>(.+?)(?=</a>)");
            Matcher m = p.matcher(test);
            while(m.find()){
                System.out.println(m.group(1) + "," + m.group(3));
            }
        }

    }
}
