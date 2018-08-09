// Watson gives four 3-dimensional points to Sherlock and asks him if they all lie
// in the same plane. Your task here is to help Sherlock.
// 
// Input Format
// First line contains T, the number of testcases.
// Each test case consists of four lines. Each line contains three integers, denoting xi yi zi.
//
// Output Format
// For each test case, print YES or NO whether all four points lie in same plane or not, respectively.

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static String solve(int[][] points) {
        Set xSet = new HashSet<Integer>();
        Set ySet = new HashSet<Integer>();
        Set zSet = new HashSet<Integer>();
        for(int i=0; i<points.length; i++){
            for(int j=0; j<points[i].length; j++){
                if(j==0){
                    xSet.add(points[i][j]);
                } else if (j==1){
                    ySet.add(points[i][j]);
                } else {
                    zSet.add(points[i][j]);
                }
            }
        }
        if(xSet.size()==1 || ySet.size()==1 || zSet.size()==1){
            return "YES";
        } else {
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int[][] points = new int[4][3];

            for (int pointsRowItr = 0; pointsRowItr < 4; pointsRowItr++) {
                String[] pointsRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int pointsColumnItr = 0; pointsColumnItr < 3; pointsColumnItr++) {
                    int pointsItem = Integer.parseInt(pointsRowItems[pointsColumnItr]);
                    points[pointsRowItr][pointsColumnItr] = pointsItem;
                }
            }

            String result = solve(points);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
