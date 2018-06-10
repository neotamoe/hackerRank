// We say that a string contains the word hackerrank if a subsequence of its characters
// spell the word hackerrank. For example, if string s=haacckkerrannkk it does contain
// hackerrank, but s=haacckkerannk does not. In the second case, the second r is missing.
// If we reorder the first string as hccaakkerrannkk, it no longer contains the subsequence
// due to ordering.
// For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        char[] hackerrankCharArr = hackerrank.toCharArray();
        int charArrCounter = 0;
        String result = "NO";
        int stringCounter = 0;
        if(s.length()<10){
            return result;
        } else {
            for(int i=0; i<s.length(); i++){

                if(s.charAt(i)==hackerrankCharArr[charArrCounter]){
                    charArrCounter++;
                    if(charArrCounter==10){
                        return result = "YES";
                    }
                }
            }

        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
