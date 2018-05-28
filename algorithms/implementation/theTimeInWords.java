// Given the time in numerals we may convert it into words, as shown below:
//
// At minutes=0, use o' clock. For 1<=minutes<=30, use past, and for 30<minutes use to.
// Note the space between the apostrophe and clock in o' clock. Write a program which
// prints the time in words for the input given in the format described.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String timeString = "";
        boolean after30flag = false;
        if(m>30 && m<60){
            m=60-m;
            h+=1;
            after30flag = true;
        }
        String minuteString="";
        switch (m) {
            case 1:  minuteString = "one";
                     break;
            case 2:  minuteString = "two";
                     break;
            case 3:  minuteString = "three";
                     break;
            case 4:  minuteString = "four";
                     break;
            case 5:  minuteString = "five";
                     break;
            case 6:  minuteString = "six";
                     break;
            case 7:  minuteString = "seven";
                     break;
            case 8:  minuteString = "eight";
                     break;
            case 9:  minuteString = "nine";
                     break;
            case 10:  minuteString = "ten";
                     break;
            case 11:  minuteString = "eleven";
                     break;
            case 12:  minuteString = "twelve";
                     break;
            case 13:  minuteString = "thirteen";
                     break;
            case 14:  minuteString = "fourteen";
                     break;
            case 16:  minuteString = "sixteen";
                     break;
            case 17:  minuteString = "seventeen";
                     break;
            case 18:  minuteString = "eighteen";
                     break;
            case 19:  minuteString = "nineteen";
                     break;
            case 20:  minuteString = "twenty";
                     break;
            case 21:  minuteString = "twenty one";
                     break;
            case 22:  minuteString = "twenty two";
                     break;
            case 23:  minuteString = "twenty three";
                     break;
            case 24:  minuteString = "twenty four";
                     break;
            case 25:  minuteString = "twenty five";
                     break;
            case 26:  minuteString = "twenty six";
                     break;
            case 27:  minuteString = "twenty seven";
                     break;
            case 28:  minuteString = "twenty eight";
                     break;
            case 29:  minuteString = "twenty nine";
                     break;
        }

        String hourString="";
        switch (h) {
            case 1:  hourString = "one";
                     break;
            case 2:  hourString = "two";
                     break;
            case 3:  hourString = "three";
                     break;
            case 4:  hourString = "four";
                     break;
            case 5:  hourString = "five";
                     break;
            case 6:  hourString = "six";
                     break;
            case 7:  hourString = "seven";
                     break;
            case 8:  hourString = "eight";
                     break;
            case 9:  hourString = "nine";
                     break;
            case 10:  hourString = "ten";
                     break;
            case 11:  hourString = "eleven";
                     break;
            case 12:  hourString = "twelve";
                     break;
        }

        if(m==0){
            return timeString += hourString + " o' clock";
        } else if (m==1){
            return timeString += "one minute past " + hourString;
        } else if (m==15 && !after30flag){
            return timeString += "quarter past " + hourString;
        } else if (m==30){
            return timeString += "half past " + hourString;
        } else if (m==15 && after30flag) {
            // h+=1;
            return timeString += "quarter to " + hourString;
        } else if (after30flag){
            // h+=1;
            return timeString += minuteString + " minutes to " + hourString;
        } else if (m>0 && m<30){
            return timeString += minuteString + " minutes past " + hourString;
        }
        return timeString;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
