// A new identification number is given for every Citizen of the Country Utopia and it has the following format.
//
// The string must begin with between 0-3 (inclusive) lowercase letters.
// Immediately following the letters, there must be a sequence of digits (0-9). The length of this segment must be between 2 and 8, both inclusive.
// Immediately following the numbers, there must be atleast 3 uppercase letters.
//
// Your task is to find out if a given identification number is valid or not.  Print VALID or INVALID.
//
// Input Format
// The first line contains N, N lines follow each line containing an identification number.

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
            Pattern p = Pattern.compile("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}$");
            Matcher m = p.matcher(Test_String);
            if(m.find()){
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
