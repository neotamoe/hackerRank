// Mary has an n x m piece of paper that she wants to cut into 1 x 1 pieces according to the following rules:
// 1. She can only cut one piece of paper at a time, meaning she cannot fold the paper
// or layer already-cut pieces on top of one another.
// 2. Each cut is a straight line from one side of the paper to the other side of the paper.
//
// Given n and m, find and print the minimum number of cuts Mary must make to cut the 
// paper into n * m squares that are 1 x 1 unit in size.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static long solve(int n, int m) {
        long larger = n>=m ? (long)n : (long)m;
        int smaller = n<=m ? n : m;
        return (larger * smaller)-1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long result = solve(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
