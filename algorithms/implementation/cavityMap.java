// You are given a square map as a matrix of integer strings. Each cell of the map has a
// value denoting its depth. We will call a cell of the map a cavity if and only if this
// cell is not on the border of the map and each cell adjacent to it has strictly smaller
// depth. Two cells are adjacent if they have a common side, or edge.
//
// Find all the cavities on the map and replace their depths with the uppercase character X.
//
// For example, given a matrix:
// 989
// 191
// 111
//
// You should return:
// 989
// 1X1
// 111
//
// The center cell was deeper than those on its edges: [8,1,1,1]. The deep cells in the
// top two corners don't share an edge with the center cell.
//
// Function Description
// Complete the cavityMap function in the editor below. It should return an array of
// strings, each representing a line of the completed map.
//
// cavityMap has the following parameter(s):
// grid: an array of strings, each representing a row of the grid
//
// Input Format
// The first line contains an integer n, the number of rows and columns in the map.
//
// Each of the following n lines (rows) contains n positive digits without spaces (columns)
// representing depth at map[row,column].
//
// Output Format
// Output n lines, denoting the resulting map. Each cavity should be replaced with the character X.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
        String[] result = new String[grid.length];
        result[0] = grid[0];
        result[grid.length-1] = grid[grid.length-1];
        for(int i=1; i<grid.length-1; i++){
            StringBuffer sb = new StringBuffer("");
            sb.append(grid[i].charAt(0));
            for(int j=1; j<grid[i].length()-1; j++){

                int it = Character.getNumericValue(grid[i].charAt(j));
                int right = Character.getNumericValue(grid[i].charAt(j+1));
                int left = Character.getNumericValue(grid[i].charAt(j-1));
                int up = Character.getNumericValue(grid[i-1].charAt(j));
                int down = Character.getNumericValue(grid[i+1].charAt(j));
                if(it>right && it>left && it>up && it>down){
                    sb.append("X");
                } else {
                    sb.append(grid[i].charAt(j));
                }

            }
            sb.append(grid[i].charAt(grid[i].length()-1));
            result[i] = sb.toString();
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
