// In a galaxy far, far away, on a planet different from ours, each computer username
// uses the following format:
//
// It must begin with either an underscore, _ (ASCII value 95), or a period, . (ASCII value 46).
// The first character must be immediately followed by one or more digits in the range 0 through 9.
// After some number of digits, there must be 0 or more English letters (uppercase and/or lowercase).
// It may be terminated with an optional _ (ASCII value 95). Note that if it’s not terminated with 
// an underscore, then there should be no characters after the sequence of 0 or more English letters.
//
// Given n strings, determine which ones are valid alien usernames. If a string is a valid alien
// username, print VALID on a new line; otherwise, print INVALID.

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
            Pattern p = Pattern.compile("^(\\.|\\_){1}[0-9]+[a-zA-Z]*\\_?$");
            Matcher m = p.matcher(Test_String);
            if(m.find()){
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
