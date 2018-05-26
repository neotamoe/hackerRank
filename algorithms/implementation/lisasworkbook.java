// Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters.
// Lisa believes a problem to be special if its index (within a chapter) is the same as the page
// number where it's located. The format of Lisa's book is as follows:
//
// There are n chapters in Lisa's workbook, numbered from 1 to n.
// The ith chapter has arr[i] problems, numbered from 1 to arr[i].
// Each page can hold up to k problems. Only a chapter's last page of exercises may contain fewer than k problems.
// Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
// The page number indexing starts at 1.
//
// Given the details for Lisa's workbook, can you count its number of special problems?
//
// For example, Lisa's workbook contains arr[1]=4 problems for chapter 1, and arr[2]
// problems for chapter 2. Each page can hold k=3 problems. The first page will hold 3
// problems for chapter 1. Problem 1 is on page 1, so it is special. Page 2 contains 
// only Chapter 1, Problem 4, so no special problem is on page 2. Chapter 2 problems
// start on page 3 and there are 2 problems. Since there is no problem 3 on page 3,
// there is no special problem on that page either. There is 1 special problem in
// her workbook.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
        // n = chapters; k = up to k problems per page; arr[i] = number of problems in chapter
        int special = 0;
        int page = 1;
        for(int i=1; i<n+1; i++){  // iterate through chapters
            for(int j=1; j<(arr[i-1])+1; j++){  // iterate through problems in chapter
                if(j==page){
                    special++;
                }
                if(j%k==0 || j==arr[i-1]){
                    page++;
                }
            }
        }
        return special;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
