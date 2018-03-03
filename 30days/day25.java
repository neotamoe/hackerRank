// Day 25: Running Time and Complexity
// A prime is a natural number greater than 1 that has no positive divisors other than
// 1 and itself. Given a number, n, determine and print whether it's Prime or Not prime.
//
// Note: If possible, try to come up with a 0(sqrt(n)) primality algorithm, or see what
// sort of optimizations you come up with for an 0(n) algorithm.

import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i=0; i<testCases; i++){
            int test = sc.nextInt();
            boolean isPrime = false;
            if(test==1){
                System.out.println("Not prime");
            } else if(test==2){
                System.out.println("Prime");
            } else {
                for(int j=2; j<=Math.sqrt(test); j++){
                    if (test%j==0){
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                        continue;
                    }
                }
                if (isPrime){
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }
        }
    }
}
