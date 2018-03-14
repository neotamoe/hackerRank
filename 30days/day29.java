// SETUP: Given set S={1,2,3,...,N}. Find two integers, A and B (where A<B), from set S such
// that the value of is the maximum possible and also less than a given integer, K. In this
// case, & represents the bitwise AND operator.
//
// INPUT: The first line contains an integer, T, the number of test cases.
// Each of the T subsequent lines defines a test case as 2 space-separated integers,
// N and K, respectively.
//
// TASK: For each test case, print the maximum possible value of A&B on a new line.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for(int i=0; i<times; i++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int max = 0;
            for(int a=1; a<=n; a++) {
                for(int b=a+1; b<=n; b++) {
                    int val = a&b;
                    if(val>max && val<k) {
                        max = val;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
