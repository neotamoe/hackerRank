// Bob has a strange counter. At the first second, it displays the number 3. Each second,
// the number displayed by the counter decrements by 1 until it reaches 1.
//
// The counter counts down in cycles. In next second, the timer resets to 2 x the
// initial number for the prior cycle and continues counting down.
//
// Find and print the value displayed by the counter at time t.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
        if(t==1){
            return 3;
        } else if (t==2){
            return 2;
        } else if (t==3){
            return 1;
        } else {
            long startCycle = 1;
            long increment = 3;
            while(t>=startCycle+increment){
                startCycle+=increment;
                increment = (increment*2);
            }
            long diff = t-startCycle;
            long startValue = startCycle +2;
            return startValue - diff;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
