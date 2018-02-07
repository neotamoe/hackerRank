// Java Loops I
// Given an integer, N , print its first 10 multiples. Each multiple N x i (where 1<=N<=10) should be printed on a new line in the form: N x i = result.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1; i<11; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
