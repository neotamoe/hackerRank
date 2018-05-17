// Your local library needs your help! Given the expected and actual return dates for
// a library book, create a program that calculates the fine (if any).
// The fee structure is as follows:
//
// If the book is returned on or before the expected return date, no fine will be
// charged (i.e.: fine = 0).
// If the book is returned after the expected return day but still within the same
// calendar month and year as the expected return date, fine = 15 x number of days late.
// If the book is returned after the expected return month but still within the same
// calendar year as the expected return date, the fine = 500 x number of months late.
// If the book is returned after the calendar year in which it was expected, there
// is a fixed fine of 10000.
// Charges are based only on the least precise measure of lateness. For example,
// whether a book is due January 1, 2017 or December 31, 2017, if it is returned
// January 1, 2018, that is a year late and the fine would be 10000.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if(y1 > y2){
            fine = 10000;
        } else if (y1 == y2 && m1 > m2){
            fine = 500 * (m1-m2);
        } else if (y1==y2 && m1==m2) {
            if(d1<d2){
                fine = 0;
            } else {
                fine = (d1-d2) * 15;
            }
        }
        return fine;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] d1M1Y1 = scanner.nextLine().split(" ");

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = scanner.nextLine().split(" ");

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
