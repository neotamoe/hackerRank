// TASK: Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
// OUTPUT: On the first line, print an integer, n, denoting the number of tokens in string s
// (they do not need to be unique). Next, print each of the n tokens on a new line
// in the same order as they appear in input string s.

import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int count = 0;
        if(s.trim().length()==0){
            System.out.println(count);
        } else {
            String[] splits = s.trim().split("[\\s.!,?_'@]+");
            System.out.println(splits.length);
            for(int i=0; i<splits.length; i++){
                System.out.println(splits[i]);
            }
        }
        scan.close();
    }
}
