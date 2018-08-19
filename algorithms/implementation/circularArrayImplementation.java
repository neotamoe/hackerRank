// John Watson knows of an operation called a right circular rotation on an array of integers.
// One rotation operation moves the last array element to the first position and shifts all
// remaining elements right one. To test Sherlock's abilities, Watson provides Sherlock with
// an array of integers. Sherlock is to perform the rotation operation a number of times then 
// determine the value of the element at a given position.
//
// For each array, perform a number of right circular rotations and return the value of
// the element at a given index.
//
// Function Description
//
// Complete the circularArrayRotation function in the editor below. It should return an array
// of integers representing the values at the specified indices.
//
// circularArrayRotation has the following parameter(s):
//   * a: an array of integers to rotate
//   * k: an integer, the rotation count
//   * queries: an array of integers, the indices to report
//
// Input Format
// The first line contains 3 space-separated integers, n, k, and q, the number of elements in the integer array, the rotation count and the number of queries.
// The second line contains n space-separated integers, where each integer i describes array element a[i] (where 0<=i<n).
// Each of the q subsequent lines contains a single integer denoting m, the index of the element to return from a.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        for(int i = 0; i < q; i++){
            int index = scanner.nextInt();
            if(index-(k%n)>=0){
                System.out.println(a[index-(k%n)]);
            }else {
                System.out.println(a[n-(Math.abs(index-(k%n)))]);
            }
        }

        scanner.close();
    }
}
