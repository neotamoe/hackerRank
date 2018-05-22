// You are given a sequence of n integers, p(1),p(2),...,p(n). Each element in the sequence
// is distinct and satisfies 1<=p(x)<=n. For each x where 1<=x<=n, find any integer y such
// that p(p(y)) == x and print the value of y on a new line.
//
// For example, assume you have the sequence p=[5,2,1,3,4]. For each value of x between 1
// and 5 we analyze as follows:
//
// x=1 ==p[3],p[4]=3, so p[p[4]]=1
// x=2 ==p[2],p[2]=2, so p[p[2]]=2
// x=3 ==p[4],p[5]=4, so p[p[5]]=3
// x=4 ==p[5],p[1]=5, so p[p[1]]=4
// x=5 ==p[1],p[3]=1, so p[p[3]]=5
// We find the values [4,2,5,1,3] for y.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    static int[] permutationEquation(int[] p) {
        // Complete this function
        List<Integer> pAsList = Arrays.stream(p).boxed().collect(Collectors.toList());
        int[] result = new int[p.length];
        int counter = 1;
        for(int i=0; i<pAsList.size(); i++){
            int temp = (pAsList.indexOf(counter)) + 1;
            System.err.println(temp);
            int temp2 = (pAsList.indexOf(temp)) +1;
            System.err.println(temp2);
            result[i]=temp2;
            counter++;
            System.err.println();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
