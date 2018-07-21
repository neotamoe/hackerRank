// Given a sentence, s, write a RegEx to match the following criteria:
// 1. The first character must be the letter H or h.
// 2. The second character must be the letter I or i.
// 3. The third character must be a single space (i.e.: \s).
// 4. The fourth character must not be the letter D or d.
// 5. Given n lines of sentences as input, print each sentence matching your RegEx on a new line.
//
// Input Format
// The first line contains an integer, n, denoting the number of lines of sentences.
// Each of the n subsequent lines contains some sentence s you must match.
//
// Constraints
// 1 <= n <= 10
// Each sentence, s, contains 1 to 10 words.
// Each word/token in a sentence is comprised only of upper and lowercase English letters.
//
// Output Format
// Find each sentence, s, satisfying the RegEx criteria mentioned above, and print it on a new line.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Pattern p = Pattern.compile("^([hH]{1}[iI]{1}\\s{1}[^Dd]).*?$");

        for(int i=0; i<lines; i++){
            String test = scanner.nextLine();
            Matcher m = p.matcher(test);
            if(m.find()){
                System.out.println(test);
            }
        }
    }
}
