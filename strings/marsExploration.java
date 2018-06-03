// Sami's spaceship crashed on Mars! She sends a series of SOS messages to Earth for help.
//
// Letters in some of the SOS messages are altered by cosmic radiation during transmission.
// Given the signal received by Earth as a string, s, determine how many letters of Sami's
// SOS have been changed by radiation.
//
// Input Format
// There is one line of input: a single string, s.
//

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        int changed = 0;
        for(int i=0; i<s.length(); i++){
            if (i==1 || i%3==1){
                if(s.charAt(i)!='O'){
                    changed++;
                }
            } else if(i==0 || i%3==0 || (i+1)%3==0){
                if(s.charAt(i)!='S'){
                    changed++;
                }
            }
        }
        return changed;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
