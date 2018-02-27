// Day 20: Sorting
// Given an array, a, of size n distinct elements, sort the array in ascending order
// using the Bubble Sort algorithm. Once sorted, print the following 3 lines:
// Print the following three lines of output:
// Array is sorted in numSwaps swaps.
// where numSwaps is the number of swaps that took place.
// First Element: firstElement
// where  is the first element in the sorted array.
// Last Element: lastElement
// where  is the last element in the sorted array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numSwaps = 0;
        int totalSwaps = 0;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numSwaps++;
                }
            }
            if(numSwaps == 0){
                break;
            } else {
                totalSwaps += numSwaps;
                numSwaps = 0;
            }
        }
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
