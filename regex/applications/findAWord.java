// We define a word as a non-empty maximum sequence of characters that can contain only
// lowercase letters, uppercase letters, digits and underscores ‘_’ (ASCII value 95).
// Maximum sequence means that the word has to be immediately preceeded by a character
// not allowed to occur in a word or by the left boundary of the sentence, and it has
// to be immediately followed by a character not allowed to occur in a word or by the
// right boundary of the sentence.
// 
// Given N sentences and T words, for each of these words, find the number of its occurences
// in all the N sentences.
//
// Input Format
// In the first line there is a single integer N. Each of the next N lines contains a
// single sentence. After that, in the next line, there is a single integer T denoting the
// number of words. In the i-th of the next T lines, there is a single word denoting the
// i-th word for which, you have to find the number of its occurences in the sentences.
//
// Output format
// For every word, print the number of occurrences of the word in all the N sentences listed.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String sentences = "";
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<lines; i++){
            sentences += scanner.nextLine() + " ";
        }
        System.err.println(sentences);
        int tests = Integer.parseInt(scanner.nextLine());
        for(int j=0; j<tests; j++){
            String word = scanner.nextLine();
            Pattern p = Pattern.compile("(\\W|\\b)"+word+"(\\W|\\b)");
            System.err.println("word: " + word + " p: " + p);
            int count = 0;
            Matcher m = p.matcher(sentences);
            while(m.find()){
                count++;
            }
            System.out.println(count);
        }
    }
}
