// Day 26: Nested Logic

// Your local library needs your help! Given the expected and actual return dates
// for a library book, create a program that calculates the fine (if any). The fee
// structure is as follows:
//
// If the book is returned on or before the expected return date, no fine will be
// charged (i.e.: fine = 0).
// If the book is returned after the expected return day but still within the same
// calendar month and year as the expected return date, fine = 15 Hackos x #ofDaysLate.
// If the book is returned after the expected return month but still within the
// same calendar year as the expected return date, fine = 500 Hackos x #OfMonthsLate.
// If the book is returned after the calendar year in which it was expected, there
// is a fixed fine of 10000 Hackos.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int fine = 0;
        Scanner scanner = new Scanner(System.in);
        int dayActual = scanner.nextInt();
        int monthActual = scanner.nextInt();
        int yearActual = scanner.nextInt();
        int dayExpected = scanner.nextInt();
        int monthExpected = scanner.nextInt();
        int yearExpected = scanner.nextInt();
        if(yearActual<yearExpected){
            fine = 0;
        } else if(yearActual > yearExpected){
            fine = 10000;
        } else if (monthActual > monthExpected){
            fine = 500 * (monthActual - monthExpected);
        } else if (dayActual > dayExpected){
            fine = 15 * (dayActual - dayExpected);
        }
        System.out.println(fine);
    }
}
