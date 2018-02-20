// Day 14: Scope
// Complete the Difference class by writing the following:
//
// A class constructor that takes an array of integers as a parameter and saves
// it to the elements instance variable.
// A computeDifference method that finds the maximum absolute difference between
// any 2 numbers in N and stores it in the maximumDifference instance variable.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
	private int[] elements;
	public int maximumDifference;
  // Add your code here
  Difference(int[] elements){
      this.elements = elements;
  }

  public void computeDifference() {
      int max = Arrays.stream(elements).max().getAsInt();
      int min = Arrays.stream(elements).min().getAsInt();
      maximumDifference = max - min;
  }
} // End of Difference class

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }
    sc.close();

    Difference difference = new Difference(a);

    difference.computeDifference();

    System.out.print(difference.maximumDifference);
  }
}
