// Luke is daydreaming in Math class. He has a sheet of graph paper with n rows and m columns,
// and he imagines that there is an army base in each cell for a total of n*m bases. He wants
// to drop supplies at strategic points on the sheet, marking each drop point with a red dot.
// If a base contains at least one package inside or on top of its border fence, then it’s
// considered to be supplied.
// 
// Given n and m, what’s the minimum number of packages that Luke must drop to supply all of his bases?
//
// Input Format
// Two space-separated integers describing the respective values of n and m.
//
// Output Format
// Print a single integer denoting the minimum number of supply packages Luke must drop.

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the gameWithCells function below.
     */
    static int gameWithCells(int n, int m) {
        if(m%4==0 && n%4==0){
            return (m*n)/4;
        } else if (n%2==0 && m%2==0){
            return (m*n)/4;
        } else if (m==1){
            return n/2 + n%2;
        } else if (n==1){
            return m/2 + m%2;
        }else if((n%2==0 && m%2!=0)){
            return (m/2) * (n/2) + ((m%2)*n)/2;
        }else if (n%2!=0 && m%2==0){
            return (m/2) * (n/2) + ((n%2)*m)/2;
        }else if (n%2!=0 && m%2!=0) {
            int x = (m*n)-(((m/2) *2) * ((n/2) *2));
            return ((n/2) * (m/2)) + (x/2) + (x%2);
        }else {
            return 1;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int result = gameWithCells(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
