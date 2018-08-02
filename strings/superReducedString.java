// Steve has a string of lowercase characters in range ascii[‘a’..‘z’]. He wants to reduce
// the string to its shortest length by doing a series of operations. In each operation he
// selects a pair of adjacent lowercase letters that match, and he deletes them. For instance,
// the string aab could be shortened to b in one operation.
//
// Steve’s task is to delete as many characters as possible using this method and print the
// resulting string. If the final string is empty, print Empty String
//
// Complete the superReducedString function in the editor below. It should return the 
// super reduced string or Empty String if the final string is empty.
//
// superReducedString has the following parameter(s)--> s: a string to reduce

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the super_reduced_string function below.
    static String super_reduced_string(String s) {
        StringBuilder sb = new StringBuilder(s);
        // It has the method deleteCharAt(), along with many other mutator methods.
        boolean changed = true;
        while(changed){
            changed = false;
            if(sb.length()==2){
                sb.setLength(0);
                changed=true;
            } else{
                for(int i=0; i<sb.length()-1; i++){
                    if(sb.charAt(i)==sb.charAt(i+1)){
                        sb.delete(i,i+2);
                        changed = true;
                    }
                }
            }

        }
        String resultString = sb.toString();
        resultString = resultString.length()>0 ? resultString : "Empty String";
        return resultString;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = super_reduced_string(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
