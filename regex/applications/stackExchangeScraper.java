// Stack Exchange is an information power-house, which contains libraries of crowdsourced problems
// (with answers) across a large number of topics which are as diverse as electronics, cooking ,
// programming, etc.
// 
// We are greatly interested in crawling and scraping as many questions, as we can, from stack-exchange.
// This is an example of a question library page from stack-exchange.
//
// Your task will be, to scrape the questions from each library page, in the order in which they
// are listed. You will be provided with the markup of question listing pages, from which you need to detect:
// (1) Identifier (2) Question text (which is on the Hyperlink to the question) (3) How long ago
// the question was asked.
//
// Output Format
// The output file should contain N lines, where N is the number of questions you have
// identified in the provided fragment.Each line contains the identifier, question text
// and (relative) time when the question was asked (with no leading or trailing spaces
// surrounding each section); separated by semi-colons. The information about the questions
// in the output file should match with the ordering in the original markup.
//
// A Note Regarding the Test Cases
// The markup in the test cases will resemble the markup fragment provided above, however,
// each markup fragment might contain a larger number of questions embedded in it. A markup
// fragment will have no more than 100 questions embedded in it.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p1 = Pattern.compile("id\\=\"question-summary-([0-9]{1,})");
        Pattern p2 = Pattern.compile("<h3><a href\\=\"/questions/.+(?=>)>(.+)(?=</a></h3>)</a></h3>");
        Pattern p3 = Pattern.compile("class=\"relativetime\">(.+)(?=</span>)</span>");
        while(scanner.hasNextLine()){
            String currentLine = scanner.nextLine();
            Matcher m1 = p1.matcher(currentLine);
            Matcher m2 = p2.matcher(currentLine);
            Matcher m3 = p3.matcher(currentLine);
            if(m1.find()){
                System.out.print(m1.group(1) + ";");
            }
            if(m2.find()){
                System.out.print(m2.group(1) + ";");
            }
            if(m3.find()){
                System.out.print(m3.group(1) + "");
                System.out.println("");
            }
        }
    }
}
