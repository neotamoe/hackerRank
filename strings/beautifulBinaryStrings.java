// Alice has a binary string. She thinks a binary string is beautiful if and only if it doesn't
// contain the substring "010".
//
// In one step, Alice can change a 0 to a 1 or vice versa. Count and print the minimum number
// of steps needed to make Alice see the string as beautiful.
//
// For example, if Alice's string is b=010 she can change any one element and have a beautiful string.
//
// Input Format
// The first line contains an integer n, the length of binary string.
// The second line contains a single binary string b.
//
// Output Format
// Print the minimum number of steps needed to make the string beautiful.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {
        int count = 0;
        while(b.contains("010")){
            b = b.replaceFirst("010","011");
            count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String b = scanner.nextLine();

        int result = beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
