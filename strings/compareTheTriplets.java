// Alice and Bob each created one problem for HackerRank. A reviewer rates the two
// challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity,
// originality, and difficulty.

// We define the rating for Alice's challenge to be the triplet A=(a0, a1, a2), and
// the rating for Bob's challenge to be the triplet B=(b0, b1, b2).

// Your task is to find their comparison points by comparing a0 with b0, a1 with b1, and c0 with c1.
// Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
      // Complete this function
      int Alice = 0;
      int Bob = 0;
      int[] result = new int[2];
      if(a0>b0){
          Alice++;
      } else if(a0<b0){
          Bob++;
      }
      if(a1>b1){
          Alice++;
      } else if (a1<b1){
          Bob++;
      }
      if(a2>b2){
          Alice++;
      } else if(a2<b2){
          Bob++;
      }
      result[0] = Alice;
      result[1] = Bob;
      return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a0 = in.nextInt();
    int a1 = in.nextInt();
    int a2 = in.nextInt();
    int b0 = in.nextInt();
    int b1 = in.nextInt();
    int b2 = in.nextInt();
    int[] result = solve(a0, a1, a2, b0, b1, b2);
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
    }
    System.out.println("");

  }
}
