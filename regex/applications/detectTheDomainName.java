// You will be provided with a chunk of HTML markup. Your task is to identify the unique
// domain names from the links or Urls which are present in the markup fragment.
//
// For example, if the link http://www.hackerrank.com/contest is present in the markup, you
// should detect the domain: hackerrank.com. In case there are second level or higher
// level domains present in the markup, all of them need to be treated as unique. For 
// instance if the links http://www.xyz.com/news, https://abc.xyz.com/jobs,
// http://abcd.xyz.com/jobs2 are present in the markup then [xyz.com, abc.xyz.com,
// abcd.xyz.com] should all be identified as unique domains present in the markup.
// Prefixes like “www.” and “ww2.“, if present, should be scrubbed out from the domain name.
//
// Input Format
// An Integer N. This is equal to the number of lines in the HTML Fragment which follows.
// A chunk of HTML Markup with embedded links, the length of which is N lines.
//
// Output Format
// One line, containing the list of detected domains, separated by semi-colons, in
// lexicographical order. Do not leave any leading or trailing spaces either at the
// ends of the line, or before and after the individual domain names.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Set<String> domains = new HashSet<String>();
        String input = "";
        for(int i=0; i<lines; i++){
            input += scanner.nextLine() + " ";
        }
        Pattern p = Pattern.compile("https?://([a-zA-Z\\d-]+[\\.]{1})+([a-zA-Z\\d-]+){1,}([\\s\\W_])");
        Matcher m = p.matcher(input);
        while(m.find()){
            String domain = m.group(0);
            if(domain.substring(0,10).equals("http://www") || domain.substring(0,10).equals("http://ww2")){
                domain = domain.substring(11, domain.length()-1);
            } else if (domain.substring(0,11).equals("https://www") || domain.substring(0,10).equals("https://ww2")){
                domain = domain.substring(12, domain.length()-1);
            } else if(domain.substring(0,5).equals("https")){
                domain = domain.substring(8, domain.length()-1);
            } else {
                domain = domain.substring(7, domain.length()-1);  // if http
            }
            domains.add(domain);
        }
        Set<String> sortedResults = new TreeSet<String>(domains);
        String finalResults = "";
        for(String domain: sortedResults){
            finalResults += domain + ";";
        }
        System.out.println(finalResults.substring(0,finalResults.length()-1));
    }
}
