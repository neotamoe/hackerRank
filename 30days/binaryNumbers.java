// Day 10: Binary Numbers
// Given a base-10 integer, n, convert it to binary (base-2). Then find and print the
// base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numberToConvert = sc.nextInt();
        String binary = Integer.toBinaryString(numberToConvert);

        int countMax = 0;
        int count = 1;
        for(int i=0; i<binary.length()-1;i++){
            if(binary.charAt(i)=='1' && binary.charAt(i+1)=='1'){
                count++;
            } else if(count>countMax){
                countMax = count;
                count = 1;
            } else {
                count = 1;
            }
        }
        if(count>countMax){
            countMax = count;
        }

        System.out.println(countMax);
    }
}
