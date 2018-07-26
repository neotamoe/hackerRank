// At the annual meeting of Board of Directors of Acme Inc, every one starts shaking hands
// with everyone else in the room. Given the fact that any two persons shake hand exactly once,
// Can you tell the total count of handshakes?
//
// Input Format
// The first line contains the number of test cases T, T lines follow.
// Each line then contains an integer N, the total number of Board of Directors of Acme.
//
// Output Format
// Print the number of handshakes for each test-case in a new line.
//
// Constraints
//   * 1 <= T <= 1000
//   * 0 < N < 106

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the handshake function below.
     */
    static int handshake(int n) {
        int count = 0;
        if (n==0 || n==1){
            return 0;
        } else {
            int temp = n;
            for(int i=1; i<n; i++){
                count += (temp-1);
                temp--;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = handshake(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
