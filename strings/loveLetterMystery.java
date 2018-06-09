// James found a love letter that his friend Harry has written to his girlfriend.
// James is a prankster, so he decides to meddle with the letter. He changes all the
// words in the letter into palindromes.
//
// To do this, he follows two rules:
//
// He can only reduce the value of a letter by 1, i.e. he can change d to c, but he
// cannot change c to d or d to b.
// The letter a may not be reduced any further.
// Each reduction in the value of any letter is counted as a single operation. Find
// the minimum number of operations required to convert a given string into a palindrome.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
        int count = 0;
        int i = 0;
        int j = s.length() - 1;
        while (j > i) {
            if (s.charAt(i)>(s.charAt(j))) {
                count += s.charAt(i)-(s.charAt(j));
            }
            if(s.charAt(i)<(s.charAt(j))){
                count += Math.abs(s.charAt(j)-(s.charAt(i)));
            }
            i++;
            j--;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
