// Louise joined a social networking site to stay in touch with her friends. The signup page
// required her to input a name and a password. However, the password must be strong. The
// website considers a password to be strong if it satisfies the following criteria:
//
// * Its length is at least 6.
// * It contains at least one digit.
// * It contains at least one lowercase English character.
// * It contains at least one uppercase English character.
// * It contains at least one special character. The special characters are: !@#$%^&*()-+
//
// She typed a random string of length n in the password field but wasn’t sure if it was strong.
// Given the string she typed, can you find the minimum number of characters she must add to
// make her password strong?

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        Pattern p = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*\\(\\)\\-\\+])");
        Matcher m = p.matcher(password);
        int charsNeeded = 0;
        if(n>=6 && m.find()){  // found all, length>=6
            return charsNeeded;
        } else {
            boolean uppercaseFound = false;
            boolean lowercaseFound = false;
            boolean numberFound = false;
            boolean specialFound = false;
            for(int i=0; i<password.length(); i++) {
                char ch = password.charAt(i);
                if( Character.isDigit(ch)) {
                    numberFound = true;
                } else if (Character.isUpperCase(ch)) {
                    uppercaseFound = true;
                } else if (Character.isLowerCase(ch)) {
                    lowercaseFound = true;
                } else {
                    specialFound = true;
                }
            }
            if(!specialFound){
                charsNeeded++;
            }
            if(!numberFound){
                charsNeeded++;
            }
            if(!uppercaseFound){
                charsNeeded++;
            }
            if(!lowercaseFound){
                charsNeeded++;
            }
        }
        if(n + charsNeeded < 6){
            return 6-n;
        } else {
            return charsNeeded;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
