// Kristen loves playing with and comparing numbers. She thinks that if she takes two
// different positive numbers, the one whose digits sum to a larger number is better
// than the other. If the sum of digits is equal for both numbers, then she thinks the
// smaller number is better. For example, Kristen thinks that 13 is better than 31
// and that 12 is better than 11.
//
// Given an integer, n, can you find the divisor of n that Kristin will consider to be the best?
// Input Format: A single integer denoting n.
// Output Format:  Print an integer denoting the best divisor of n.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //try test case 100000--> answer should be 625

    static int bestDivisor(int n){
        int bestDivisor = 1;
        if(n<10){
            return n;
        }
        for(int i=1; i<n/2; i++){
            if(n%i==0){
                int divisor1 = i;
                int divisor2 = n/i;
                System.err.println("divisor1: " + divisor1 + " divisor2: " + divisor2);
                System.err.println(calculateSum(divisor1) + " " + calculateSum(divisor2));
                if(calculateSum(divisor1)>calculateSum(bestDivisor)){
                    bestDivisor = divisor1;
                }
                if(calculateSum(divisor2)>calculateSum(bestDivisor)){
                    bestDivisor = divisor2;
                }
                if(calculateSum(divisor1)==calculateSum(bestDivisor)){
                    bestDivisor = divisor1 < bestDivisor ? divisor1 : bestDivisor;
                }
                if(calculateSum(divisor2)==calculateSum(bestDivisor)){
                    bestDivisor = divisor2 < bestDivisor ? divisor2 : bestDivisor;
                }
                System.err.println("current bestDivisor: " + bestDivisor);

            }
        }
        return bestDivisor;
    }

    static int calculateSum(int n){
        if(n<10){
            return n;
        }
        int sum = 0;
        char[] intAsCharArr = ("" + n).toCharArray();

        for(int i=0; i<intAsCharArr.length; i++){
            sum = sum + Character.getNumericValue(intAsCharArr[i]);
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(bestDivisor(n));
        scanner.close();
    }
}
