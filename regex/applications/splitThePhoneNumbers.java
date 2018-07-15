// There is a list of phone numbers which needs the attention of a text processing expert.
// As an expert in regular expressions, you are being roped in for the task. A phone number
// directory can reveal a lot such as country codes and local area codes. The only constraint
// is that one should know how to process it correctly.
//
// A Phone number is of the following format: [Country code]-[Local Area Code]-[Number]
// There might either be a '-' ( ascii value 45), or a ' ' ( space, ascii value 32) between the segments
// Where the country and local area codes can have 1-3 numerals each and the number section can
// have 4-10 numerals each.
//
// You will be provided a list of N phone numbers which conform to the pattern described above.
// Your task is to split it into the country code, local area code and the number.

// Input Format
// N, where N is the number of tests.
// This will be followed by N lines containing N phone numbers in the format specified above.

// Output Format
// Your output will contain N lines.
// CountryCode=[Country Code],LocalAreaCode=[Local Area Code],Number=[Number]

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<n; i++){
            String Test_String = scanner.nextLine();
            Pattern p = Pattern.compile("([0-9]{1,3})[\\s\\-]{1}([0-9]{1,3})[\\s\\-]{1}([0-9]{4,10})");
            Matcher m = p.matcher(Test_String);
            if(m.find()){
                System.out.println("CountryCode=" + m.group(1) + ",LocalAreaCode="+m.group(2)+",Number="+m.group(3));

            }

        }

    }
}
