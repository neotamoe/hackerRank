// The equivalent of SSN in India is a PAN number, which is unique to each of its citizens. In any of the country’s official documents, the PAN number is listed as follows:
// <char><char><char><char><char><digit><digit><digit><digit><char>
// Your task is to figure out if the PAN number is valid or not. A valid PAN number will have all its letters in uppercase and digits in the same order as listed above.
//
// Input Format
// First line contains N. N lines follow, each having a PAN number.
//
// Constraints
// Each char is an uppercase letter.
// Each digit lies between 0 and 9.
// The length of the PAN number is always 10
// Every character in PAN is either char or digit satisfying the above constraints.
//
// Output Format
// For every PAN number listed, print YES if it is valid and NO if it isn’t.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<n; i++){
            String test = scanner.nextLine();
            Pattern p = Pattern.compile("([A-Z]){5}([0-9]){4}([A-Z]){1}");
            Matcher m = p.matcher(test);
            if(m.find()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
