// Given a large integer, n, use the Java BigInteger class' isProbablePrime method
// to determine and print whether it's prime or not prime.
// Input Format: A single line containing an integer, n (the number to be checked).
// Constraints: n contains at most 100 digits.
// Output Format: If n is a prime number, print prime; otherwise, print not prime.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      // Write your code here.
      if(n.isProbablePrime(1)){
          System.out.println("prime");
      } else {
          System.out.println("not prime");
      }
   }
}
