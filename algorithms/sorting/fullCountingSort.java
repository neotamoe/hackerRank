// In this challenge you need to print the string that accompanies each integer in a list sorted by the integers.
// If two strings are associated with the same integer, they must be printed in their original order so your
// sorting algorithm should be stable. There is one other twist. The first half of the strings encountered
// in the inputs are to be replaced with the character "-" (dash).
//
// Input Format
//
// The first line contains n, the number of integer/string pairs in the array ar. 
// Each of the next n contains x[i] and s[i], the integers with their associated strings.
//
// Constraints
// n is even
// s[i] consists of characters in the range ascii[a-z]
//
// Output Format
// Print the strings in their correct order, space-separated on one line.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Map;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<Integer, ArrayList<String>> multiMap = new HashMap<>();
        for (int nItr = 0; nItr < n; nItr++) {
            String[] xs = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xs[0]);
            String s = "";
            if(nItr<n/2){
                s = "-";
            } else {
                s = xs[1];
            }
            if(multiMap.containsKey(x)){
                ArrayList<String> strings = multiMap.get(x);
                strings.add(s);
                multiMap.put(x,strings);
            } else {
                ArrayList<String> strings = new ArrayList();
                strings.add(s);
                multiMap.put(x,strings);
            }
        }

        String result = "";
        for (Map.Entry<Integer, ArrayList<String>> entry : multiMap.entrySet()) {
            result += String.join(" ", entry.getValue()) + " ";
        }
        System.out.println(result);
        scanner.close();
    }
}
