Martha is interviewing at Subway. One of the rounds of the interview requires
her to cut a bread of size l x b into smaller identical pieces such that each
piece is a square having maximum possible side length with no left over piece of bread.

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the restaurant function below.
     */
    static int restaurant(int l, int b) {
        if(l==b){
            return 1;
        }
        int larger = l>=b ? l : b;
        int smaller = l<=b ? l : b;
        int largestDivisor = 1;
        for(int i=1; i<larger; i++){
            if(l%i==0 && b%i==0){
                if(i>largestDivisor){
                    largestDivisor = i;
                }
            }
        }

        return (l*b)/(largestDivisor*largestDivisor);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] lb = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int l = Integer.parseInt(lb[0]);

            int b = Integer.parseInt(lb[1]);

            int result = restaurant(l, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
